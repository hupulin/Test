package com.xmkj.applibrary.domain.login;

import lombok.Data;

@Data
public class JpushRegisterParam {
    private int pushChannel=1;
    private String deviceRegistrationId;
}
