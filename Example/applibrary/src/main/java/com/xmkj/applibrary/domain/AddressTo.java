package com.xmkj.applibrary.domain;

import java.io.Serializable;

import lombok.Data;

@Data
public class AddressTo implements Serializable {
    /**
     * consignee :
     * address :
     * expressAddressId : 1
     * contactNumber :
     * defaultAddress : false
     */
    private String consignee="非肥大壮";
    private String address="额" +
            "光谷梦工厂2号楼808室2号楼808室厂2";
    private int expressAddressId;
    private String contactNumber="18758168587";
    private boolean defaultAddress;


    /**
     * areaCode :
     * consignee :
     * address :
     * cityName :
     * expressAddressId : 1
     * areaName :
     * provinceCode :
     * cityCode :
     * contactNumber :
     * provinceName :
     * defaultAddress : false
     */
    private String areaCode;
    private String cityName="岳阳市";
    private String areaName="岳阳县";
    private String provinceCode;
    private String cityCode;
    private String provinceName="湖南省";


}
