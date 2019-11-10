package org.hzero.order.hzeroorder24870.domain.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.choerodon.mybatis.annotation.ModifyAudit;
import io.choerodon.mybatis.annotation.VersionAudit;
import io.choerodon.mybatis.domain.AuditDomain;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.util.Date;

@ModifyAudit
@VersionAudit
@JsonInclude(JsonInclude.Include.NON_NULL)
@Table(name = "hodr_so_header")
public class HodrSoHeader extends AuditDomain {

  @Id
  @GeneratedValue
  private long soHeaderId;
  @NotNull(message = "error.code.null")
  private String orderNumber;
  @NotNull(message = "error.code.null")
  private long companyId;
  @NotNull(message = "error.code.null")
  private Date orderDate;
  @NotNull(message = "error.code.null")
  private String orderStatus;
  @NotNull(message = "error.code.null")
  private long customerId;


  public long getSoHeaderId() {
    return soHeaderId;
  }

  public void setSoHeaderId(long soHeaderId) {
    this.soHeaderId = soHeaderId;
  }

  public String getOrderNumber() {
    return orderNumber;
  }

  public void setOrderNumber(String orderNumber) {
    this.orderNumber = orderNumber;
  }

  public long getCompanyId() {
    return companyId;
  }

  public void setCompanyId(long companyId) {
    this.companyId = companyId;
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

  public long getCustomerId() {
    return customerId;
  }

  public void setCustomerId(long customerId) {
    this.customerId = customerId;
  }

}
