package com.wxsell.luffy.Service;

import com.wxsell.luffy.pojo.banner.BannerItem;

import java.util.List;

/**
 * @Author:luffyhongliang
 * @Date:Created in :17:23 2017/12/8
 * @Description:
 **/
public interface BannerItemService {
    public List<BannerItem> find(Integer  bannerid);
}
