package com.wxsell.luffy.Controller;

import com.wxsell.luffy.Service.CategoryService;
import com.wxsell.luffy.pojo.product.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author:luffyhongliang
 * @Date:Created in :16:33 2017/11/23
 * @Description:
 **/
@RestController
@RequestMapping("/seller")
public class CategoryController {
     @Autowired
    CategoryService categoryService;

    @RequestMapping(value="/{id}",method= RequestMethod.GET)
    public Category list(@PathVariable("id") Integer id){
        Category category =categoryService.findOne(id);
       // map.put("name",category.getCategoryName());
        return category;
    }

}
