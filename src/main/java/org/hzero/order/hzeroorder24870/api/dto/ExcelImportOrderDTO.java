package org.hzero.order.hzeroorder24870.api.dto;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

public class ExcelImportOrderDTO implements Serializable {

    private String orderNumber;
    private String companyNumber;
    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    private Date orderDate;
    private String orderStatus;
    private String customerNumber;
    private Long lineNumber;
    private String itemCode;
    private double orderQuantity;
    private String orderQuantityUom;
    private double unitSellingPrice;
    private String description;
    private String addition1;
    private String addition2;
    private String addition3;
    private String addition4;
    private String addition5;

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getCompanyNumber() {
        return companyNumber;
    }

    public void setCompanyNumber(String companyNumber) {
        this.companyNumber = companyNumber;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    public Long getLineNumber() {
        return lineNumber;
    }

    public void setLineNumber(Long lineNumber) {
        this.lineNumber = lineNumber;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public double getOrderQuantity() {
        return orderQuantity;
    }

    public void setOrderQuantity(double orderQuantity) {
        this.orderQuantity = orderQuantity;
    }

    public String getOrderQuantityUom() {
        return orderQuantityUom;
    }

    public void setOrderQuantityUom(String orderQuantityUom) {
        this.orderQuantityUom = orderQuantityUom;
    }

    public double getUnitSellingPrice() {
        return unitSellingPrice;
    }

    public void setUnitSellingPrice(double unitSellingPrice) {
        this.unitSellingPrice = unitSellingPrice;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAddition1() {
        return addition1;
    }

    public void setAddition1(String addition1) {
        this.addition1 = addition1;
    }

    public String getAddition2() {
        return addition2;
    }

    public void setAddition2(String addition2) {
        this.addition2 = addition2;
    }

    public String getAddition3() {
        return addition3;
    }

    public void setAddition3(String addition3) {
        this.addition3 = addition3;
    }

    public String getAddition4() {
        return addition4;
    }

    public void setAddition4(String addition4) {
        this.addition4 = addition4;
    }

    public String getAddition5() {
        return addition5;
    }

    public void setAddition5(String addition5) {
        this.addition5 = addition5;
    }

    @Override
    public String toString() {
        return "ExcelImportOrderDTO{" +
                "orderNumber='" + orderNumber + '\'' +
                ", companyNumber='" + companyNumber + '\'' +
                ", orderDate=" + orderDate +
                ", orderStatus='" + orderStatus + '\'' +
                ", customerNumber='" + customerNumber + '\'' +
                ", lineNumber=" + lineNumber +
                ", itemCode='" + itemCode + '\'' +
                ", orderQuantity=" + orderQuantity +
                ", orderQuantityUom='" + orderQuantityUom + '\'' +
                ", unitSellingPrice=" + unitSellingPrice +
                ", description='" + description + '\'' +
                ", addition1='" + addition1 + '\'' +
                ", addition2='" + addition2 + '\'' +
                ", addition3='" + addition3 + '\'' +
                ", addition4='" + addition4 + '\'' +
                ", addition5='" + addition5 + '\'' +
                '}';
    }
}
