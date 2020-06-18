package com.xmkj.applibrary.domain.myself;

import lombok.Data;

@Data
public class ChangePasswordParam {
    private String verifyCode;
    private String password;
}
