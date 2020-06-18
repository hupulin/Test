package com.xmkj.applibrary.api;

import com.xmkj.applibrary.domain.MessageTo;
import com.xmkj.applibrary.domain.login.BannerTo;
import com.xmkj.applibrary.domain.login.ErrorTo;
import com.xmkj.applibrary.domain.login.JpushRegisterParam;
import com.xmkj.applibrary.domain.login.LoginParam;
import com.xmkj.applibrary.domain.login.SmsLoginParam;
import com.xmkj.applibrary.domain.login.WeChatInfo;
import com.xmkj.applibrary.domain.login.WeChatLoginParam;
import com.xmkj.applibrary.domain.login.WeChatParam;
import com.xmkj.applibrary.domain.myself.ChangePasswordParam;

import java.util.List;

import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;
import rx.Observable;

public interface LoginApi {


    @POST("learner/login")
    Observable<MessageTo> smsLogin(@Body SmsLoginParam param);
    /**
     * 微信信息
     */
    @POST("wechat/auth/mobile-login")
    Observable<WeChatInfo> weChatInfo(@Body WeChatParam param);
    /**
     * 微信登录
     */
    @POST("wechat/auth/mobile-register")
    Observable<WeChatInfo> weChatLogin(@Body WeChatLoginParam param);

    @GET("error-code")
    Observable<List<ErrorTo>> getErrorCode();
    /**
     * 极光注册
     */
    @POST("app/push/open")
    Observable<MessageTo> jpushRegister(@Body JpushRegisterParam param);
    /**
     * 极光注销
     */
    @POST("app/push/close")
    Observable<MessageTo> jpushUnRegister(@Body JpushRegisterParam param);
    /**
     * 密码登录
     *
     * @param
     * @return
     */
    @POST("learner/login-pwd")
    Observable<MessageTo> passwordLogin(@Body SmsLoginParam param);

    //请求验证码
    @POST("sms/verifycode/{type}")
    Observable<MessageTo> requestCode(@Path("type") String type, @Body LoginParam params);

    //请求修改密码的验证码
    @GET("auth/mobile/change-pwd-code")
    Observable<MessageTo> requestVerifycode();
    //修改密码
    @POST("auth/mobile/change-pwd")
    Observable<MessageTo> changePassword( @Body ChangePasswordParam params);

    //获取广告
    @GET("advertisement/query")
    Observable<List<BannerTo>> getAD(@Query("appKey") String appKey);
}
