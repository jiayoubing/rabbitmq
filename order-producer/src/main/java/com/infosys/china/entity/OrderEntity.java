package com.infosys.china.entity;

public class OrderEntity
{

    private Long id;

    // 订单名称
    private String name;

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Double getOrderMoney()
    {
        return orderMoney;
    }

    public void setOrderMoney(Double orderMoney)
    {
        this.orderMoney = orderMoney;
    }

    public String getOrderId()
    {
        return orderId;
    }

    public void setOrderId(String orderId)
    {
        this.orderId = orderId;
    }

    // 下单金额
    private Double orderMoney;

    // 订单id
    private String orderId;
}