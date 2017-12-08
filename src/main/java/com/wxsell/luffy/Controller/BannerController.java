package com.wxsell.luffy.Controller;

import com.wxsell.luffy.Service.BannerItemService;
import com.wxsell.luffy.Service.BannerService;
import com.wxsell.luffy.VO.BannerVO;
import com.wxsell.luffy.pojo.banner.Banner;
import com.wxsell.luffy.pojo.banner.BannerItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author:luffyhongliang
 * @Date:Created in :18:06 2017/12/8
 * @Description:
 **/
@RestController
@RequestMapping("/banner")
public class BannerController {
    @Autowired
    private BannerItemService bannerItemService;
    @Autowired
    private BannerService bannerService;

    @RequestMapping(value="/{id}",method= RequestMethod.GET)
    public BannerVO banner(@PathVariable("id") Integer id){
        Banner banner= bannerService.findone(id);
        List<BannerItem> bannerItemList =bannerItemService.find(id);
        BannerVO bannerVO = new BannerVO();
        bannerVO.setId(banner.getId());
        bannerVO.setName(banner.getName());
        bannerVO.setDescription(banner.getDescription());
        bannerVO.setItems(bannerItemList);

        return bannerVO;
    }
}
