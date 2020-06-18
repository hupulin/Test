package com.xmkj.applibrary.domain.pet;

import lombok.Data;

@Data
public class ReloadInfoTo {

    /**
     * allow : false
     * refreshAmount : 1
     * reasonCode :
     * freeRefreshNum : 1
     */
    private boolean allow;
    private int refreshAmount;
    private String reasonCode;
    private int freeRefreshNum;


}
