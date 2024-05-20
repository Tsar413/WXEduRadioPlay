package com.wxEduDepartment.radioPlay.utils;

import com.wxEduDepartment.radioPlay.entity.RadioAddress;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ButtonIdToRadioId {

    public List<RadioAddress> changeButtonIdToRadioId(String buttonId){
        //String serverPath = "http://localhost:8092/";
//        String radioId = "radio/" + buttonId + ".mp3";
//        String picId = "pic/" + buttonId + ".jpg";
        String radioId = "audio/" + buttonId + ".mp3";
        String picId = "images/" + buttonId + ".jpg";
        RadioAddress radioAddress = new RadioAddress();
        radioAddress.setId(Integer.parseInt(buttonId));
//        radioAddress.setPicAddress(serverPath + picId);
//        radioAddress.setRadioAddress(serverPath + radioId);
        radioAddress.setPicAddress(picId);
        radioAddress.setRadioAddress(radioId);
        List<RadioAddress> list = new ArrayList<RadioAddress>();
        list.add(radioAddress);
        return list;
    }
}
