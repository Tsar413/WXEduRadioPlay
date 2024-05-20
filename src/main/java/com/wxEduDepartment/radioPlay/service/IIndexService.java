package com.wxEduDepartment.radioPlay.service;

import com.wxEduDepartment.radioPlay.entity.RadioAddress;

import java.util.List;

public interface IIndexService {
    List<RadioAddress> radioAddress(String buttonId);
}
