package org.hzero.order.hzeroorder24870.api.dto;

import org.hzero.order.hzeroorder24870.domain.entity.HodrSoHeader;
import org.hzero.order.hzeroorder24870.domain.entity.HodrSoLine;

import java.util.List;

public class OrderDetailsDTO extends HodrSoHeader {

    private List<HodrSoLine> hodrSoLineList;

    public List<HodrSoLine> getHodrSoLineList() {
        return hodrSoLineList;
    }

    public void setHodrSoLineList(List<HodrSoLine> hodrSoLineList) {
        this.hodrSoLineList = hodrSoLineList;
    }
}
