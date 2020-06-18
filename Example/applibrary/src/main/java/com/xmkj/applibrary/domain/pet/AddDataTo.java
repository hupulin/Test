package com.xmkj.applibrary.domain.pet;

import lombok.Data;

@Data
public class AddDataTo {

    /**
     * allow : false
     * remainMallPromotionNum : 1
     * remainNum : 1
     * reasonCode :
     */
    private boolean allow;
    private int remainMallPromotionNum;
    private int remainNum;
    private String reasonCode;

}
