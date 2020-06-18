package com.xmkj.applibrary.domain.recruit;

import java.util.List;

import lombok.Data;

@Data
public class InterviewTo {

    /**
     * totalRecords : 100
     * records : [{"jobName":"测试","careerCategoryName":"C级宠物美容师","jobId":"781","interviewTime":"1587598429","gender":2,"interviewTimeStr":"2020.04.23 07:33","headUrl":"https://tabaooss.oss-cn-beijing.aliyuncs.com/191011990016923.jpg","interviewInvitationId":"165","fullname":"韩雨建","userId":"232","age":0},{"jobName":"测试","careerCategoryName":"C级宠物美容师","jobId":"781","interviewTime":"1585249714","gender":1,"interviewTimeStr":"2020.03.27 03:08","headUrl":"https://tabaooss.oss-cn-beijing.aliyuncs.com/191011990016923.jpg","interviewInvitationId":"166","fullname":"吕熙小","userId":"240","age":0},{"jobName":"测试","careerCategoryName":"C级宠物美容师","jobId":"781","interviewTime":"1581415194","gender":1,"interviewTimeStr":"2020.02.11 17:59","headUrl":"https://tabaooss.oss-cn-beijing.aliyuncs.com/191011990016923.jpg","interviewInvitationId":"167","fullname":"孔刚俊","userId":"248","age":0},{"jobName":"测试","careerCategoryName":"C级宠物美容师","jobId":"781","interviewTime":"1587402640","gender":2,"interviewTimeStr":"2020.04.21 01:10","headUrl":"https://tabaooss.oss-cn-beijing.aliyuncs.com/191011990016923.jpg","interviewInvitationId":"168","fullname":"王靖金","userId":"256","age":0},{"jobName":"测试","careerCategoryName":"C级宠物美容师","jobId":"781","interviewTime":"1579723648","gender":1,"interviewTimeStr":"2020.01.23 04:07","headUrl":"https://tabaooss.oss-cn-beijing.aliyuncs.com/191011990016923.jpg","interviewInvitationId":"169","fullname":"冯熙展","userId":"264","age":0},{"jobName":"测试","careerCategoryName":"C级宠物美容师","jobId":"781","interviewTime":"1581640584","gender":1,"interviewTimeStr":"2020.02.14 08:36","headUrl":"https://tabaooss.oss-cn-beijing.aliyuncs.com/191011990016923.jpg","interviewInvitationId":"170","fullname":"郑飞雅","userId":"272","age":0},{"jobName":"测试","careerCategoryName":"C级宠物美容师","jobId":"781","interviewTime":"1585615964","gender":1,"interviewTimeStr":"2020.03.31 08:52","headUrl":"https://tabaooss.oss-cn-beijing.aliyuncs.com/191011990016923.jpg","interviewInvitationId":"171","fullname":"朱扬建","userId":"280","age":0},{"jobName":"测试","careerCategoryName":"C级宠物美容师","jobId":"781","interviewTime":"1584901084","gender":2,"interviewTimeStr":"2020.03.23 02:18","headUrl":"https://tabaooss.oss-cn-beijing.aliyuncs.com/191011990016923.jpg","interviewInvitationId":"172","fullname":"褚铭婧","userId":"288","age":0},{"jobName":"测试","careerCategoryName":"C级宠物美容师","jobId":"781","interviewTime":"1585043292","gender":1,"interviewTimeStr":"2020.03.24 17:48","headUrl":"https://tabaooss.oss-cn-beijing.aliyuncs.com/191011990016923.jpg","interviewInvitationId":"173","fullname":"秦文诗","userId":"296","age":0},{"jobName":"测试","careerCategoryName":"C级宠物美容师","jobId":"781","interviewTime":"1583020594","gender":1,"interviewTimeStr":"2020.03.01 07:56","headUrl":"https://tabaooss.oss-cn-beijing.aliyuncs.com/191011990016923.jpg","interviewInvitationId":"174","fullname":"蒋靖雅","userId":"304","age":0}]
     * nextPage : 2
     * totalPages : 10
     * pageSize : 10
     * prevPage : 1
     * page : 1
     */
    private int totalRecords;
    private List<RecordsEntity> records;
    private int nextPage;
    private int totalPages;
    private int pageSize;
    private int prevPage;
    private int page;

    @Data

    public class RecordsEntity {
        /**
         * jobName : 测试
         * careerCategoryName : C级宠物美容师
         * jobId : 781
         * interviewTime : 1587598429
         * gender : 2
         * interviewTimeStr : 2020.04.23 07:33
         * headUrl : https://tabaooss.oss-cn-beijing.aliyuncs.com/191011990016923.jpg
         * interviewInvitationId : 165
         * fullname : 韩雨建
         * userId : 232
         * age : 0
         */
        private String jobName;
        private String careerCategoryName;
        private String jobId;
        private String interviewTime;
        private int gender;
        private String interviewTimeStr;
        private String headUrl;
        private String interviewInvitationId;
        private String fullname;
        private String workYears;
        private String workYearsStr;
        private String userId;
        private int age;

    }
}
