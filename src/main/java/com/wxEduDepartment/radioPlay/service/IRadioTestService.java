package com.wxEduDepartment.radioPlay.service;

import com.wxEduDepartment.radioPlay.entity.RadioAddress;

import java.util.List;

public interface IRadioTestService {

    String testButton(String buttonId);

    List<RadioAddress> radioAddress(String buttonId);
}
