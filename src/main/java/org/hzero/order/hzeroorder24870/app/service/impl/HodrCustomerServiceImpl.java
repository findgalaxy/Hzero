package org.hzero.order.hzeroorder24870.app.service.impl;

import io.choerodon.core.domain.Page;
import io.choerodon.mybatis.pagehelper.domain.PageRequest;
import org.hzero.order.hzeroorder24870.app.service.HodrCustomerService;
import org.hzero.order.hzeroorder24870.domain.entity.HodrCustomer;
import org.hzero.order.hzeroorder24870.domain.repository.HodrCustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ExampleServiceImpl
 */
@Service
public class HodrCustomerServiceImpl implements HodrCustomerService {

    @Autowired
    private HodrCustomerRepository hodrCustomerRepository;

    @Override
    public Page<HodrCustomer> findCustomerbyExample(HodrCustomer hodrCustomer, PageRequest pageRequest) {
        Page<HodrCustomer> customerList = hodrCustomerRepository.pageHodrCustomer(hodrCustomer,pageRequest);
        return customerList;
    }
}
