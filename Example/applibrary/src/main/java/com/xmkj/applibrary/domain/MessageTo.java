package com.xmkj.applibrary.domain;


import android.text.TextUtils;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.List;

import lombok.Data;

/**
 * Created by Administrator on 2018/9/1.
 */
@Data
public class MessageTo<T> {

    /**
     * Code : 000000
     * Msg : 返回成功
     * Time : 2018-08-30 16:08:20
     * ApiUrl : http://xmap18070031.php.hzxmnet.com/api/Sms/sendcode
     * Data : {"mobile":"13738084633","sms_code":"637442"}
     */

    private int statue;
    private int code;
    private String errorMsg;
    private String msg;
    private String data ;
    private String result ;
    private String message ;

    @Data

    private class ErrorMessage{

        /**
         * data :
         * resultCode : 2001
         * errorMsg : 用户名或密码错误
         */
        private String data;
        private String resultCode;
        private String errorMsg;

    }


    public String getError(){
        String message="";

        System.out.println(msg+"msg============");
        if (TextUtils.isEmpty(msg.trim())||"fail".equals(msg)){

            return "请检查网络连接";
        }
        List<ErrorMessage>messageLis=new Gson().fromJson(msg,new TypeToken<List<ErrorMessage>>(){}.getType());
        if (messageLis!=null&&messageLis.size()>0)
            message=messageLis.get(0).getErrorMsg();
        return message;
    }

}
