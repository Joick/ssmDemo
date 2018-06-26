package com.simpledemo.dto;

import com.simpledemo.entity.Appointment;
import com.simpledemo.enums.AppointStateEnum;

/**
 * 封装预约执行后结果
 */
public class AppointExecution {

    private long bookId; // 图书ID
    private int state; // 秒杀预约结果描述
    private String stateInfo; // 状态标识
    private Appointment appointment; // 预约成功对象

    public AppointExecution() {

    }

    // 预约成失败的构造器
    public AppointExecution(long bookId, AppointStateEnum stateEnum) {
        this.bookId = bookId;
        this.state = state;
        this.stateInfo = stateInfo;
    }

    // 预约成功的构造器
    public AppointExecution(long bookId, AppointStateEnum stateEnum, Appointment apointment) {
        this.bookId = bookId;
        this.state = stateEnum.getState();
        this.stateInfo = stateEnum.getStateInfo();
        this.appointment = appointment;
    }

    public long getBookId() {
        return bookId;
    }

    public void setBookId(long bookId) {
        this.bookId = bookId;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getStateInfo() {
        return stateInfo;
    }

    public void setStateInfo(String stateInfo) {
        this.stateInfo = stateInfo;
    }

    public Appointment getAppointment() {
        return appointment;
    }

    public void setAppointment(Appointment appointment) {
        this.appointment = appointment;
    }

    @Override
    public String toString() {
        return "AppointExecution [bookId=" + bookId + ", state=" + state + ", stateInfo=" + stateInfo + ", appointment="
                + appointment + "]";
    }

}
