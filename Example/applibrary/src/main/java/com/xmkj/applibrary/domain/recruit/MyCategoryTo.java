package com.xmkj.applibrary.domain.recruit;

import java.io.Serializable;

import lombok.Data;

@Data
public class MyCategoryTo implements Serializable {

    /**
     * categoryKey :
     * categoryName :
     * categoryId : 1
     */
    private String categoryKey;
    private String categoryName;
    private String categoryId;
    private int parentIndex;
    private int index;
    private int indexSelf;


}
