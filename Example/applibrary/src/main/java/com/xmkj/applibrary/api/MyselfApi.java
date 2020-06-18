package com.xmkj.applibrary.api;

import com.xmkj.applibrary.domain.MessageTo;
import com.xmkj.applibrary.domain.main.CourseToDetailTo;
import com.xmkj.applibrary.domain.myself.AccountTo;
import com.xmkj.applibrary.domain.myself.AppVersionTo;
import com.xmkj.applibrary.domain.myself.AuthenticationParam;
import com.xmkj.applibrary.domain.myself.AuthenticationTo;
import com.xmkj.applibrary.domain.myself.BuyCourseParam;
import com.xmkj.applibrary.domain.myself.CashOutOrderTo;
import com.xmkj.applibrary.domain.myself.CashOutParam;
import com.xmkj.applibrary.domain.myself.ChangeMyInfoParam;
import com.xmkj.applibrary.domain.myself.ChangeShopParam;
import com.xmkj.applibrary.domain.myself.ChargeOrderTo;
import com.xmkj.applibrary.domain.myself.ChargeTo;
import com.xmkj.applibrary.domain.myself.CommissionDataTo;
import com.xmkj.applibrary.domain.myself.CommissionListTo;
import com.xmkj.applibrary.domain.myself.CommissionTo;
import com.xmkj.applibrary.domain.myself.CouponMainTo;
import com.xmkj.applibrary.domain.myself.ExchangeParam;
import com.xmkj.applibrary.domain.myself.HistoryTo;
import com.xmkj.applibrary.domain.myself.MemberInfo;
import com.xmkj.applibrary.domain.myself.MemberParam;
import com.xmkj.applibrary.domain.myself.MemberSellerTo;
import com.xmkj.applibrary.domain.myself.MemberTo;
import com.xmkj.applibrary.domain.myself.MerchantStateTo;
import com.xmkj.applibrary.domain.myself.OrderCouponTo;
import com.xmkj.applibrary.domain.myself.OrderTo;
import com.xmkj.applibrary.domain.myself.PetCoinsTo;
import com.xmkj.applibrary.domain.myself.RecruitDataTo;
import com.xmkj.applibrary.domain.myself.SetAccountParam;
import com.xmkj.applibrary.domain.myself.WeChatPay;
import com.xmkj.applibrary.domain.pet.EvaluateParam;
import com.xmkj.applibrary.domain.pet.ExpressTo;
import com.xmkj.applibrary.domain.pet.OrderDealTo;
import com.xmkj.applibrary.domain.pet.OrderPetTo;
import com.xmkj.applibrary.domain.pet.ConfirmParam;
import com.xmkj.applibrary.domain.pet.OrderDetailTo;

import java.util.List;
import java.util.Map;

import okhttp3.MultipartBody;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Part;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;
import rx.Observable;

public interface MyselfApi {
    /**
     * 获取代金券
     */
    @GET("coupon/received/app/page")
    Observable<CouponMainTo> getCoupon(@QueryMap Map<String, String> queryParams);

    /**
     * 获取充值活动
     */
    @GET("recharge-promotion/enabledList/1")
    Observable<List<ChargeTo>> reCharge();

    /**
     * 获取充订单信息
     */
    @POST("recharge/{id}")
    Observable<ChargeOrderTo> getOderInfo(@Path("id") String id);

    /**
     * 微信充值
     */
    @GET("wx/pay/apppay/{orderNo}")
    Observable<WeChatPay> exchangeWx(@Path("orderNo") String orderNo);

    /**
     * 支付宝充值
     */
    @GET("alipay/apppay/{orderNo}")
    Observable<MessageTo> exchange(@Path("orderNo") String orderNo);

    /**
     * 获取我的佣金
     */
    @GET("commission/my")
    Observable<CommissionTo> getCommission();

    /**
     * 获取我的佣金流水
     */
    @GET("account-transaction/page")
    Observable<CommissionDataTo> getCommissionData(@QueryMap Map<String, String> queryParams);

    /**
     * 获取我的佣金分销成绩
     */
    @GET("agent-record/app/page")
    Observable<CommissionListTo> getCommissionList(@QueryMap Map<String, String> queryParams);

    /**
     * 获取我的宠币
     */
    @GET("virtual/my")
    Observable<PetCoinsTo> getMyPetCoins();

    /**
     * 获取订单可用优惠券
     */
    @GET("coupon-received/listForOrder")
    Observable<List<OrderCouponTo>> getOrderCounpon(@Query("courseId") String courseId);

    /**
     * 获取观览历史记录
     */
    @GET("learn-item-record/page")
    Observable<List<HistoryTo>> getHistory(@QueryMap Map<String, String> queryParams);

    /**
     * 买家中心
     */

    @GET("buyer/home")
    Observable<MemberTo> getMemberBuyerData();

    /**
     * 卖家中心
     */

    @GET("buyer/seller-home")
    Observable<MemberSellerTo> getMemberSellerData();

    /**
     * 判断是否有简历和求职意向
     */

    @GET("resume/check")
    Observable<RecruitDataTo> getRecruitData();


    @GET("shop-state/recruit")
    Observable<MerchantStateTo> getCompanyData();

    /**
     * 获取版本更新
     */

    @GET("appVersion/findAppVersion")
    Observable<AppVersionTo> getNewVersion(@Query("appKey") String appKey, @Query("appVersion") String appVersion);

    /**
     * 获取个人信息
     */

    @GET("profile")
    Observable<MemberInfo> getMemberInfo();

    /**
     * 获取个人信息
     */

    @GET("shop-certification/my")
    Observable<AuthenticationTo> getAuthenticationInfo();

    /**
     * 新增认证
     */

    @POST("shop-certification")
    Observable<MessageTo> addCertification(@Body AuthenticationParam param);

    /**
     * 更新学员信息
     */
    @PUT("learner/app/update")
    Observable<MessageTo> updateMemberData(@Body MemberParam param);

    /**
     * 修改个人信息
     */
    @POST("auth/info")
    Observable<MessageTo> updateMyInfo(@Body ChangeMyInfoParam param);

    /**
     * 佣金充值宠币接口
     */
    @POST("recharge/recharge-by-commission")
    Observable<MessageTo> exchangeCoin(@Body ExchangeParam param);

    /**
     * 修改个人信息
     */
    @PUT("shop/app")
    Observable<MessageTo> updateShopInfo(@Body ChangeShopParam param);

    /**
     * 新增支付宝账户
     */
    @POST("alipay")
    Observable<MessageTo> setAccount(@Body SetAccountParam param);

    /**
     * 购买课程
     */
    @POST("order/course")
    Observable<CourseToDetailTo> buyCourse(@Body BuyCourseParam param);


    /**
     * 获取订单列表
     */
    @GET("order/course/list")
    Observable<List<OrderTo>> getOrderList(@QueryMap Map<String, String> queryParams);

    /**
     * 获取宠物订单列表
     */
    @GET("order/app/page")
    Observable<OrderPetTo> getPetOrderList(@QueryMap Map<String, String> queryParams);

    /**
     * 取消订单
     */
    @PUT("order/cancel/{orderNo}")
    Observable<OrderDealTo> cancelOrder(@Path("orderNo") String orderNo);

    /**
     * 查看凭证
     */
    @GET("shipment/{orderNo}")
    Observable<ExpressTo> seeExpress(@Path("orderNo") String orderNo);

    /**
     * 查看订单详情
     */
    @GET("order/app/{orderNo}")
    Observable<OrderDetailTo> seeOrderDetail(@Path("orderNo") String orderNo);

    /**
     * 确认收货
     */
    @PUT("order/confirm-receipt/{orderNo}")
    Observable<MessageTo> confirmReceive(@Path("orderNo") String orderNo);

    /**
     * 发货
     */
    @POST("order/ship")
    Observable<MessageTo> deliverGoods(@Body ConfirmParam param);

    /**
     * 评价
     */
    @POST("order-evaluation")
    Observable<MessageTo> evaluate(@Body EvaluateParam param);

    /**
     * 获取支付宝账户
     */
    @GET("alipay")
    Observable<AccountTo> getAccount();

    /**
     * 获取支付宝账户
     */
    @GET("withdraw/{orderNo}")
    Observable<CashOutOrderTo> seeOrder(@Path("orderNo") String orderNo);

    /**
     * 提现
     */
    @PUT("alipay")
    Observable<MessageTo> cashOut(@Body CashOutParam param);

    /**
     * 上传图片
     */

    @Multipart
    @POST("oss/img-upload")
    Observable<MessageTo> uploadImage(@Part MultipartBody.Part file);
}
