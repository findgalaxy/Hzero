package org.hzero.order.hzeroorder24870.app.service;


import org.hzero.order.hzeroorder24870.domain.entity.HodrSoHeader;

public interface HodrSoHeaderService {
    int postHodrSoHeader(HodrSoHeader hodrSoHeader);

    HodrSoHeader findHodrSoHeader(Long soHeaderId);

    int putHodrSoHeader(HodrSoHeader hodrSoHeader);

    int deleteHodrSoHeader(Long soHeaderId);
}
