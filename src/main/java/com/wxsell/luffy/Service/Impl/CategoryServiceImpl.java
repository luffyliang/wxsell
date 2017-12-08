package com.wxsell.luffy.Service.Impl;

import com.wxsell.luffy.Service.CategoryService;
import com.wxsell.luffy.dao.product.CategoryDao;
import com.wxsell.luffy.pojo.product.Category;
import com.wxsell.luffy.pojo.product.CategoryQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author:luffyhongliang
 * @Date:Created in :23:27 2017/11/22
 * @Description:
 **/
@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    CategoryDao categoryDao;


    public Category findOne(Integer CategoryId) {

        return categoryDao.selectByPrimaryKey(CategoryId);
    }

    @Override
    public List<Category> findAll() {
        CategoryQuery categoryQuery =new CategoryQuery();
        return categoryDao.selectByExample(categoryQuery);
    }

    @Override
    public List<Category> findByCategoryTypeIn(List<Integer> categoryTypeList) {
        CategoryQuery categoryQuery =new CategoryQuery();
        categoryQuery.createCriteria().andCategoryIdIn(categoryTypeList);
        return categoryDao.selectByExample(categoryQuery);
    }

    @Override
    public Integer save(Category productCategory) {
        return categoryDao.insert(productCategory);
    }
}
