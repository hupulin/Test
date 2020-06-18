package com.xmkj.applibrary.domain.myself;

import lombok.Data;

@Data
public class CouponTo {


    /**
     * useEndTime : 1569772800
     * couponName : 开业大酬宾满减优惠
     * couponAmount : 20000
     * useStartTime : 1569513600
     * sellerName : 丁丁的店铺
     * limitOrderAmount : 20000
     * state : 4
     * type : 2
     */
    private long useEndTime;
    private String couponName;
    private int couponAmount;
    private long useStartTime;
    private String sellerName;
    private int limitOrderAmount;
    private int state;
    private int type;


}
