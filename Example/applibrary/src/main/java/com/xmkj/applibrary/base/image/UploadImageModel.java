package com.xmkj.applibrary.base.image;

import android.graphics.Bitmap;
import android.util.Log;

import com.alibaba.fastjson.JSON;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.xmkj.applibrary.api.ApiClient;
import com.xmkj.applibrary.api.MyselfApi;
import com.xmkj.applibrary.base.BasePresenter;
import com.xmkj.applibrary.base.MyObserver;
import com.xmkj.applibrary.base.SpUtil;
import com.xmkj.applibrary.domain.MessageTo;
import com.xmkj.applibrary.util.ImageCompressUtil;

import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;


/**
 * Created by xzz on 2018/5/17.
 **/

public class UploadImageModel extends BasePresenter {

    private ArrayList<String> imagePaths;
    private int uploadCount = 0;
    private UploadImageListener listener;
    private String pathKey;
    private String pathString;
    private List<String> keyRecordList = new ArrayList<>();


    private byte[] Bitmap2Bytes(Bitmap bm) {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        bm.compress(Bitmap.CompressFormat.PNG, 100, baos);
        return baos.toByteArray();
    }


    public void uploadImageHead(ArrayList<String> imagePathList, UploadImageListener listener) {
        pathKey = "";
//        MultipartBody.Builder builder = new MultipartBody.Builder().setType(MultipartBody.FORM);
        //表单类型
//        builder.addFormDataPart("token", SpUtil.getString("Token"));

        for (int i = 0; i < imagePathList.size(); i++) {
            String imagePath = imagePathList.get(i);
            Log.i("3333" ,"uploadImageHead: "+ imagePathList.get(i));
            if (!imagePath.startsWith("http")) {
                keyRecordList.clear();
                File file = saveBitmapFile(ImageCompressUtil.compressPixel(imagePath), imagePath);
                RequestBody requestFile = RequestBody.create(MediaType.parse("multipart/form-data"), file);
                MultipartBody.Part body = MultipartBody.Part.createFormData("file", file.getName(), requestFile);
                ApiClient.create(MyselfApi.class).uploadImage(body).observeOn(AndroidSchedulers.mainThread()).subscribeOn(Schedulers.newThread()).subscribe(
                        new MyObserver<MessageTo>(this) {
                            @Override
                            public void onNext(MessageTo msg) {
                                uploadCount++;
                                pathKey = pathKey + msg.getResult() + ";";
                                if (uploadCount == imagePathList.size()) {
                                    listener.uploadImageSuccess(pathKey.substring(0, pathKey.length() - 1));
                                }

                            }


                        }

                );
//                RequestBody imageBody = RequestBody.create(MediaType.parse("multipart/form-data"), file);
//                builder.addFormDataPart("file[" + i + "]", file.getName(), imageBody);
            }
        }
//        List<MultipartBody.Part> parts = builder.build().parts();


    }


    //
    public static File saveBitmapFile(Bitmap bitmap, String filepath) {
        File file = new File(filepath);//将要保存图片的路径
        try {
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(file));
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, bos);
            bos.flush();
            bos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return file;
    }


}
