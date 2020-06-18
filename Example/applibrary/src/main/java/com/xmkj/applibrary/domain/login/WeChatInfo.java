package com.xmkj.applibrary.domain.login;

import lombok.Data;

@Data
public class WeChatInfo {

    /**
     * weChatUserIdentifier :
     * state :
     * weChatTempIdentifier :
     * token :
     */
    private String weChatUserIdentifier;//微信用户标识
    private int state;
    private String weChatTempIdentifier;//微信登录临时凭据
    private String token;

}
