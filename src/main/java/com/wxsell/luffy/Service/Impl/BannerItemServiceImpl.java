package com.wxsell.luffy.Service.Impl;

import com.wxsell.luffy.Service.BannerItemService;
import com.wxsell.luffy.dao.banner.BannerItemDao;
import com.wxsell.luffy.pojo.banner.BannerItem;
import com.wxsell.luffy.pojo.banner.BannerItemQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author:luffyhongliang
 * @Date:Created in :17:34 2017/12/8
 * @Description:
 **/
@Service
public class BannerItemServiceImpl implements BannerItemService{
    @Autowired
    BannerItemDao bannerItemDao;
    public List<BannerItem>  find(Integer  bannerid){
        BannerItemQuery banener =new BannerItemQuery();
        banener.createCriteria().andBannerIdEqualTo(bannerid);
        return bannerItemDao.selectByExample(banener);
    }
}
