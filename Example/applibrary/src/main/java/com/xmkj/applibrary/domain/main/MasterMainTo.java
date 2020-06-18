package com.xmkj.applibrary.domain.main;

import java.util.List;

import lombok.Data;

@Data
public class MasterMainTo  {

    /**
     * totalRecords : 4
     * records : [{"teacherId":"5","teacherName":"讲师李强","courseQty":15,"addOn":"1559698247","teacherTel":"18666666665","coverImage":"https://tabaooss.oss-cn-beijing.aliyuncs.com/190605990010183.jpg","description":"哈哈哈哈","teacherTitle":"高级铲屎官"},{"teacherId":"4","teacherName":"王五","courseQty":1,"addOn":"1559200138","teacherTel":"15171450726","coverImage":"https://tabaooss.oss-cn-beijing.aliyuncs.com/190530990050188.png","description":"测试讲师","teacherTitle":"高级讲师1"},{"teacherId":"3","teacherName":"李四","courseQty":0,"addOn":"1559028624","teacherTel":"15171450726","coverImage":"https://tabaooss.oss-cn-beijing.aliyuncs.com/190528990040439.jpg","description":"测试讲师111111111111111111111111111111111111111111111111111111111","teacherTitle":"高级宠物训导师"},{"teacherId":"2","teacherName":"张三","courseQty":0,"addOn":"1559028552","teacherTel":"18814121274","coverImage":"https://tabaooss.oss-cn-beijing.aliyuncs.com/190528990040563.jpg","description":"测试讲师测试讲师","teacherTitle":"高级宠物训导师"}]
     * nextPage : 1
     * totalPages : 1
     * pageSize : 10
     * prevPage : 1
     * page : 1
     */
    private int totalRecords;
    private List<MasterTo> records;
    private int nextPage;
    private int totalPages;
    private int pageSize;
    private int prevPage;
    private int page;


}
