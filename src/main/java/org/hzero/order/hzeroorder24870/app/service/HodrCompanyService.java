package org.hzero.order.hzeroorder24870.app.service;

import io.choerodon.core.domain.Page;
import io.choerodon.mybatis.pagehelper.domain.PageRequest;

import org.hzero.order.hzeroorder24870.domain.entity.HodrCompany;

public interface HodrCompanyService {

    Page<HodrCompany> findCompanybyExample(HodrCompany hodrCompany, PageRequest pageRequest);
}
