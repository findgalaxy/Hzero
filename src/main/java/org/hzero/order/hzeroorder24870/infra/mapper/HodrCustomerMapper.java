package org.hzero.order.hzeroorder24870.infra.mapper;

import io.choerodon.mybatis.common.BaseMapper;

import org.hzero.order.hzeroorder24870.domain.entity.HodrCustomer;

import java.util.List;

/**
 * Mapper
 */
public interface HodrCustomerMapper extends BaseMapper<HodrCustomer> {

    List<HodrCustomer> selectHodrCustomerList(HodrCustomer hodrCustomer);

    HodrCustomer selectOneByCustomerNumber(String customerNumber);
}
