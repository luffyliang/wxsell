package com.wxsell.luffy.dao.product;

import com.wxsell.luffy.pojo.product.Category;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author:luffyhongliang
 * @Date:Created in :22:49 2017/11/22
 * @Description:
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class CategoryDaoTest {
    @Autowired
    private CategoryDao categoryDao;
    @Test
    public void selectByPrimaryKey() throws Exception {
       Category category= categoryDao.selectByPrimaryKey(1);
        System.out.print(category.getCategoryName());
    }

}