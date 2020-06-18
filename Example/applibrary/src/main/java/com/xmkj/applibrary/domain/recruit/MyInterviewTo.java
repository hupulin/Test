package com.xmkj.applibrary.domain.recruit;

import java.util.List;

import lombok.Data;

@Data
public class MyInterviewTo {

    /**
     * totalRecords : 6
     * records : [{"jobName":"1事业部诚聘宠物美容师助理，待遇从优","address":"当代梦工厂807","interviewTimeStr":"2020.03.19 01:31","companyName":"它宝智能事业4部","groupId":"193","interviewInvitationId":"12","minMonthlySalary":5000,"maxMonthlySalary":7000,"jobId":"28","cityName":"西安市","areaName":"碑林区","contactPhoneNumber":"13888887474","provinceName":"陕西省"},{"jobName":"0事业部诚聘宠物美容师助理，待遇从优","address":"当代梦工厂807","interviewTimeStr":"2020.02.04 12:53","companyName":"它宝智能事业4部","groupId":"193","interviewInvitationId":"11","minMonthlySalary":1000,"maxMonthlySalary":6000,"jobId":"27","cityName":"西安市","areaName":"碑林区","contactPhoneNumber":"13888887474","provinceName":"陕西省"},{"jobName":"6事业部诚聘A级宠物美容师，待遇从优","address":"当代梦工厂807","interviewTimeStr":"2020.03.09 11:17","companyName":"它宝智能事业3部","groupId":"192","interviewInvitationId":"10","minMonthlySalary":3000,"maxMonthlySalary":7000,"jobId":"25","cityName":"西安市","areaName":"碑林区","contactPhoneNumber":"13888887474","provinceName":"陕西省"},{"jobName":"2事业部诚聘B级宠物美容师，待遇从优","address":"当代梦工厂807","interviewTimeStr":"2020.01.27 02:06","companyName":"它宝智能事业2部","groupId":"191","interviewInvitationId":"9","minMonthlySalary":4000,"maxMonthlySalary":8000,"jobId":"14","cityName":"西安市","areaName":"碑林区","contactPhoneNumber":"13888887474","provinceName":"陕西省"},{"jobName":"0事业部诚聘C级宠物美容师，待遇从优","address":"当代梦工厂807","interviewTimeStr":"2020.02.21 06:26","companyName":"它宝智能事业1部","groupId":"190","interviewInvitationId":"8","minMonthlySalary":5000,"maxMonthlySalary":6000,"jobId":"6","cityName":"西安市","areaName":"碑林区","contactPhoneNumber":"13888887474","provinceName":"陕西省"},{"jobName":"0事业部诚聘宠物美容师，待遇从优","address":"当代梦工厂807","interviewTimeStr":"2020.03.04 04:04","companyName":"它宝智能事业0部","groupId":"224","interviewInvitationId":"7","minMonthlySalary":4000,"maxMonthlySalary":7000,"jobId":"1","cityName":"西安市","areaName":"碑林区","contactPhoneNumber":"13888887474","provinceName":"陕西省"}]
     * nextPage : 1
     * totalPages : 1
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
         * jobName : 1事业部诚聘宠物美容师助理，待遇从优
         * address : 当代梦工厂807
         * interviewTimeStr : 2020.03.19 01:31
         * companyName : 它宝智能事业4部
         * groupId : 193
         * interviewInvitationId : 12
         * minMonthlySalary : 5000
         * maxMonthlySalary : 7000
         * jobId : 28
         * cityName : 西安市
         * areaName : 碑林区
         * contactPhoneNumber : 13888887474
         * provinceName : 陕西省
         */
        private String jobName;
        private String address;
        private String interviewTimeStr;
        private String companyName;
        private String groupId;
        private String interviewInvitationId;
        private int minMonthlySalary;
        private int maxMonthlySalary;
        private String jobId;
        private String cityName;
        private String areaName;
        private String contactPhoneNumber;
        private String provinceName;


    }
}
