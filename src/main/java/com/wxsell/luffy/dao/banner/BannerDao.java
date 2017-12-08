package com.wxsell.luffy.dao.banner;


import com.wxsell.luffy.pojo.banner.Banner;
import com.wxsell.luffy.pojo.banner.BannerQuery;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface BannerDao {
    int countByExample(BannerQuery example);

    int deleteByExample(BannerQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(Banner record);

    int insertSelective(Banner record);

    List<Banner> selectByExample(BannerQuery example);

    Banner selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Banner record, @Param("example") BannerQuery example);

    int updateByExample(@Param("record") Banner record, @Param("example") BannerQuery example);

    int updateByPrimaryKeySelective(Banner record);

    int updateByPrimaryKey(Banner record);
}