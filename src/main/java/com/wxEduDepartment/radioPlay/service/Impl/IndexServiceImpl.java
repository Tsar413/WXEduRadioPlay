package com.wxEduDepartment.radioPlay.service.Impl;

import com.wxEduDepartment.radioPlay.entity.RadioAddress;
import com.wxEduDepartment.radioPlay.service.IIndexService;
import com.wxEduDepartment.radioPlay.utils.ButtonIdToRadioId;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class IndexServiceImpl implements IIndexService {
    @Resource
    private ButtonIdToRadioId buttonIdToRadioId;

    @Override
    public List<RadioAddress> radioAddress(String buttonId) {
        if(buttonId == null || buttonId.equals("")){
            return null;
        }
        if(Integer.parseInt(buttonId) >= 7 || Integer.parseInt(buttonId) <= 0){
            return null;
        }
        return buttonIdToRadioId.changeButtonIdToRadioId(buttonId);
    }
}
