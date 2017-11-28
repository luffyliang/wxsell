package com.wxsell.luffy.dao.product;

import com.wxsell.luffy.pojo.product.Info;
import com.wxsell.luffy.pojo.product.InfoQuery;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface InfoDao {
    int countByExample(InfoQuery example);

    int deleteByExample(InfoQuery example);

    int deleteByPrimaryKey(String productId);

    int insert(Info record);

    int insertSelective(Info record);

    List<Info> selectByExample(InfoQuery example);

    Info selectByPrimaryKey(String productId);

    int updateByExampleSelective(@Param("record") Info record, @Param("example") InfoQuery example);

    int updateByExample(@Param("record") Info record, @Param("example") InfoQuery example);

    int updateByPrimaryKeySelective(Info record);

    int updateByPrimaryKey(Info record);
}