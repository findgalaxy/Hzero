package org.hzero.order.hzeroorder24870.infra.mapper;

import io.choerodon.mybatis.common.BaseMapper;
import org.hzero.order.hzeroorder24870.domain.entity.HodrCompany;

import java.util.List;

/**
 * Mapper
 */
public interface HodrCompanyMapper extends BaseMapper<HodrCompany> {

    List<HodrCompany> selectHodrCompanyList(HodrCompany hodrCompany);

    HodrCompany selectOneByCompanyNumber(String companyNumber);
}
