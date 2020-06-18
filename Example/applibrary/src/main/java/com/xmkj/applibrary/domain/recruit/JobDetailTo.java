package com.xmkj.applibrary.domain.recruit;

import java.util.List;

import lombok.Data;

@Data
public class JobDetailTo {
    /**
     * benefits : 2,4,6,8,10,12,14,16,18,20,22,24
     * applied : 2
     * cityCode : 420100
     * groupId : 208
     * maxMonthlySalary : 7000
     * description : 岗位职责：
     门诊：协助保定，体格检查，采样采血，皮下注射，埋静脉留置针，输液监护，卫生消毒，辅助医生看诊沟通；
     药房：复核处方，配药化验，抓药熬制，仪器维护，药品商品库存管理，药物耗材采购，卫生消毒等；
     住院：住院动物的日常护理，传染病动物的输液护理监护，X光拍摄，手术包打包消毒，跟诊手术，卫生清洁等；
     任职资格：宠物护理专业毕业，大专及以上学历，有一定工作经验的可放宽学历，无不良嗜好；有意愿在宠物医疗护理上长期发展的。
     工作时间：早班9:00-18:00,晚班12:00-21:00，急诊除外，每周休息一天。
     晋升通道：初级助理-中级助理-主管（高级）助理-见习医生-住院医生-主治医生-主任医生
     * careerCategoryParent : 3000-3417-
     * careerCategory : 3000-3417-3421-
     * qualificationName : 中专/中技
     * careerCategoryName : 饲养员
     * chatCount : 0
     * cityName : 武汉市
     * top : false
     * areaName : 江岸区
     * company : {"attachementList":[{"subCategory":"1","fileUrl":"https://t.focus-img.cn/sh900x675esh/xf/xc/95d2ef84c965fbee9509f6432393c746.jpg,https://t.focus-img.cn/sh900x675esh/xf/xc/e76aa2be8556a977b76562d26f7dff5d.jpg,https://t.focus-img.cn/sh900x675esh/xf/xc/cdce047d6b6c3a89364dbd0868806f53.jpg","attachmentId":"7798","category":"company","referenceId":"21"}],"companyLogo":"https://tabaooss.oss-cn-beijing.aliyuncs.com/logo_cxb_320.png","groupId":"208","companyName":"它宝智能事业19部","contact":"王小二","introduction":"它宝智能是中国领先的互联网技术公司, 于2018创立"}
     * state : 1
     * jobName : 1事业部诚聘饲养员，待遇从优
     * applicationCount : 0
     * workYears : 1
     * address : 当代梦工厂807
     * addOn : 1577240496
     * provinceCode : 420000
     * minMonthlySalary : 1000
     * lastModifyOn : 1577240496
     * benefitNameList : [{"benefitTagId":"2","benefitName":"通讯补贴"},{"benefitTagId":"4","benefitName":"年终分红"},{"benefitTagId":"6","benefitName":"带薪年假"},{"benefitTagId":"8","benefitName":"周末双休"},{"benefitTagId":"10","benefitName":"年终奖金"},{"benefitTagId":"12","benefitName":"免费培训"},{"benefitTagId":"14","benefitName":"旅游奖励，包吃"},{"benefitTagId":"16","benefitName":"餐补"},{"benefitTagId":"18","benefitName":"年度旅游"},{"benefitTagId":"20","benefitName":"高温补贴"},{"benefitTagId":"22","benefitName":"弹性工作"},{"benefitTagId":"24","benefitName":"定期体检"}]
     * jobId : 268
     * qualification : 2
     * areaCode : 420102
     * lastModifyOnStr : 1天前
     * pageViews : 0
     * provinceName : 湖北省
     */
    private String benefits;
    private int applied;
    private String cityCode;
    private String groupId;
    private int maxMonthlySalary;
    private String description;
    private String careerCategoryParent;
    private String careerCategory;
    private String qualificationName;
    private String workYearsName;
    private String careerCategoryName;
    private int chatCount;
    private String cityName;
    private boolean top;
    private boolean favorite;
    private String areaName;
    private CompanyEntity company;
    private int state;
    private String jobName;
    private int applicationCount;
    private int workYears;
    private String address;
    private String addOn;
    private String provinceCode;
    private int minMonthlySalary;
    private String lastModifyOn;
    private List<BenefitNameListEntity> benefitNameList;
    private String jobId;
    private int qualification;
    private String areaCode;
    private String lastModifyOnStr;
    private int pageViews;
    private String provinceName;


    @Data

    public class CompanyEntity {
        /**
         * attachementList : [{"subCategory":"1","fileUrl":"https://t.focus-img.cn/sh900x675esh/xf/xc/95d2ef84c965fbee9509f6432393c746.jpg,https://t.focus-img.cn/sh900x675esh/xf/xc/e76aa2be8556a977b76562d26f7dff5d.jpg,https://t.focus-img.cn/sh900x675esh/xf/xc/cdce047d6b6c3a89364dbd0868806f53.jpg","attachmentId":"7798","category":"company","referenceId":"21"}]
         * companyLogo : https://tabaooss.oss-cn-beijing.aliyuncs.com/logo_cxb_320.png
         * groupId : 208
         * companyName : 它宝智能事业19部
         * contact : 王小二
         * introduction : 它宝智能是中国领先的互联网技术公司, 于2018创立
         */
        private List<AttachementListEntity> attachementList;
        private String companyLogo;
        private String groupId;
        private String companyName;
        private String contact;
        private String introduction;

    @Data

        public class AttachementListEntity {
            /**
             * subCategory : 1
             * fileUrl : https://t.focus-img.cn/sh900x675esh/xf/xc/95d2ef84c965fbee9509f6432393c746.jpg,https://t.focus-img.cn/sh900x675esh/xf/xc/e76aa2be8556a977b76562d26f7dff5d.jpg,https://t.focus-img.cn/sh900x675esh/xf/xc/cdce047d6b6c3a89364dbd0868806f53.jpg
             * attachmentId : 7798
             * category : company
             * referenceId : 21
             */
            private String subCategory;
            private String fileUrl;
            private String attachmentId;
            private String category;
            private String referenceId;


        }
    }
    @Data

    public class BenefitNameListEntity {
        /**
         * benefitTagId : 2
         * benefitName : 通讯补贴
         */
        private String benefitTagId;
        private String benefitName;


    }
}
