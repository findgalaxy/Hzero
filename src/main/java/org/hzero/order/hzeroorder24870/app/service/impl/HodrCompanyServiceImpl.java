package org.hzero.order.hzeroorder24870.app.service.impl;

import io.choerodon.core.domain.Page;
import io.choerodon.mybatis.pagehelper.domain.PageRequest;
import org.hzero.order.hzeroorder24870.app.service.HodrCompanyService;
import org.hzero.order.hzeroorder24870.domain.entity.HodrCompany;
import org.hzero.order.hzeroorder24870.domain.repository.HodrCompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ExampleServiceImpl
 */
@Service
public class HodrCompanyServiceImpl implements HodrCompanyService {


    @Autowired
    private HodrCompanyRepository hodrCompanyRepository;

    @Override
    public Page<HodrCompany> findCompanybyExample(HodrCompany hodrCompany, PageRequest pageRequest) {
        Page<HodrCompany> hodrCompanyList = hodrCompanyRepository.pageHodrCompany(hodrCompany,pageRequest);
        return  hodrCompanyList;
    }
}
