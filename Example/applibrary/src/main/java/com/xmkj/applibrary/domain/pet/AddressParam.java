package com.xmkj.applibrary.domain.pet;

import lombok.Data;

@Data
public class AddressParam {
    private boolean defaultAddress;//是否默认地址
    private String consignee;//收货人姓名
    private String contactNumber;//收货人电话
    private String provinceCode;//省编号
    private String cityCode;//城市编号
    private String areaCode;//地区编号
    private String address;//地区地址
    private String expressAddressId;//地区地址
}
