package com.wxEduDepartment.radioPlay.entity;

public class RadioAddress {
    private Integer id;
    private String radioAddress;
    private String picAddress;

    public RadioAddress() {
    }

    public RadioAddress(Integer id, String radioAddress, String picAddress) {
        this.id = id;
        this.radioAddress = radioAddress;
        this.picAddress = picAddress;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRadioAddress() {
        return radioAddress;
    }

    public void setRadioAddress(String radioAddress) {
        this.radioAddress = radioAddress;
    }

    public String getPicAddress() {
        return picAddress;
    }

    public void setPicAddress(String picAddress) {
        this.picAddress = picAddress;
    }

    @Override
    public String toString() {
        return "RadioAddress{" +
                "id=" + id +
                ", radioAddress='" + radioAddress + '\'' +
                ", picAddress='" + picAddress + '\'' +
                '}';
    }
}
