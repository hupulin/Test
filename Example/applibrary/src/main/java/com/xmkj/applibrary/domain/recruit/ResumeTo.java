package com.xmkj.applibrary.domain.recruit;

import java.util.List;

import lombok.Data;

@Data
public class ResumeTo {


    /**
     * birthday : 1575518753
     * gender : 2
     * jobIntention : {"careerCategoryName":"宠物销售/市场","expectedCityName":"安阳市","minMonthlySalary":1000,"maxMonthlySalary":10000,"jobIntentionId":"82","careerCategoryParent":"3000-","careerCategory":"3000-3437-","expectedCity":"410500","workNature":2,"intentionState":2}
     * startWorkTime : 1575267266
     * headUrl : https://tabaooss.oss-cn-beijing.aliyuncs.com/191011990016923.jpg
     * lastModifyOn : 1577765157
     * educationExperienceList : [{"qualification":1,"major":"宠物摄影师","endTimeStr":"2020.02","startTimeStr":"2019.12","startTime":"1575376688","educationExperienceId":"169","endTime":"1581334674","schoolName":"关山口职业技术学院","qualificationName":"初中及以下"}]
     * userId : 188
     * workYearStr : 2个月
     * workExperienceList : [{"jobName":"厂长","addOn":"1577765168","workContent":"协助保定，体格检查，采样采血，皮下注射，埋静脉留置针，输液监护，卫生消毒，辅助医生看诊沟通\n复核处方，配药化验，抓药熬制，仪器维护，药品商品库存管理，药物耗材采购，卫生消毒等；","companyName":"派多格武汉教育","endTimeStr":"2020.01","startTimeStr":"2019.10","startTime":"1571045583","endTime":"1577883911","companyIndustryName":"医药生物|医疗保健","workExperienceId":"168","companyIndustry":10}]
     * qualificationName : 大专
     * selfDescription : 本人性格开朗、稳重、有活力，待人热情、真诚。
     * 有很强的专业的职业道德，专业基础知识扎实。
     * 工作认真负责，主动承担责任，
     * 积极与周围工作环境建立良好的工作关系，
     * 并具有一定的资源协调能力。
     * 与同事，其它部门各极配合，
     * 有较强的组织能力、实际动手能力和团体协作精神。
     * 能迅速的适应各种环境，并融合其中。
     * <p>
     * qualification : 4
     * lastModifyOnStr : 6天前
     * resumeId : 81
     * attachmentList : []
     * tel : 17733128395
     * fullname : 曹雨兴
     * birthdayStr : 2019.12.05
     * age : 0
     */
    private String birthday;
    private int gender;
    private String startWorkTime;
    private String headUrl;
    private String lastModifyOn;
    private String userId;
    private String workYearStr;
    private List<EducationExperienceListEntity> educationExperienceList;//教育经历列表
    private JobIntentionEntity jobIntention; //求职意向

    private List<WorkExperienceListEntity> workExperienceList;//工作经历列表
    private List<AttachmentListEntity> attachmentList;

    private String qualificationName;
    private String selfDescription;
    private int qualification;
    private String lastModifyOnStr;
    private String resumeId;
    private String tel;
    private String fullname;
    private String birthdayStr;
    private int age;
    private boolean favorite;


    @Data
    public class JobIntentionEntity {
        /**
         * careerCategoryName : 宠物销售/市场
         * expectedCityName : 安阳市
         * minMonthlySalary : 1000
         * maxMonthlySalary : 10000
         * jobIntentionId : 82
         * careerCategoryParent : 3000-
         * careerCategory : 3000-3437-
         * expectedCity : 410500
         * workNature : 2
         * intentionState : 2
         */
        private String careerCategoryName;
        private String expectedCityName;
        private int minMonthlySalary;
        private int maxMonthlySalary;
        private String jobIntentionId;
        private String careerCategoryParent;
        private String careerCategory;
        private String expectedCity;
        private int workNature;
        private int intentionState;


    }

    @Data
    public class EducationExperienceListEntity {
        /**
         * qualification : 1
         * major : 宠物摄影师
         * endTimeStr : 2020.02
         * startTimeStr : 2019.12
         * startTime : 1575376688
         * educationExperienceId : 169
         * endTime : 1581334674
         * schoolName : 关山口职业技术学院
         * qualificationName : 初中及以下
         */
        private int qualification;
        private String major;
        private String endTimeStr;
        private String startTimeStr;
        private String startTime;
        private String educationExperienceId;
        private String endTime;
        private String schoolName;
        private String qualificationName;


    }

    @Data
    public class AttachmentListEntity {
private String fileUrl;
    }
    @Data
    public class WorkExperienceListEntity {
        /**
         * jobName : 厂长
         * addOn : 1577765168
         * workContent : 协助保定，体格检查，采样采血，皮下注射，埋静脉留置针，输液监护，卫生消毒，辅助医生看诊沟通
         * 复核处方，配药化验，抓药熬制，仪器维护，药品商品库存管理，药物耗材采购，卫生消毒等；
         * companyName : 派多格武汉教育
         * endTimeStr : 2020.01
         * startTimeStr : 2019.10
         * startTime : 1571045583
         * endTime : 1577883911
         * companyIndustryName : 医药生物|医疗保健
         * workExperienceId : 168
         * companyIndustry : 10
         */
        private String jobName;
        private String addOn;
        private String workContent;
        private String companyName;
        private String endTimeStr;
        private String startTimeStr;
        private String startTime;
        private String endTime;
        private String companyIndustryName;
        private String workExperienceId;
        private int companyIndustry;


    }
}
