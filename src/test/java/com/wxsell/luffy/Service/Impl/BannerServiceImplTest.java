package com.wxsell.luffy.Service.Impl;

import com.wxsell.luffy.Service.BannerService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author:luffyhongliang
 * @Date:Created in :16:46 2017/12/8
 * @Description:
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class BannerServiceImplTest {
    @Autowired
    BannerService banner;
    @Test
    public void findone() throws Exception {

          System.out.println(banner.findone(1));
    }

}