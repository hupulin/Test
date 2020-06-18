package com.xmkj.applibrary.domain.recruit;

import lombok.Data;

/**
 * 学历：（1-初中及以下，2-中专/中技，3-高中，4-大专，5-本科，6-硕士，7-博士，8-其他）
 * 工作年限：（1：经验不限，2：1年以下，3：1-3年，4：3-5年，5：5-7年，6：7-10年，7：10年以上）
 */

@Data
public class ReleaseJobParam {
    private String jobId;//职位id

    private String jobName;//职位名称
    private String careerCategoryParent;//职位类别父级Key
    private String careerCategory;//职位类别
    private int workYears;//学历 code
    private int qualification;//工作年限 code
    private int minMonthlySalary;// 最低月薪
    private int maxMonthlySalary;// 最高月薪
    private String description;// 职位描述
    private String benefits;// 福利待遇，ID用逗号连接
    private String provinceCode;//省编码
    private String cityCode;//市编码
    private String areaCode;//区编码
    private String address;//详细地址






}
