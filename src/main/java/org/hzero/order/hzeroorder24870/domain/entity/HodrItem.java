package org.hzero.order.hzeroorder24870.domain.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.choerodon.mybatis.annotation.ModifyAudit;
import io.choerodon.mybatis.annotation.VersionAudit;
import io.choerodon.mybatis.domain.AuditDomain;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.sql.Date;

@ModifyAudit
@VersionAudit
@JsonInclude(JsonInclude.Include.NON_NULL)
@Table(name = "hodr_item")
public class HodrItem extends AuditDomain {

  @Id
  @GeneratedValue
  private long itemId;
  @NotNull(message = "error.code.null")
  private String itemCode;
  @NotNull(message = "error.code.null")
  private String itemUom;
  @NotNull(message = "error.code.null")
  private String itemDescription;
  @NotNull(message = "error.code.null")
  private long saleableFlag;
  @NotNull(message = "error.code.null")
  private Date startActiveDate;
  @NotNull(message = "error.code.null")
  private Date endActiveDate;
  @NotNull(message = "error.code.null")
  private long enabledFlag;

  public long getItemId() {
    return itemId;
  }

  public void setItemId(long itemId) {
    this.itemId = itemId;
  }

  public String getItemCode() {
    return itemCode;
  }

  public void setItemCode(String itemCode) {
    this.itemCode = itemCode;
  }

  public String getItemUom() {
    return itemUom;
  }

  public void setItemUom(String itemUom) {
    this.itemUom = itemUom;
  }

  public String getItemDescription() {
    return itemDescription;
  }

  public void setItemDescription(String itemDescription) {
    this.itemDescription = itemDescription;
  }

  public long getSaleableFlag() {
    return saleableFlag;
  }

  public void setSaleableFlag(long saleableFlag) {
    this.saleableFlag = saleableFlag;
  }

  public Date getStartActiveDate() {
    return startActiveDate;
  }

  public void setStartActiveDate(Date startActiveDate) {
    this.startActiveDate = startActiveDate;
  }

  public Date getEndActiveDate() {
    return endActiveDate;
  }

  public void setEndActiveDate(Date endActiveDate) {
    this.endActiveDate = endActiveDate;
  }

  public long getEnabledFlag() {
    return enabledFlag;
  }

  public void setEnabledFlag(long enabledFlag) {
    this.enabledFlag = enabledFlag;
  }

}
