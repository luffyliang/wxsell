package com.wxsell.luffy.Service.Impl;

import com.wxsell.luffy.Service.CategoryService;
import com.wxsell.luffy.dao.product.CategoryDao;
import com.wxsell.luffy.pojo.product.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author:luffyhongliang
 * @Date:Created in :23:27 2017/11/22
 * @Description:
 **/
@Service
public class CategoryServiceImpl implements CategoryService{
    @Autowired
    CategoryDao categoryDao;

     public  Category findOne(Integer CategoryId){
        return  categoryDao.selectByPrimaryKey(CategoryId);
    }
}
