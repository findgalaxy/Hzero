package org.hzero.order.hzeroorder24870.domain.repository;

import io.choerodon.core.domain.Page;
import io.choerodon.mybatis.pagehelper.domain.PageRequest;
import org.hzero.mybatis.base.BaseRepository;
import org.hzero.order.hzeroorder24870.domain.entity.HodrCustomer;

/**
 * Repository
 */
public interface HodrCustomerRepository extends BaseRepository<HodrCustomer> {

    Page<HodrCustomer> pageHodrCustomer(HodrCustomer hodrCustomer, PageRequest pageRequest);

    HodrCustomer selectOneByCustomerNumber(String customerNumber);
}
