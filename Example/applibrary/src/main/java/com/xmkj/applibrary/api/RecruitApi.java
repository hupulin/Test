package com.xmkj.applibrary.api;

import com.xmkj.applibrary.domain.MessageTo;
import com.xmkj.applibrary.domain.recruit.CategoryJobTo;
import com.xmkj.applibrary.domain.recruit.CompanyTo;
import com.xmkj.applibrary.domain.recruit.DeleteParam;
import com.xmkj.applibrary.domain.recruit.EditIntentionParam;
import com.xmkj.applibrary.domain.recruit.HomeResumeTo;
import com.xmkj.applibrary.domain.recruit.IdParam;
import com.xmkj.applibrary.domain.recruit.IntentionTo;
import com.xmkj.applibrary.domain.recruit.InterviewTo;
import com.xmkj.applibrary.domain.recruit.InvitationParam;
import com.xmkj.applibrary.domain.recruit.JobCategoryList;
import com.xmkj.applibrary.domain.recruit.JobDetailTo;
import com.xmkj.applibrary.domain.recruit.MyCategoryTo;
import com.xmkj.applibrary.domain.recruit.MyCompanyTo;
import com.xmkj.applibrary.domain.recruit.MyInterviewTo;
import com.xmkj.applibrary.domain.recruit.MyJobCategoryTo;
import com.xmkj.applibrary.domain.recruit.RecruitMyDataTo;
import com.xmkj.applibrary.domain.recruit.ReleaseJobParam;
import com.xmkj.applibrary.domain.recruit.ResumeTo;

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

public interface RecruitApi {
    /**
     * 获取职业所有分类
     */
    @GET("category/tree")
    Observable<List<JobCategoryList>> getJobCategoryList(@Query("key") String key, @Query("state") int state);
    /**
     * 我发布的职位  （商家）
     */
    @GET("job/my")
    Observable<CategoryJobTo> getMyJob(@QueryMap Map<String, String> queryParams);
    /**
     * 邀请面试  （商家）
     */
    @POST("interview-invitation")
    Observable<MessageTo> invitationInterview(@Body InvitationParam param);
    /**
     * 停止招聘接口
     */
    @PUT("job/stop/{jobId}")
    Observable<MessageTo> closeJob(@Path("jobId") String id);
    /**
     * 完成面试接口
     */
    @PUT("interview-invitation/complete/{interviewInvitationId}")
    Observable<MessageTo> finishInterview(@Path("interviewInvitationId") String id);
    /**
     * 招聘商家首页在招职位类型列表
     */
    @GET("career-category-favorite/release/my")
    Observable<List<MyJobCategoryTo>> getMyJobCategory();
    /**
     * 启用招聘接口
     */
    @PUT("job/open/{jobId}")
    Observable<MessageTo> openJob(@Path("jobId") String id);

    /**
     * 新增职位
     */

    @POST("job")
    Observable<MessageTo> releaseJob(@Body ReleaseJobParam param);
    /**
     * 编辑职位
     */

    @POST("job")
    Observable<MessageTo> editJob(@Body ReleaseJobParam param);

    /**
     * 获取求职个人信息
     */
    @GET("buyer/recruit-home")
    Observable<RecruitMyDataTo> getRecruitMyData();
    /**
     * 获取求职个人信息
     */
    @POST("resume/refresh")
    Observable<MessageTo> reloadResume();

    /**
     * 获取公司信息
     */
    @GET("company")
    Observable<MyCompanyTo> getCompanyData();

    /**
     *    获取我的简历
     */
    @GET("resume/my")
    Observable<ResumeTo> getMyResume();

    /**
     * 获取简历详情
     *
     */
    @GET("resume/{id}")
    Observable<ResumeTo> getResumeDetail(@Path("id") String categoryIds);

    /**
     * 收藏职业分类
     */
    @POST("career-category-favorite/{categoryIds}")
    Observable<MessageTo> updateCategory(@Path("categoryIds") String categoryIds);

    /**
     * 获取我的职位种类收藏 选择首页的3个
     */
    @GET("career-category-favorite/my")
    Observable<List<MyCategoryTo>> getMyCategory();

    /**
     * 职位对应工作的列表分页查询
     *
     */
    @GET("job/page")
    Observable<CategoryJobTo> getCategoryList(@QueryMap Map<String, String> queryParams);

    /**
     * 公司首页人才分页查询（简历）
     */
    @GET("resume/page")
    Observable<HomeResumeTo> getResumeList(@QueryMap Map<String, String> queryParams);

    /**
     * 职位详情(求职)
     */
    @GET("job/{jobId}")
    Observable<JobDetailTo> getJobDetail(@Path("jobId") String id);
    /**
     * 职位详情（职位管理）
     */
    @GET("job/manager/{jobId}")
    Observable<JobDetailTo> getJobDetailManage(@Path("jobId") String id);
    /**
     * 删除职位
     */
    @DELETE("job/{jobId}")
    Observable<MessageTo>deleteJob(@Path("jobId") String id);
    /**
     *职位申请
     */
    @POST("job/application")
    Observable<MessageTo> applyJob(@Body DeleteParam param);
    /**
     *职位收藏
     */
    @POST("job/favorite")
    Observable<MessageTo> favoriteJob(@Body DeleteParam param);
    /**
     *职位取消收藏
     */
    @DELETE("resume/favorite/{resumeId}")
    Observable<MessageTo> cancelFavoriteResume(@Path("resumeId") String id);
    /**
     *简历收藏
     */
    @POST("resume/favorite")
    Observable<MessageTo> favoriteResume(@Body IdParam param);
    /**
     *简历取消收藏
     */
    @POST("job/cancel/favorite")
    Observable<MessageTo> cancelFavoriteJob(@Body DeleteParam param);
    /**
     * 我的投递
     */
    @GET("job/application-page")
    Observable<CategoryJobTo> getMyDelivery(@QueryMap Map<String, String> queryParams);
    /**
     * 我的面试
     */
    @GET("interview-invitation/my")
    Observable<MyInterviewTo> getMyInterview(@QueryMap Map<String, String> queryParams);
    /**
     * 我的收藏
     */
    @GET("job/favorite-page")
    Observable<CategoryJobTo> getMyCollection(@QueryMap Map<String, String> queryParams);
    /**
     * 我收藏的简历
     */
    @GET("resume/favorite-page")
    Observable<HomeResumeTo> getResumeCollection(@QueryMap Map<String, String> queryParams);
    /**
     * 我收到的简历
     */
    @GET("resume/application-page")
    Observable<HomeResumeTo> getResumeRecieve(@QueryMap Map<String, String> queryParams);
    /**
     * 我的面试列表（for招聘者）
     */
    @GET("interview-invitation/manager/my")
    Observable<InterviewTo> getInterview(@QueryMap Map<String, String> queryParams);
    /**
     * 看过我的职位的简历
     */
    @GET("resume/view-job-page")
    Observable<HomeResumeTo> getResumeSee(@QueryMap Map<String, String> queryParams);
    /**
     *
     * 删除我的收藏
     */
    @POST("job/cancel/favorite")
    Observable<CategoryJobTo> deleteCollection(@Body DeleteParam param);

    /**
     * 分页查询企业信息接口
     */
    @GET("company/page")
    Observable<CompanyTo> getCompanyList(@QueryMap Map<String, String> queryParams);

    /**
     * 编辑求职意向
     */
    @POST("job-intention")
    Observable<MessageTo> editIntention(@Body EditIntentionParam param);

    /**
     * 我的求职意向
     */
    @GET("job-intention/my")
    Observable<IntentionTo> getIntention();

}
