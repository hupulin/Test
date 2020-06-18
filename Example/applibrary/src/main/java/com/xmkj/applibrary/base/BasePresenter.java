package com.xmkj.applibrary.base;

import android.content.Intent;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.miot.android.listener.MiotPlatformUIListener;
import com.miot.android.platform.MiotlinkPlatform;
import com.xmkj.applibrary.MainApp;
import com.xmkj.applibrary.R;
import com.xmkj.applibrary.domain.ErrorInfoHelper;
import com.xmkj.applibrary.domain.login.ErrorTo;
import com.xmkj.applibrary.util.Event;
import com.xmkj.applibrary.util.LoadingDialog;
import com.xmkj.applibrary.util.MD5;
import com.xmkj.applibrary.util.NetWorkUtil;

import org.greenrobot.eventbus.EventBus;
import org.json.JSONObject;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import okhttp3.ResponseBody;
import retrofit2.HttpException;


/**
 * Created by Administrator on 2018/9/3.
 **/

public class BasePresenter<T> implements MiotPlatformUIListener {
    protected BaseActivity activity;
    protected BaseFragment mFragment;
    protected UserInfoHelp userInfoHelp = new UserInfoHelp();
    protected UserInfoTo userInfoTo;
    private LoadingDialog loadingDialog;
    private boolean canDismiss;
    private String rawString = "";
    protected int recyclePageIndex = 1;
    private List<T> dataList;
    public MiotlinkPlatform miotlinkPlatform = null;

    protected String code;



    protected void showMessage(String message) {
        dismissLoadingDialog();
        if (message == null)
            message = "";
        Toast.makeText(MainApp.appContext, message, Toast.LENGTH_LONG).show();
    }

    protected void submitDataSuccess(Object data) {
        dismissLoadingDialog();
        if (activity != null)
            activity.submitDataSuccess(data);
        else
            mFragment.submitDataSuccess(data);
    }

    protected void getDataSuccess(T data) {
        dismissLoadingDialog();
        if (activity != null)
            activity.loadDataSuccess(data);
        else
            mFragment.loadDataSuccess(data);
    }

    protected void getListDataSuccess(List<T> data) {
        activity.loadDataSuccess(data);

    }

    protected void initContext(BaseActivity activity) {
        this.activity = activity;
        userInfoTo = userInfoHelp.getUserInfo();
        miotlinkPlatform = MiotlinkPlatform.getInstance(MainApp.getInstance());
        miotlinkPlatform.setMiotPlatformUIListener(this);
        NetWorkUtil.isNetConnected(activity);
        if(!  NetWorkUtil.isNetConnected(activity)){
            Toast.makeText(activity,"当前网络不可用，请稍后重试",Toast.LENGTH_LONG).show();
        }

    }

    protected void initContext(BaseFragment fragment) {
        this.mFragment = fragment;
        userInfoTo = userInfoHelp.getUserInfo();
        miotlinkPlatform = MiotlinkPlatform.getInstance(MainApp.getInstance());
        miotlinkPlatform.setMiotPlatformUIListener(this);
        if(!  NetWorkUtil.isNetConnected(fragment.getActivity())){
            Toast.makeText(fragment.getActivity(),"当前网络不可用，请稍后重试",Toast.LENGTH_LONG).show();
        }
    }


    public void showLoadingDialog() {
        canDismiss = false;
        if (loadingDialog == null)
            loadingDialog = new LoadingDialog(activity == null ? mFragment.getActivity() : activity, "", R.drawable.loading_animation);
        if (!loadingDialog.isShowing()) {
            loadingDialog.setCanceledOnTouchOutside(false);
            loadingDialog.show();
            loadingDialog.setOnDismissListener(dialog -> {
                if (!canDismiss && activity != null) {
                    activity.finish();
                }
            });
        }
    }

    public void dismissLoadingDialog() {
        canDismiss = true;
        if (loadingDialog != null)
            loadingDialog.dismiss();
    }

    public void recycleViewLoadMore() {
        recyclePageIndex = recyclePageIndex + 1;
    }

    public void recycleViewRefresh() {
        recyclePageIndex = 1;
        if (mFragment != null)
            mFragment.mRecycleView.scrollToPosition(0);
        else
            activity.mRecycleView.scrollToPosition(0);
    }

    public void recycleItemClick(View view, int position) {
        if (activity != null)
            activity.recycleItemClick(view, position, dataList.get(position));
        else
            mFragment.recycleItemClick(view, position, dataList.get(position));
    }

    public void setRecycleList(List dataList) {
        this.dataList = dataList;
        if (activity == null) {
            mFragment.mRecycleView.refreshComplete(10);
            mFragment.baseAdapter.setList(dataList);

            if (dataList != null && dataList.size() - 10 * recyclePageIndex < 0)
                mFragment.mRecycleView.setNoMore(true);
            else
                mFragment.mRecycleView.setNoMore(false);

            mFragment.baseAdapter.notifyDataSetChanged();


//                mFragment.setNoData(dataList==null||dataList.size()==0);


        } else {
            activity.mRecycleView.refreshComplete(10);
            activity.baseAdapter.setList(dataList);
            Log.i("8888", "setRecycleList: "+dataList.size());
            if (dataList != null && dataList.size() - 10 * recyclePageIndex < 0)
                activity.mRecycleView.setNoMore(true);
            else
                activity.mRecycleView.setNoMore(false);
            activity.baseAdapter.notifyDataSetChanged();

            if (recyclePageIndex == 1) {
                activity.mRecycleView.smoothScrollToPosition(0);

            }
//                activity.setNoData(dataList==null||dataList.size()==0);
        }
    }

    public void setRecycleList(List dataList, boolean isStart) {
        this.dataList = dataList;
        if (activity == null) {
            mFragment.mRecycleView.refreshComplete(10);
            mFragment.baseAdapter.setList(dataList);
            if (dataList != null && dataList.size() - 10 * (recyclePageIndex) < 0)
                mFragment.mRecycleView.setNoMore(true);
            else {
                mFragment.mRecycleView.setNoMore(false);

            }
            mFragment.baseAdapter.notifyDataSetChanged();
            if (recyclePageIndex == 1) {
                activity.mRecycleView.smoothScrollToPosition(0);

            }
        } else {

            activity.mRecycleView.refreshComplete(10);
            activity.baseAdapter.setList(dataList);
            if (dataList != null && dataList.size() - 10 * (recyclePageIndex) < 0)
                activity.mRecycleView.setNoMore(true);
            else
                activity.mRecycleView.setNoMore(false);
            Log.i("123123", "onNext: 11222221");

            activity.baseAdapter.notifyDataSetChanged();
            if (recyclePageIndex == 1) {
                activity.mRecycleView.smoothScrollToPosition(0);

            }
        }
    }

    public void setRecycleListFragment(List dataList) {

        this.dataList = dataList;
        mFragment.baseAdapter.setList(dataList);
        mFragment.mRecycleView.refreshComplete(0);
        mFragment.baseAdapter.notifyDataSetChanged();
    }

    public void setRecycleListActivity(List dataList) {
        this.dataList = dataList;
        activity.baseAdapter.setList(dataList);
        activity.baseAdapter.notifyDataSetChanged();
    }

    public String getHashStringNoUser(Class clazz, Object object) {
        rawString = "";

        userInfoTo = userInfoHelp.getUserInfo();


        Map<String, String> map = new HashMap<>();
        Field[] fs = clazz.getDeclaredFields();
        for (int i = 0; i < fs.length; i++) {
            Field field = fs[i];
            field.setAccessible(true);
            String valString;
            try {
                if (field.get(object) == null) {
                    valString = "";
                } else {
                    valString = field.get(object).toString();
                }

                if (!"serialVersionUID".equals(field.getName()) && !"$change".equals(field.getName()) && !"time".equals(field.getName()) && !"apiId".equals(field.getName()) && !"terminal".equals(field.getName()) && !"hash".equals(field.getName()))
                    map.put(field.getName(), valString);
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        map.put("client_time", System.nanoTime() + "");
        Collection<String> keyset = map.keySet();
        List list = new ArrayList<>(keyset);
        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
            if (i == (list.size() - 1)) {

                rawString += list.get(i) + map.get(list.get(i));

            } else {

                rawString += list.get(i) + map.get(list.get(i));

            }
        }


        rawString = rawString + "staUEpB54OUS08X9LxY4ze71zpQNfy44NXEz";

        System.out.println(rawString + "===========");
        return MD5.getMD5(rawString);
    }


    @Override
    public void onReceiverDevice(String s, String s1) throws Exception {

    }

    @Override
    public void onReceiverDeviceState(String s, String s1, String s2) throws Exception {

    }

    @Override
    public void serverDisconnected(int i, String s, String s1) throws Exception {

    }

    @Override
    public void onLogot(String s) throws Exception {

    }

    public void showErrorMsg(Throwable e) {
        if (e instanceof HttpException) {
            ResponseBody body = ((HttpException) e).response().errorBody();
            try {
                code = getValue(body.string(), "code");
//                Log.i("22222", "showErrorMsg: "+code);

            } catch (IOException e1) {
                e1.printStackTrace();
            }
//            Log.i("22222", "showErrorMsg:+++ "+ErrorInfoHelper.mList.size());
            if (Integer.parseInt(code)==1005 || Integer.parseInt(code)== 1021) {
               SpUtil.put("Token", "");
//                if (activity != null){
//                    Intent intent = new Intent(this, LoginActivity.class);
//                activity.startActivity(intent);
//                }
//
//
//                else{
//                Intent intent = new Intent(this, LoginActivity.class);
//                mFragment.startActivity(intent);
//                }
                return;

            }
//                    pc.tipErro();
            }
//        Log.i("22222", "showErrorMsg:接口错了 ");
            for (ErrorTo mode : ErrorInfoHelper.mList) {
                if (mode.getCode().equals(code)) {
                    showMessage(mode.getMessage());
                }
            }

    }

    /**
     * 获取json中的某个值
     *
     * @param json
     * @param key
     * @return
     */
    public String getValue(String json, String key) {
        try {
            JSONObject object = new JSONObject(json);
            return object.getString(key);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
