package org.hzero.order.hzeroorder24870.app.service.impl;

import org.hzero.order.hzeroorder24870.app.service.HodrSoHeaderService;
import org.hzero.order.hzeroorder24870.domain.entity.HodrSoHeader;
import org.hzero.order.hzeroorder24870.domain.entity.HodrSoLine;
import org.hzero.order.hzeroorder24870.domain.repository.HodrSoHeaderRepository;
import org.hzero.order.hzeroorder24870.domain.repository.HodrSoLineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ExampleServiceImpl
 */
@Service
public class HodrSoHeaderServiceImpl implements HodrSoHeaderService {

    @Autowired
    private HodrSoHeaderRepository hodrSoHeaderRepository;

    @Autowired
    private HodrSoLineRepository hodrSoLineRepository;

    @Override
    public int postHodrSoHeader(HodrSoHeader hodrSoHeader) {
        int insert = hodrSoHeaderRepository.insert(hodrSoHeader);
        return insert;
    }

    @Override
    public HodrSoHeader findHodrSoHeader(Long soHeaderId) {
        HodrSoHeader hodrSoHeader = hodrSoHeaderRepository.selectByPrimaryKey(soHeaderId);
        return hodrSoHeader;
    }

    @Override
    public int putHodrSoHeader(HodrSoHeader hodrSoHeader) {
        int update = hodrSoHeaderRepository.updateByPrimaryKey(hodrSoHeader);
        return update;
    }

    @Override
    public int deleteHodrSoHeader(Long soHeaderId) {
        int deleteHeader = hodrSoHeaderRepository.deleteByPrimaryKey(soHeaderId);
        if(deleteHeader!=0){
            List<HodrSoLine> hodrSoLineList = hodrSoLineRepository.select("soHeaderId", soHeaderId);
            hodrSoLineRepository.batchDelete(hodrSoLineList);
        }
        return deleteHeader;
    }
}
