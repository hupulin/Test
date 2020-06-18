package com.xmkj.applibrary.domain.recruit;

import lombok.Data;

@Data
public class IntentionTo {
    private int jobIntentionId;//
    private String careerCategoryParent;//



    private String careerCategory;//职位类型key
    private String careerCategoryName;//职位类型name
    private int workNature;//工作性质
    private int minMonthlySalary;//最低月薪
    private int maxMonthlySalary;//最高月薪
    private int intentionState;//工作状态

    private String expectedCity;//意向城市code
    private String expectedCityName;//意向城市code
}
