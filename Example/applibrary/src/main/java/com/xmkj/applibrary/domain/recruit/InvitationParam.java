package com.xmkj.applibrary.domain.recruit;

import lombok.Data;

@Data
public class InvitationParam {
    private String userId;
    private String jobId;
    private String contactPhoneNumber;
    private String provinceCode;
    private String cityCode;
    private String areaCode;
    private String address;
    private long interviewTime;
}
