package org.hzero.order.hzeroorder24870.app.service;

import io.choerodon.core.domain.Page;
import io.choerodon.mybatis.pagehelper.domain.PageRequest;
import org.hzero.order.hzeroorder24870.domain.entity.HodrCustomer;

public interface HodrCustomerService {
    Page<HodrCustomer> findCustomerbyExample(HodrCustomer hodrCustomer, PageRequest pageRequest);
}
