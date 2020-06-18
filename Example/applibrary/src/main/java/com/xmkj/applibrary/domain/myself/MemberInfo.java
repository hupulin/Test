package com.xmkj.applibrary.domain.myself;

import java.io.Serializable;

import lombok.Data;

@Data
public class MemberInfo implements Serializable {


    /**
     * latestShopCertification : {"bankNumber":"","address":"","addTime":"","shopName":"","businessLicenseImage":"","idCardImage":"","openingBank":"","mergerName":"","contact":"","contactNumber":"","idCardNumber":"","state":"","certifyMethod":""}
     * nickname :
     * mobile :
     * shopName :
     * hasShop : false
     * groupAuthKey :
     * shopId : 1
     * sellerType : 1
     * headPic :
     */
    private LatestShopCertificationEntity latestShopCertification;
    private String nickname;
    private String mobile;

//    public int getCertificationState() {
//        return 64 ;
//    }

    private String shopName;
    private boolean hasShop;
    private String groupAuthKey;
    private int shopId;
    private int sellerType;
    private String headPic;
    private int certificationState;
    @Data
    public class LatestShopCertificationEntity implements Serializable {
        /**
         * bankNumber :
         * address :
         * addTime :
         * shopName :
         * businessLicenseImage :
         * idCardImage :
         * openingBank :
         * mergerName :
         * contact :
         * contactNumber :
         * idCardNumber :
         * state :
         * certifyMethod :
         */
        private String bankNumber;
        private String address;
        private String addTime;
        private String shopName;
        private String businessLicenseImage;
        private String idCardImage;
        private String openingBank;
        private String mergerName;
        private String contact;
        private String contactNumber;
        private String idCardNumber;
        private String state;


        private String auditComment;
        private int certifyMethod;


    }
}
