package org.hzero.order.hzeroorder24870.app.service.impl;

import org.hzero.order.hzeroorder24870.app.service.HodrSoLineService;
import org.hzero.order.hzeroorder24870.domain.entity.HodrSoLine;
import org.hzero.order.hzeroorder24870.domain.repository.HodrSoLineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ExampleServiceImpl
 */
@Service
public class HodrSoLineServiceImpl implements HodrSoLineService {

    @Autowired
    private HodrSoLineRepository hodrSoLineRepository;


    @Override
    public int postHodrSoHeader(HodrSoLine hodrSoLine) {
        int insert = hodrSoLineRepository.insert(hodrSoLine);
        return insert;
    }

    @Override
    public HodrSoLine findHodrSoHeader(Long soLineId) {
        HodrSoLine hodrSoLine = hodrSoLineRepository.selectByPrimaryKey(soLineId);
        return hodrSoLine;
    }

    @Override
    public int updateHodrSoHeader(HodrSoLine hodrSoLine) {
        int update = hodrSoLineRepository.updateByPrimaryKey(hodrSoLine);
        return update;
    }

    @Override
    public int deleteHodrSoHeader(Long soLineId) {
        int delete = hodrSoLineRepository.deleteByPrimaryKey(soLineId);
        return delete;
    }
}
