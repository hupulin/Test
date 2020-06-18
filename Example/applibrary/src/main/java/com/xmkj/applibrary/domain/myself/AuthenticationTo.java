package com.xmkj.applibrary.domain.myself;

import lombok.Data;

@Data
public class AuthenticationTo {



    private ResultEntity result;

    @Data


    public class ResultEntity {
        /**
         * ownerPhoneNumber : 18758168587
         * addTime : 1573200355
         * cityCode : 420100
         * shopName : 峡谷柔情
         * businessLicenseImage : https://tabaooss.oss-cn-beijing.aliyuncs.com/191108990003442.jpg
         * idCardImage : https://tabaooss.oss-cn-beijing.aliyuncs.com/191108990003325.jpg
         * ownerId : 71
         * openingBank : 建设
         * mergerName : 湖北省武汉市黄陂区
         * appId : 4
         * contact : 儿童劫
         * contactNumber : 18758168588
         * state : 2
         * bankNumber : 85666
         * address : 他现在
         * provinceCode : 420000
         * owerName : null
         * areaCode : 420116
         * auditUserId : 1
         * auditUserName : null
         * shopCertificationId : 72
         * auditTime : 1573200374
         * idCardNumber : 42669874
         * auditComment : null
         * certifyMethod : 2
         */
        private String ownerPhoneNumber;
        private long addTime;
        private String cityCode;
        private String shopName;
        private String businessLicenseImage;
        private String idCardImage;
        private int ownerId;
        private String openingBank;
        private String mergerName;
        private int appId;
        private String contact;
        private String contactNumber;
        private int state;
        private String bankNumber;
        private String address;
        private String provinceCode;
        private String provinceName;
        private String cityName;
        private String areaName;
        private String owerName;
        private String areaCode;
        private int auditUserId;
        private String auditUserName;
        private int shopCertificationId;
        private int auditTime;
        private String idCardNumber;
        private String auditComment;
        private int certifyMethod;


    }
}
