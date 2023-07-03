package com.rickey.service;

import com.rickey.pojo.SimpleBean;

public class SimpleBeanService {

    private int fakeId;
    private String fakeName;

    public SimpleBeanService(SimpleBean simpleBean) {
        this.fakeId= simpleBean.getId();
        this.fakeName= simpleBean.getName();
    }

    @Override
    public String toString() {
        return "SimpleBeanService{" +
                "fakeId=" + fakeId +
                ", fakeName='" + fakeName + '\'' +
                '}';
    }
}
