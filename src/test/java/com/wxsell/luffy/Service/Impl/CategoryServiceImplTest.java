package com.wxsell.luffy.Service.Impl;

import com.wxsell.luffy.Service.CategoryService;
import com.wxsell.luffy.pojo.product.Category;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * @Author:luffyhongliang
 * @Date:Created in :23:30 2017/11/22
 * @Description:
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class CategoryServiceImplTest {
    @Autowired
    CategoryService categoryService;
    @Test
    public void findOne() throws Exception {
        Category category= categoryService.findOne(1);
        System.out.print(category.toString());
    }

}