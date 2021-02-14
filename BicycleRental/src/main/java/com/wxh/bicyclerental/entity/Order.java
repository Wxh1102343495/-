package com.wxh.bicyclerental.entity;

import java.io.Serializable;
import java.sql.Date;

public class Order implements Serializable {
    //订单编号
    private Integer orderId;
    //用户id
    private Integer userId;
    //自行车编码
    private Integer bicycleId;
    //订单开始时间
    private Date startDate;
    //订单结束时间
    private Date endDate;
    //租金
    private Float rant;
    //订单状态（0已完成，1正在进行）
    private Integer state;
    //订单评价
    private String evaluation;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getBicycleId() {
        return bicycleId;
    }

    public void setBicycleId(Integer bicycleId) {
        this.bicycleId = bicycleId;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Float getRant() {
        return rant;
    }

    public void setRant(Float rant) {
        this.rant = rant;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getEvaluation() {
        return evaluation;
    }

    public void setEvaluation(String evaluation) {
        this.evaluation = evaluation;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", userId=" + userId +
                ", bicycleId=" + bicycleId +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", rant=" + rant +
                ", state=" + state +
                ", evaluation='" + evaluation + '\'' +
                '}';
    }
}
