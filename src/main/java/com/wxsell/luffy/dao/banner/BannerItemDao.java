package com.wxsell.luffy.dao.banner;


import com.wxsell.luffy.pojo.banner.BannerItem;
import com.wxsell.luffy.pojo.banner.BannerItemQuery;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface BannerItemDao {
    int countByExample(BannerItemQuery example);

    int deleteByExample(BannerItemQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(BannerItem record);

    int insertSelective(BannerItem record);

    List<BannerItem> selectByExample(BannerItemQuery example);

    BannerItem selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BannerItem record, @Param("example") BannerItemQuery example);

    int updateByExample(@Param("record") BannerItem record, @Param("example") BannerItemQuery example);

    int updateByPrimaryKeySelective(BannerItem record);

    int updateByPrimaryKey(BannerItem record);
}