package com.xmkj.applibrary.domain.myself;

import lombok.Data;

@Data
public class HistoryTo {
    /**
     * learnItemRecordId : 13
     * addOn : 1563415926
     * learnRecordId : 15
     * lastLearnTime : 1562737425
     * coverImage : https://tabaooss.oss-cn-beijing.aliyuncs.com/190604990000674.jpg
     * sysUserId : 545
     * courseItemName :  "测试封面"
     * completed : false
     * videoPercentage : 1,133.33
     * courseId : 14
     * courseItemId : 16
     * learnProgress : 102
     */
    private String learnItemRecordId;
    private String addOn;
    private String learnRecordId;
    private String lastLearnTime;
    private String coverImage;
    private String courseItemName;
    private String sysUserId;
    private boolean completed;
    private String videoPercentage;
    private boolean delCourseItem;
    private String courseId;
    private String courseItemId;
    private int learnProgress;

}
