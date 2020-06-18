package com.xmkj.applibrary.domain.login;

import lombok.Data;

@Data
public class WeChatLoginParam {
    private  String mobile;
    private  String verifyCode;
    private  String weChatTempIdentifier;

}
