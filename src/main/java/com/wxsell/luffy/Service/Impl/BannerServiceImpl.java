package com.wxsell.luffy.Service.Impl;

import com.wxsell.luffy.Service.BannerService;
import com.wxsell.luffy.dao.banner.BannerDao;
import com.wxsell.luffy.pojo.banner.Banner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author:luffyhongliang
 * @Date:Created in :16:42 2017/12/8
 * @Description:
 **/
@Service
public class BannerServiceImpl implements BannerService {
    @Autowired
    BannerDao bannerDao;

    @Override
    public Banner findone(Integer bannerid) {

        return bannerDao.selectByPrimaryKey(bannerid);
    }
}
