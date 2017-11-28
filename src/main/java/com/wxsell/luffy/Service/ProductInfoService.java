package com.wxsell.luffy.Service;

import com.wxsell.luffy.pojo.product.Info;

/**
 * @Author:luffyhongliang
 * @Date:Created in :16:02 2017/11/28
 * @Description:
 **/
public interface ProductInfoService {
    Info findOne(String productId);
}
