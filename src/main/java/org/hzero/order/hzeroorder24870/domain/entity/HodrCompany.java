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
@Table(name = "hodr_company")
public class HodrCompany extends AuditDomain {

  @Id
  @GeneratedValue
  private long companyId;
  @NotNull(message = "error.companyId.null")
  private String companyNumber;
  @NotNull(message = "error.companyNumber.null")
  private String companyName;
  @NotNull(message = "error.companyName.null")
  private long enabledFlag;

  public long getCompanyId() {
    return companyId;
  }


  public void setCompanyId(long companyId) {
    this.companyId = companyId;
  }

  public String getCompanyNumber() {
    return companyNumber;
  }

  public void setCompanyNumber(String companyNumber) {
    this.companyNumber = companyNumber;
  }

  public String getCompanyName() {
    return companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  public long getEnabledFlag() {
    return enabledFlag;
  }

  public void setEnabledFlag(long enabledFlag) {
    this.enabledFlag = enabledFlag;
  }
}
