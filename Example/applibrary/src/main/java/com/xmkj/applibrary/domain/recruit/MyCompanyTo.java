package com.xmkj.applibrary.domain.recruit;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

@Data
public class MyCompanyTo implements Serializable{

    /**
     * benefits : 1,3,5,6
     * companyScale : 1
     * address : 当代梦工厂807
     * addOn : 1577417089
     * companyLogo : https://tabaooss.oss-cn-beijing.aliyuncs.com/android-app.png
     * provinceCode : 420000
     * cityCode : 420100
     * groupId : 225
     * companyName : 胡普林测试
     * benefitTags : [{"benefitTagId":"1","addOn":"1576649783","benefitName":"五险一金"},{"benefitTagId":"3","addOn":"1576649783","benefitName":"年底双薪"},{"benefitTagId":"5","addOn":"1576649784","benefitName":"加班补助"},{"benefitTagId":"6","addOn":"1576649784","benefitName":"带薪年假"}]
     * completed : true
     * contactJob : HRBP
     * companyId : 38
     * areaCode : 420102
     * cityName : 武汉市
     * areaName : 江岸区
     * attachementList : []
     * contact : 胡普林
     * companyNature : 1
     * certified : false
     * contactPhoneNumber : 13812345678
     * provinceName : 湖北省
     * state : 1
     * introduction : 它宝智能是中国领先的互联网技术公司, 于2018创立
     */
    private String benefits;
    private int companyScale;
    private String address;
    private String addOn;
    private String companyLogo;
    private String provinceCode;
    private String cityCode;
    private String groupId;
    private String companyName;
    private List<BenefitTagsEntity> benefitTags;
    private boolean completed;
    private String contactJob;
    private String companyId;
    private String areaCode;
    private String cityName;
    private String areaName;
    //    private List<?> attachementList;
    private String contact;
    private int companyNature;
    private boolean certified;
    private String contactPhoneNumber;
    private String provinceName;
    private int state;
    private String introduction;


    @Data
    public class BenefitTagsEntity implements Serializable {
        /**
         * benefitTagId : 1
         * addOn : 1576649783
         * benefitName : 五险一金
         */
        private String benefitTagId;
        private String addOn;
        private String benefitName;


    }
}
