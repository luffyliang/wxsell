package com.wxsell.luffy.Service.Impl;

import com.wxsell.luffy.Service.BannerItemService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author:luffyhongliang
 * @Date:Created in :17:39 2017/12/8
 * @Description:
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class BannerItemServiceImplTest {
    @Autowired
    BannerItemService bannerItemService;
    @Test
    public void find() throws Exception {
        bannerItemService.find(1);
        System.out.println( bannerItemService.find(1));
    }

}