package org.hzero.order.hzeroorder24870.app.service;


import org.hzero.order.hzeroorder24870.domain.entity.HodrSoLine;

public interface HodrSoLineService {

    int postHodrSoHeader(HodrSoLine hodrSoLine);

    HodrSoLine findHodrSoHeader(Long soLineId);

    int updateHodrSoHeader(HodrSoLine hodrSoLine);

    int deleteHodrSoHeader(Long soLineId);
}
