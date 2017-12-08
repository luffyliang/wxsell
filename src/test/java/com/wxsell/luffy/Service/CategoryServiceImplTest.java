package com.wxsell.luffy.Service;

import com.wxsell.luffy.pojo.product.Category;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @Author:luffyhongliang
 * @Date:Created in :20:47 2017/12/5
 * @Description:
 **/

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
        Assert.assertEquals(new Integer(1),category.getCategoryId());
        System.out.print(category.toString());
    }

    @Test
    public void findAll() throws Exception {
        List<Category> productCategoryList = categoryService.findAll();
        System.out.println(productCategoryList.size());
        Assert.assertNotEquals(0,productCategoryList.size());
     }

    @Test
    public void findByCategoryTypeIn() throws Exception {
    }

    @Test
    public void save() throws Exception {
    }

}