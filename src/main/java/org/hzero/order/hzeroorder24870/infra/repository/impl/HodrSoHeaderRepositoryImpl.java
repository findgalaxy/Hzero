package org.hzero.order.hzeroorder24870.infra.repository.impl;

import org.hzero.mybatis.base.impl.BaseRepositoryImpl;
import org.hzero.order.hzeroorder24870.domain.entity.HodrSoHeader;
import org.hzero.order.hzeroorder24870.domain.repository.HodrSoHeaderRepository;
import org.hzero.order.hzeroorder24870.infra.mapper.HodrSoHeaderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Repository Impl
 */
@Repository
public class HodrSoHeaderRepositoryImpl extends BaseRepositoryImpl<HodrSoHeader> implements HodrSoHeaderRepository {

    @Autowired
    private HodrSoHeaderMapper hodrSoHeaderMapper;


    @Override
    public HodrSoHeader selectOneByOrderNUmber(String orderNumber) {
        HodrSoHeader hodrSoHeader = hodrSoHeaderMapper.selectOneByOrderNUmber(orderNumber);
        return hodrSoHeader;
    }
}
