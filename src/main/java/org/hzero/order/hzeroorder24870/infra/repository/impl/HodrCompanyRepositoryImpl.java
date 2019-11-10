package org.hzero.order.hzeroorder24870.infra.repository.impl;

import io.choerodon.core.domain.Page;
import io.choerodon.mybatis.pagehelper.PageHelper;
import io.choerodon.mybatis.pagehelper.domain.PageRequest;
import org.hzero.mybatis.base.impl.BaseRepositoryImpl;
import org.hzero.order.hzeroorder24870.domain.entity.HodrCompany;
import org.hzero.order.hzeroorder24870.domain.repository.HodrCompanyRepository;
import org.hzero.order.hzeroorder24870.infra.mapper.HodrCompanyMapper;
import org.springframework.stereotype.Repository;

/**
 * Repository Impl
 */
@Repository
public class HodrCompanyRepositoryImpl extends BaseRepositoryImpl<HodrCompany> implements HodrCompanyRepository {

    private HodrCompanyMapper hodrCompanyMapper;

    public HodrCompanyRepositoryImpl(HodrCompanyMapper hodrCompanyMapper){
        this.hodrCompanyMapper = hodrCompanyMapper;
    }

    @Override
    public Page<HodrCompany> pageHodrCompany(HodrCompany hodrCompany, PageRequest pageRequest) {
        return PageHelper.doPage(pageRequest, () -> hodrCompanyMapper.selectHodrCompanyList(hodrCompany));
    }

    @Override
    public HodrCompany selectOneByCompanyNumber(String companyNumber) {
        HodrCompany hodrCompany = hodrCompanyMapper.selectOneByCompanyNumber(companyNumber);
        return hodrCompany;
    }
}
