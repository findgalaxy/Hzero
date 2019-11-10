package org.hzero.order.hzeroorder24870.domain.repository;

import io.choerodon.core.domain.Page;
import io.choerodon.mybatis.pagehelper.domain.PageRequest;
import org.hzero.mybatis.base.BaseRepository;
import org.hzero.order.hzeroorder24870.domain.entity.HodrCompany;

/**
 * Repository
 */
public interface HodrCompanyRepository extends BaseRepository<HodrCompany> {


    Page<HodrCompany> pageHodrCompany(HodrCompany hodrCompany, PageRequest pageRequest);

    HodrCompany selectOneByCompanyNumber(String companyNumber);
}
