package com.xmkj.applibrary.domain.recruit;

import com.xmkj.applibrary.domain.pet.PetCategoryList;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

@Data

public class JobCategoryList implements Serializable{
    private int level;
    private int state;
    private boolean hotCategory;


    private String categoryId;
    private String id;
    private String name;
    private String categoryKey;
    private String parentId;
    private boolean isSelect;



    private List<JobCategoryList> children;
}
