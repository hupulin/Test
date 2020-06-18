package com.xmkj.applibrary.domain.pet;

import lombok.Data;

@Data
public class PetFavoriteTo {



    /**
     * thumbnail :
     * cityCode :
     * linePrice : 1
     * commodityId : 1
     * commodityFavoriteId : 1
     * sellerId : 1
     * cityName :
     * price : 1
     * sellerType : 1
     * joinPlatformPromotion : false
     * commodityName :
     * actualSales : 1
     * stockCount : 1
     */
    private String thumbnail;
    private String cityCode;
    private int linePrice;
    private int commodityId;
    private int commodityFavoriteId;
    private int sellerId;
    private String cityName;
    private int price;
    private int sellerType;
    private int state;
    private boolean joinPlatformPromotion;
    private String commodityCategoryName;
    private int actualSales;
    private int stockCount;
    private boolean check;

}
