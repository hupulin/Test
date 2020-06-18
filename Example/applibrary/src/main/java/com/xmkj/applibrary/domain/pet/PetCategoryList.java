package com.xmkj.applibrary.domain.pet;

import java.util.List;

import lombok.Data;

@Data
public class PetCategoryList {
    /**
     * sorted : 100
     * level : 1
     * name : 活体
     * state : 5
     * hotCategory : true
     * commodityCategoryId : 1001
     * parentId : -1
     * commodityCategoryKey : 1001-
     */
    private int sorted;
    private int level;
    private String name;
    private int state;
    private boolean hotCategory;
    private String commodityCategoryId;
    private String parentId;
    private String commodityCategoryKey;
    private List<PetCategoryList> children;

}
