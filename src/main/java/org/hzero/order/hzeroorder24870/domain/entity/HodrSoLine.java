package org.hzero.order.hzeroorder24870.domain.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.choerodon.mybatis.annotation.ModifyAudit;
import io.choerodon.mybatis.annotation.VersionAudit;
import io.choerodon.mybatis.domain.AuditDomain;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@ModifyAudit
@VersionAudit
@JsonInclude(JsonInclude.Include.NON_NULL)
@Table(name = "hodr_so_line")
public class HodrSoLine extends AuditDomain {

  @Id
  @GeneratedValue
  private long soLineId;
  @NotNull(message = "error.code.null")
  private long soHeaderId;
  @NotNull(message = "error.code.null")
  private long lineNumber;
  @NotNull(message = "error.code.null")
  private long itemId;
  @NotNull(message = "error.code.null")
  private double orderQuantity;
  @NotNull(message = "error.code.null")
  private String orderQuantityUom;
  @NotNull(message = "error.code.null")
  private double unitSellingPrice;
  @NotNull(message = "error.code.null")
  private String description;
  @NotNull(message = "error.code.null")
  private String addition1;
  @NotNull(message = "error.code.null")
  private String addition2;
  @NotNull(message = "error.code.null")
  private String addition3;
  @NotNull(message = "error.code.null")
  private String addition4;
  @NotNull(message = "error.code.null")
  private String addition5;

  @Id
  @GeneratedValue
  public long getSoLineId() {
    return soLineId;
  }

  public void setSoLineId(long soLineId) {
    this.soLineId = soLineId;
  }

  public long getSoHeaderId() {
    return soHeaderId;
  }

  public void setSoHeaderId(long soHeaderId) {
    this.soHeaderId = soHeaderId;
  }

  public long getLineNumber() {
    return lineNumber;
  }

  public void setLineNumber(long lineNumber) {
    this.lineNumber = lineNumber;
  }

  public long getItemId() {
    return itemId;
  }

  public void setItemId(long itemId) {
    this.itemId = itemId;
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
}
