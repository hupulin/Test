package com.xmkj.applibrary.domain.main;

import lombok.Data;

/**
 * Created by 1ONE on 2019/7/9.
 */
@Data
public class MasterTo {

    /**
     * teacherId : 0
     * teacherName : string
     * addOn : 0
     * courseQty : 0
     * coverImage : string
     * teacherTel : string
     * description : string
     * sysUserId : 0
     * teacherTitle : string
     */
    private String teacherId;
    private String teacherName;
    private int addOn;
    private int courseQty;
    private String coverImage;
    private String headUrl;
    private String teacherTel;
    private String description;
    private int sysUserId;
    private String teacherTitle;




}
