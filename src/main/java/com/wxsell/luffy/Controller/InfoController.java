package com.wxsell.luffy.Controller;

import com.wxsell.luffy.Service.ProductInfoService;
import com.wxsell.luffy.pojo.product.Info;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author:luffyhongliang
 * @Date:Created in :16:17 2017/11/28
 * @Description:
 **/
@RestController
@RequestMapping("/info")
public class InfoController {
    @Autowired
    ProductInfoService productInfoService;

    @RequestMapping(value="/{id}",method= RequestMethod.GET)
    public Info list(@PathVariable("id") String id){
        Info info =productInfoService.findOne(id);
         //map.put("in",info);
       // model.addAttribute(info);
        return info;
    }

}