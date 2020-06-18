package com.xmkj.applibrary.domain.recruit;

import lombok.Data;

@Data
public class RecruitMyDataTo {

    /**
     * applicationCount : 1
     * InterviewCount : 1
     * favoriteJob : 1
     * headUrl :
     * fullname :
     * intentionState : 1
     */
    private int applicationCount;
    private int interviewCount;
    private int favoriteJob;
    private String headUrl;
    private String fullname;
    private String intentionState;


}
