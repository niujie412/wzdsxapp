package com.niu.controller;


import com.niu.VO.ResponseVO;
import com.niu.dataobject.Swiper;
import com.niu.enums.BannerEnum;
import com.niu.service.Impl.SwiperServiceImpl;
import com.niu.utils.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/banner")
public class BannerController {

    @Autowired
    private SwiperServiceImpl swiperService;

    @PostMapping(value = "/addbanner")
    public ResponseVO addBanner(@Valid Swiper swiper , BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            ResponseUtil.error(-1,bindingResult.getFieldError().getDefaultMessage());
        }
        return ResponseUtil.success(swiperService.save(swiper));
    }

    @GetMapping(value = "/getallbanner")
    public ResponseVO getallbanner(){
        return ResponseUtil.success(swiperService.findAll());
    }


    @PostMapping(value = "/offlineBanner")
    public ResponseVO setBanner(@RequestParam("id") Integer id) {
        Swiper swiper = swiperService.findById(id);
        if (swiper.getStatus() == BannerEnum.BANNER_ONLINE.getCode()) {
            swiper.setStatus(BannerEnum.BANNER_OFFLINE.getCode());
            swiperService.save(swiper);
            return ResponseUtil.success();
        } else {
            return ResponseUtil.error(-1, "banner状态不正确");
        }
    }

    @GetMapping(value = "/findonlinebanner")
    public ResponseVO findAllByOnlineStatus() {
        List<Swiper> swiperList = swiperService.findAll();
        List<Swiper> swipers = new ArrayList<>();
        for (Swiper swiper : swiperList) {
            if (swiper.getStatus() == 0) {
                swipers.add(swiper);
            }
        }
        return ResponseUtil.success(swipers);
    }
}
