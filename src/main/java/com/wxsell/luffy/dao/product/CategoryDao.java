package com.wxsell.luffy.dao.product;

import com.wxsell.luffy.pojo.product.Category;
import com.wxsell.luffy.pojo.product.CategoryQuery;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface CategoryDao {
    int countByExample(CategoryQuery example);

    int deleteByExample(CategoryQuery example);

    int deleteByPrimaryKey(Integer categoryId);

    int insert(Category record);

    int insertSelective(Category record);

    List<Category> selectByExample(CategoryQuery example);

    Category selectByPrimaryKey(Integer categoryId);

    int updateByExampleSelective(@Param("record") Category record, @Param("example") CategoryQuery example);

    int updateByExample(@Param("record") Category record, @Param("example") CategoryQuery example);

    int updateByPrimaryKeySelective(Category record);

    int updateByPrimaryKey(Category record);
}