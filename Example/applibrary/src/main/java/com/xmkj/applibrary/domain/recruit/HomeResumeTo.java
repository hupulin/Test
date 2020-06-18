package com.xmkj.applibrary.domain.recruit;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

@Data
public class HomeResumeTo implements Serializable {

    /**
     * records : [{"workYears":1,"lastModifyOnStr":1,"resumeId":1,"gender":1,"headUrl":"","expectedCityName":"","workExperience":{"jobName":"","companyName":"","endTimeStr":"","startTimeStr":1,"companyIndustryName":""},"fullname":"","userId":1,"qualificationName":"","age":1}]
     * nextPage : 1
     * totalPages : 0
     * pageSize : 10
     * prevPage : 1
     * page : 1
     * totalRecord : 0
     */
    private List<RecordsEntity> records;
    private int nextPage;
    private int totalPages;
    private int pageSize;
    private int prevPage;
    private int page;
    private int totalRecord;

    @Data
    public class RecordsEntity implements Serializable {
        /**
         * workYears : 1
         * lastModifyOnStr : 1
         * resumeId : 1
         * gender : 1
         * headUrl :
         * expectedCityName :
         * workExperience : {"jobName":"","companyName":"","endTimeStr":"","startTimeStr":1,"companyIndustryName":""}
         * fullname :
         * userId : 1
         * qualificationName :
         * age : 1
         */
        private String resumeId;
        private String headUrl;
        private String fullname;
        private int gender;
        private String workYearStr;

        private String workYears;
        private String userId;

        private String lastModifyOnStr;
        private String favoriteTimeStr;//我收藏的
        private String applicationTimeStr;//收到的
        private String lastViewOnStr;//看过我的
        private String addOnStr;
        private String careerCategoryName;
        private String jobName;
        private String applicationCategoryName;
        private String careerCategory;
        private String expectedCityName;
        private WorkExperienceEntity workExperience;
        private String qualificationName;
        private int age;
        private long minMonthlySalary;
        private long maxMonthlySalary;

        @Data

        public class WorkExperienceEntity  implements Serializable {
            /**
             * jobName :
             * companyName :
             * endTimeStr :
             * startTimeStr : 1
             * companyIndustryName :
             */
            private String jobName;
            private String companyName;
            private String endTimeStr;
            private String startTimeStr;
            private String companyIndustryName;


        }
    }
}
