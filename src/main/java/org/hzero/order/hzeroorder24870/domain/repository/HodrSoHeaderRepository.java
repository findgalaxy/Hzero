package org.hzero.order.hzeroorder24870.domain.repository;

import org.hzero.mybatis.base.BaseRepository;

import org.hzero.order.hzeroorder24870.domain.entity.HodrSoHeader;

/**
 * Repository
 */
public interface HodrSoHeaderRepository extends BaseRepository<HodrSoHeader> {

    HodrSoHeader selectOneByOrderNUmber(String orderNumber);
}
