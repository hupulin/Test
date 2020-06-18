package com.xmkj.applibrary.api;

import com.xmkj.applibrary.domain.MessageTo;
import com.xmkj.applibrary.domain.login.BannerTo;
import com.xmkj.applibrary.domain.main.CourseTo;
import com.xmkj.applibrary.domain.main.CourseToDetailTo;
import com.xmkj.applibrary.domain.main.MasterDetailTo;
import com.xmkj.applibrary.domain.main.MasterMainTo;
import com.xmkj.applibrary.domain.myself.ChargeOrderTo;
import com.xmkj.applibrary.domain.myself.CourseRecordParam;

import java.util.List;
import java.util.Map;

import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;
import rx.Observable;

public interface  HomeApi {
    /**
     * 获取大咖列表
     * */
    @GET("teacher/page")
    Observable<MasterMainTo> getTeacherList(@Query("page") int page, @Query("pageSize") String pageSize);
    /**
     * 获取大咖详情
     * */
    @GET("teacher/{id}")
    Observable<MasterDetailTo> getTeacherDetail(@Path("id") String id);

    //获取列表课程
    @GET("course/list")
    Observable<List<CourseTo>> getCourse(@QueryMap Map<String, String> queryParams);

    //新增观看记录
    @POST("learn-item-record")
    Observable<MessageTo> addCourseRecord(@Body CourseRecordParam params);
    //获取课程详情
    @GET("course/app/{id}")
    Observable<CourseToDetailTo> getCourseDetail(@Path("id") String id);
    //视频浏览
    @PUT("course/app/add-views/{courseItemId}")
    Observable<MessageTo> courseBrowse(@Path("courseItemId") String id);
    /**
     * 记录一条分销
     */
    @POST("agent-record/{courseId}")
    Observable<MessageTo> agentRecord(@Path("courseId") String courseId);
    //获取分享连接
    @GET("wx-share/shareUrl/{courseId}")
    Observable<MessageTo> getShareUrl(@Path("courseId") String courseId);

    //搜索课程
    @GET("course/list")
    Observable<List<CourseTo>> searchCourse(@Query("start")int start,@Query("limit")int limit,@Query("courseName") String courseName);
}
