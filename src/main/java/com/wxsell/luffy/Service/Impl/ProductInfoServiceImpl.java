package com.wxsell.luffy.Service.Impl;

import com.wxsell.luffy.Service.ProductInfoService;
import com.wxsell.luffy.dao.product.InfoDao;
import com.wxsell.luffy.pojo.product.Info;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author:luffyhongliang
 * @Date:Created in :16:03 2017/11/28
 * @Description:
 **/
@Service
public class ProductInfoServiceImpl implements ProductInfoService {
   @Autowired
   InfoDao infoDao;
    public Info findOne(String id){

        return  infoDao.selectByPrimaryKey(id);

    };
}
