package com.xmkj.applibrary.domain.login;

import lombok.Data;

@Data
public class SmsLoginParam {
    private     String phoneNumber;
    private     String verifyCode;
    private     String password;

}
