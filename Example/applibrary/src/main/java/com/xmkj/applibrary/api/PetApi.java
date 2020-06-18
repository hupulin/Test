package com.xmkj.applibrary.api;

import com.xmkj.applibrary.domain.AddressTo;
import com.xmkj.applibrary.domain.MessageTo;
import com.xmkj.applibrary.domain.pet.AddDataTo;
import com.xmkj.applibrary.domain.pet.AddPetParam;
import com.xmkj.applibrary.domain.pet.AddressParam;
import com.xmkj.applibrary.domain.pet.ExpressTo;
import com.xmkj.applibrary.domain.pet.FollowShopTo;
import com.xmkj.applibrary.domain.pet.HomeMainDataTo;
import com.xmkj.applibrary.domain.pet.MainCityTo;
import com.xmkj.applibrary.domain.pet.Param;
import com.xmkj.applibrary.domain.pet.PetAndShopTo;
import com.xmkj.applibrary.domain.pet.PetCategoryList;
import com.xmkj.applibrary.domain.pet.PetDetailTo;
import com.xmkj.applibrary.domain.pet.PetFavoriteTo;
import com.xmkj.applibrary.domain.pet.PetListTo;
import com.xmkj.applibrary.domain.pet.PetMainDataTo;
import com.xmkj.applibrary.domain.pet.PetManageTo;
import com.xmkj.applibrary.domain.pet.PetOrderParam;
import com.xmkj.applibrary.domain.pet.PetOrderTo;
import com.xmkj.applibrary.domain.pet.ReleasedLimitTo;
import com.xmkj.applibrary.domain.pet.ReloadInfoTo;
import com.xmkj.applibrary.domain.pet.ShipTo;
import com.xmkj.applibrary.domain.pet.ShopDetailTo;
import com.xmkj.applibrary.domain.pet.ShopEvaluateTo;
import com.xmkj.applibrary.domain.pet.ShopGoodsTo;
import com.xmkj.applibrary.domain.pet.ShopListTo;
import com.xmkj.applibrary.domain.pet.ReceivedCouponParam;
import com.xmkj.applibrary.domain.pet.PayInfo;

import java.util.List;
import java.util.Map;

import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;
import rx.Observable;

public interface PetApi {
    /**
     * 新增活体
     */
    @POST("pet/app")
    Observable<MessageTo> addPet(@Body AddPetParam param);
    /**
     * 新增活体
     */
    @PUT("pet/app/{commodityId}")
    Observable<MessageTo> editPet(@Path("commodityId") String commodityId,@Body AddPetParam param);
    /**
     * 获取热门城市
     */
    @GET("city/hot")
    Observable<List<MainCityTo>> getHotCityList();

    /**
     * 搜索宠物和店铺
     */
    //
    @GET("buyer/pet-home/query")
    Observable<PetAndShopTo> searchPet(@Query("queryParam") String queryParam);

    /**
     * 获取淘宠首页数据
     */
    @GET("buyer/pet-home")
    Observable<PetMainDataTo> getPetMainDataTo();
    /**
     * 获取淘宠首页数据
     */
    @GET("buyer/app-home")
    Observable<HomeMainDataTo> getHomeMainDataTo();

    /**
     * 获取宠物详情
     */
    @GET("mall/app/{commodityId}")
    Observable<PetDetailTo> getPetDetails(@Path("commodityId") String commodityId);

    /**
     * 获取店铺详情
     */
    @GET("shop/app/{shopId}")
    Observable<ShopDetailTo> getShopDetail(@Path("shopId") String shopId);

    /**
     * 收藏宠物
     */
    @POST("commodity-favorite/{commodityId}")
    Observable<MessageTo> favoritePet(@Path("commodityId") String commodityId);

    /**
     * 收藏店铺
     */
    @POST("store-favorite/{sellerId}")
    Observable<MessageTo> favoriteShop(@Path("sellerId") String sellerId);
    /**
     * 取消店铺收藏
     */
    @POST("store-favorite/deletes")
    Observable<MessageTo> deleteFavoriteShop(@Body Param param);

    /**
     * 领取优惠券
     */
    @POST("coupon/received/app")
    Observable<MessageTo> receivedCoupon(@Body ReceivedCouponParam param);

    /**
     * 获取商品列表数据
     */
    @GET("mall/app/page")
    Observable<List<PetListTo>> getGoodList(@QueryMap Map<String, String> queryParams);

    /**
     * 获取店铺列表数据
     */
    @GET("shop/app/page")
    Observable<ShopListTo> getShopList(@QueryMap Map<String, String> queryParams);

    /**
     * 获取宠物所有分类
     */
    @GET("commodity/category/tree")
    Observable<List<PetCategoryList>> getPetCategory(@Query("key") String key, @Query("state") int state);


    /**
     * 后台--平台发货方式
     */
    @GET("shipping-method")
    Observable<ShipTo> getShipPrice();

    /**
     * 获取地址列表
     */
    @GET("express-address/my")
    Observable<List<AddressTo>> getAddressList();

    /**
     * 编辑地址
     */
    @PUT("express-address/{expressAddressId}")
    Observable<MessageTo> editAddress(@Path("expressAddressId") String expressAddressId, @Body AddressParam param);

    /**
     * 新增加地址
     */
    @POST("express-address")
    Observable<MessageTo> addAddress(@Body AddressParam param);

    /**
     * 删除地址
     */
    @DELETE("express-address/{expressAddressId}")
    Observable<MessageTo> deleteAddress(@Path("expressAddressId") String expressAddressId);

    /**
     * 获取收藏列表
     */
    @GET("commodity-favorite")
    Observable<List<PetFavoriteTo>> getPetFavorite();

    /**
     * 获取店铺评价
     */
    @GET("order-evaluation/app/page")
    Observable<ShopEvaluateTo> getGoodsEvaluate(@QueryMap Map<String, String> queryParams);


    /**
     * 店铺收藏列表
     */
    @GET("store-favorite")
    Observable<List<FollowShopTo>> getShopFollow();

    /**
     * 取消商品收藏
     */
    @POST("commodity-favorite/deletes")
    Observable<MessageTo> deleteFavorite(@Body Param param);

    /**
     * 获取订单信息
     */
    @POST("order/prepay")
    Observable<PetOrderTo> getPetOrder(@Body PetOrderParam param);

    /**
     * 支付 回调
     */
    @POST("order")
    Observable<PayInfo> pay(@Body PetOrderParam param);
    /**
     * 订单号支付
     *
     */
    @POST("order/prepay/{orderNo}")
    Observable<PayInfo> payOrder(@Path("orderNo") String orderNo,@Body PetOrderParam param);
    /**
     * 取消店铺收藏
     */
    @POST("store-favorite/deletes")
    Observable<MessageTo> deleteShopFavorite(@Body Param param);

    /**
     * 商品查询（for app商品管理）
     */
    @GET("pet/app/page")
    Observable<ShopGoodsTo> getShopGoodList(@QueryMap Map<String, String> queryParams);

    /**
     * 商品下架（删除）
     */
    @PUT("pet/{commodityId}/down")
    Observable<ShopGoodsTo> deleteShopGoods(@Path("commodityId") String commodityId);

    /**
     * 商品顶贴（顶贴）
     */
    @PUT("pet/app/{commodityId}/refresh")
    Observable<ShopGoodsTo> reloadShopGoods(@Path("commodityId") String commodityId);

    /**
     * 判断是否可顶贴接口
     */
    @GET("pet/app/allow-refresh")
    Observable<ReloadInfoTo> canReload();
    /**
     * 发布限制信息
     */
    @GET("pet/app/platform-limit")
    Observable<List<ReleasedLimitTo>> releasedLimit();
    /**
     * 发布信息
     */
    @GET("pet/app/allow-add-num")
    Observable<AddDataTo> getAddData();
    /**
     * 宠物详情 商品管理
     */
    @GET("pet/app/{commodityId}")
    Observable<PetManageTo> getPetData(@Path("commodityId") String commodityId);
}
