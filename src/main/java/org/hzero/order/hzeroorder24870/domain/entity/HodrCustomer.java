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
@Table(name = "hodr_customer")
public class HodrCustomer extends AuditDomain {

  @Id
  @GeneratedValue
  private long customerId;
  @NotNull(message = "error.code.null")  private String customerNumber;
  private String customerName;
  @NotNull(message = "error.code.null")
  private long companyId;
  @NotNull(message = "error.code.null")
  private long enabledFlag;

  public long getCustomerId() {
    return customerId;
  }


  public void setCustomerId(long customerId) {
    this.customerId = customerId;
  }

  public String getCustomerNumber() {
    return customerNumber;
  }

  public void setCustomerNumber(String customerNumber) {
    this.customerNumber = customerNumber;
  }

  public String getCustomerName() {
    return customerName;
  }

  public void setCustomerName(String customerName) {
    this.customerName = customerName;
  }

  public long getCompanyId() {
    return companyId;
  }

  public void setCompanyId(long companyId) {
    this.companyId = companyId;
  }

  public long getEnabledFlag() {
    return enabledFlag;
  }

  public void setEnabledFlag(long enabledFlag) {
    this.enabledFlag = enabledFlag;
  }
}
