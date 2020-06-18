package com.xmkj.applibrary;

import android.app.Application;
import android.content.Context;
import android.support.multidex.MultiDex;

import com.miot.android.BindService;
import com.xmkj.applibrary.api.ApiClient;
import com.xmkj.applibrary.util.FileUtil;




/**
 * Created by xzz on 2018/8/14.
 **/

public class MainApp extends Application {
    public static Context appContext;
    public static MainApp instance = null;

    @Override
    public void onCreate() {
        super.onCreate();
        appContext = this;
//        MultiDex.install(this);
        ApiClient.getInstance().init(this);

        BindService.getInstance(this).startBind(2,this.getPackageName());
        instance=this;


    }

    public static MainApp getInstance() {
        if (instance == null) {
            try {
                throw new Exception("MiotApplication is null ");
            } catch (Exception e) {
                e.printStackTrace();

            }
        }
        return instance;
    }

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this);
    }


    public static String getCacheImagePath() {
        return FileUtil.getSdCardPath();
    }


}
