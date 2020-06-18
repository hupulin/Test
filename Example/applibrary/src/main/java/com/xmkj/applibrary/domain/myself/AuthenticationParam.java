package com.xmkj.applibrary.domain.myself;

import lombok.Data;

@Data
public class AuthenticationParam {
    private String shopName;//店铺名称
    private String contact;//店主姓名
    private String contactNumber;//联系电话
    private String idCardNumber;//身份证号码
    private String provinceCode;//
    private String cityCode;//
    private String areaCode;//
    private String address;//详细地址
    private String idCardImage;//身份证图片
    private String businessLicenseImage;//营业执照图片
    private String openingBank;//开户银行
    private String bankNumber;//银行账号
    private int certifyMethod;//认证方式：1-个人 2-商户
}
