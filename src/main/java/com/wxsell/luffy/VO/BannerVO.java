package com.wxsell.luffy.VO;

import com.wxsell.luffy.pojo.banner.BannerItem;
import lombok.Data;

import java.util.List;

/**
 * @Author:luffyhongliang
 * @Date:Created in :18:03 2017/12/8
 * @Description:
 **/
@Data
public class BannerVO {

    private Integer id;

    private String name;

    private String description;

    private List<BannerItem> items;
}
