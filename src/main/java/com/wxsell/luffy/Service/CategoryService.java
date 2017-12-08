package com.wxsell.luffy.Service;

import com.wxsell.luffy.pojo.product.Category;

import java.util.List;

/**
 * @Author:luffyhongliang
 * @Date:Created in :23:25 2017/11/22
 * @Description:
 **/
public interface CategoryService {

    Category findOne(Integer categoryId);

    List<Category> findAll();

    List<Category> findByCategoryTypeIn(List<Integer> categoryTypeList);

    Integer save(Category productCategory);






}
