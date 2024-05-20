package com.wxEduDepartment.radioPlay.service.Impl;

import com.wxEduDepartment.radioPlay.entity.RadioAddress;
import com.wxEduDepartment.radioPlay.service.IRadioTestService;
import com.wxEduDepartment.radioPlay.utils.ButtonIdToRadioId;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class RadioTestServiceImpl implements IRadioTestService {
    @Resource
    private ButtonIdToRadioId buttonIdToRadioId;

    @Override
    public String testButton(String buttonId) {
        return "Button " + buttonId + " could work";
    }

    @Override
    public List<RadioAddress> radioAddress(String buttonId) {
        if(Integer.parseInt(buttonId) >= 6){
            return null;
        }
        return buttonIdToRadioId.changeButtonIdToRadioId(buttonId);
    }
}
