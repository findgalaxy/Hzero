package org.hzero.order.hzeroorder24870.api.dto;


import org.hzero.boot.platform.lov.annotation.LovValue;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Date;

@Component
public class OrderVo implements Serializable{

    private String orderNumber;
    private String companyName;
    private String customerName;
    private Date orderDate;
    private String itemCode;
    @LovValue(lovCode = "ORDER-STATUS")
    private String orderStatus;


    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }
}
