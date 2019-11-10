package org.hzero.order.hzeroorder24870.infra.mapper;

import io.choerodon.mybatis.common.BaseMapper;
import org.hzero.order.hzeroorder24870.domain.entity.HodrSoHeader;
import org.springframework.stereotype.Repository;

/**
 * Mapper
 */
@Repository
public interface HodrSoHeaderMapper extends BaseMapper<HodrSoHeader> {

    HodrSoHeader selectOneByOrderNUmber(String orderNumber);
}
