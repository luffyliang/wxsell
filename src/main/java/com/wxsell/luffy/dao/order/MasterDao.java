package com.wxsell.luffy.dao.order;


import java.util.List;


import com.wxsell.luffy.pojo.order.Master;
import com.wxsell.luffy.pojo.order.MasterQuery;
import org.apache.ibatis.annotations.Param;

public interface MasterDao {
    int countByExample(MasterQuery example);

    int deleteByExample(MasterQuery example);

    int deleteByPrimaryKey(String orderId);

    int insert(Master record);

    int insertSelective(Master record);

    List<Master> selectByExample(MasterQuery example);

    Master selectByPrimaryKey(String orderId);

    int updateByExampleSelective(@Param("record") Master record, @Param("example") MasterQuery example);

    int updateByExample(@Param("record") Master record, @Param("example") MasterQuery example);

    int updateByPrimaryKeySelective(Master record);

    int updateByPrimaryKey(Master record);
}