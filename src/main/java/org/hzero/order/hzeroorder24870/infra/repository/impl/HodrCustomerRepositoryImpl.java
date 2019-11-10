package org.hzero.order.hzeroorder24870.infra.repository.impl;

import io.choerodon.core.domain.Page;
import io.choerodon.mybatis.pagehelper.PageHelper;
import io.choerodon.mybatis.pagehelper.domain.PageRequest;
import org.hzero.mybatis.base.impl.BaseRepositoryImpl;
import org.hzero.order.hzeroorder24870.domain.entity.HodrCustomer;
import org.hzero.order.hzeroorder24870.domain.repository.HodrCustomerRepository;
import org.hzero.order.hzeroorder24870.infra.mapper.HodrCustomerMapper;
import org.springframework.stereotype.Repository;

/**
 * Repository Impl
 */
@Repository
public class HodrCustomerRepositoryImpl extends BaseRepositoryImpl<HodrCustomer> implements HodrCustomerRepository {

    private HodrCustomerMapper hodrCustomerMapper;

    public HodrCustomerRepositoryImpl(HodrCustomerMapper hodrCustomerMapper){
        this.hodrCustomerMapper = hodrCustomerMapper;
    }

    @Override
    public Page<HodrCustomer> pageHodrCustomer(HodrCustomer hodrCustomer, PageRequest pageRequest) {
        return PageHelper.doPage(pageRequest,() -> hodrCustomerMapper.selectHodrCustomerList(hodrCustomer));
    }

    @Override
    public HodrCustomer selectOneByCustomerNumber(String customerNumber) {
        HodrCustomer hodrCustomer = hodrCustomerMapper.selectOneByCustomerNumber(customerNumber);
        return hodrCustomer;
    }
}
