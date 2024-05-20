package com.wxEduDepartment.radioPlay.controller;

import com.wxEduDepartment.radioPlay.entity.RadioAddress;
import com.wxEduDepartment.radioPlay.service.IRadioTestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class RadioTestController {
    @Resource
    public IRadioTestService radioTestService;

    @GetMapping("/radioTest")
    public ModelAndView showAHtml() {
        return new ModelAndView("RadioTest/RadioTest","time1",0);
    }

    @GetMapping("/radioTest-testButton")
    public String radioTestTestButton(String buttonId){
        return radioTestService.testButton(buttonId);
    }

    @GetMapping("/radioTest-radioAddress")
    public List<RadioAddress> radioTestAddress(String buttonId){
        return radioTestService.radioAddress(buttonId);
    }
}
