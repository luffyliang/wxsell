package com.wxsell.luffy.Controller;

import com.wxsell.luffy.Service.CategoryService;
import com.wxsell.luffy.pojo.product.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

/**
 * @Author:luffyhongliang
 * @Date:Created in :16:33 2017/11/23
 * @Description:
 **/
@Controller
@RequestMapping("/seller")
public class CategoryController {
     @Autowired
    CategoryService categoryService;

    @RequestMapping(value="/{id}",method= RequestMethod.GET)
    public String list(@PathVariable("id") Integer id, Map<String,Object> map){
        Category category =categoryService.findOne(id);
        map.put("name",category.getCategoryName());
        return "category";
    }

}
