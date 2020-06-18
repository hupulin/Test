package com.xmkj.applibrary.domain.pet;

import lombok.Data;

@Data
public class PetListTo {


    /**
     * thumbnail :
     * cityCode :
     * linePrice : 1
     * sellerName :
     * commodityId : 1
     * commodityCategoryName :
     * commodityCategoryKey :
     * upTime : 1
     * sellerId : 1
     * cityName :
     * shopActualSales : 1
     * price : 1
     * sellerType : 1
     * newCommodity : false
     * joinPlatformPromotion : false
     * stockCount : 1
     */
    private String thumbnail;
    private String cityCode;
    private String linePrice;
    private String sellerName;
    private String commodityId;
    private String commodityCategoryName;
    private String commodityCategoryKey;
    private long upTime;
    private String sellerId;
    private String cityName;
    private int shopActualSales;
    private String price;
    private int sellerType;
    private boolean newCommodity;
    private boolean joinPlatformPromotion;
    private int stockCount;

    public String getPrice() {
        return "￥" + price.substring(0, price.length() - 2);

    }

    public String getLinePrice() {
        if(linePrice==null||"0".equals(linePrice)){
            return "";
        }
        return "￥" + linePrice.substring(0, linePrice.length() - 2);
    }

}
