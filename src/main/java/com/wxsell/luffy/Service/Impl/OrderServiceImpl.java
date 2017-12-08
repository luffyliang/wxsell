package com.wxsell.luffy.Service.Impl;

import com.wxsell.luffy.Service.OrderService;
import com.wxsell.luffy.Service.ProductInfoService;
import com.wxsell.luffy.pojo.order.Detail;
import com.wxsell.luffy.pojo.product.Info;
import com.wxsell.luffy.dto.OrderDTO;
import com.wxsell.luffy.enums.ResultEnum;
import com.wxsell.luffy.exception.SellException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * @Author:luffyhongliang
 * @Date:Created in :12:00 2017/12/6
 * @Description:
 **/
public class OrderServiceImpl implements OrderService {
     @Autowired
    private ProductInfoService productInfoService;


    @Override
    public OrderDTO create(OrderDTO orderDTO) {
        //查询商品（数量，价格）
         for(Detail orderDetail : orderDTO.getOrderDetailList()){
           Info info = productInfoService.findOne(orderDetail.getProductId());
           if(info ==null){
               throw new SellException(ResultEnum.PRODUCT_NOT_EXIST);
           }
         }
        //计算总价
        //写入订单数据库（orderMaster ，orderDertail）
        //扣库存


        return null;
    }

    @Override
    public OrderDTO findOne(String orderId) {
        return null;
    }

    @Override
    public Page<OrderDTO> findList(String buyerOpenid, Pageable pageable) {
        return null;
    }

    @Override
    public OrderDTO cancel(OrderDTO orderDTO) {
        return null;
    }

    @Override
    public OrderDTO finish(OrderDTO orderDTO) {
        return null;
    }

    @Override
    public OrderDTO paid(OrderDTO orderDTO) {
        return null;
    }

    @Override
    public Page<OrderDTO> findList(Pageable pageable) {
        return null;
    }
}
