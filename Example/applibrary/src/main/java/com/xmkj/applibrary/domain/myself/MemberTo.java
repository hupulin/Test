package com.xmkj.applibrary.domain.myself;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

@Data
public class MemberTo implements Serializable {


    /**
     * storeFavoriteCount : 0
     * courseViewCount : 0
     * expressAddressCount : 0
     * headImage :
     * nickname :
     * courseOrderCount : 0
     * orderCountList : [{"count":1,"state":1}]
     * mobile :
     * virtualAmount : 0
     * commodityFavoriteCount : 0
     */
    private int storeFavoriteCount;
    private int courseViewCount;
    private int expressAddressCount;
    private String headImage;
    private String nickname;
    private int courseOrderCount;
    private List<OrderCountListEntity> orderCountList;
    private String mobile;
    private int commodityFavoriteCount;

@Data
    public class OrderCountListEntity {
        /**
         * count : 1
         * state : 1
         */
        private int count;
        private int state;

    }
}
