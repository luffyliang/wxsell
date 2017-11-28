package com.wxsell.luffy.Service.Impl;

import com.wxsell.luffy.Service.ProductInfoService;
import com.wxsell.luffy.pojo.product.Info;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * @Author:luffyhongliang
 * @Date:Created in :16:14 2017/11/28
 * @Description:
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductInfoServiceImplTest {
    @Autowired
    ProductInfoService productInfoService;
    @Test
    public void findOne() throws Exception {
     Info info= productInfoService.findOne("1");
        System.out.print(info.getProductIcon());
    }

}