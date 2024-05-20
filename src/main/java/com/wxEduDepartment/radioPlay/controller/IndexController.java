package com.wxEduDepartment.radioPlay.controller;

import com.wxEduDepartment.radioPlay.entity.RadioAddress;
import com.wxEduDepartment.radioPlay.service.IIndexService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class IndexController {
    @Resource
    private IIndexService iIndexService;

    @GetMapping("/index")
    public ModelAndView showAHtml() {
        return new ModelAndView("RadioTest/index","time1",0);
    }

    @GetMapping("/index-radioAddress")
    public List<RadioAddress> radioTestAddress(String buttonId){
        return iIndexService.radioAddress(buttonId);
    }
}
