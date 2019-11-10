package org.hzero.order.hzeroorder24870.app.service.impl;

import io.choerodon.core.domain.Page;
import io.choerodon.mybatis.pagehelper.domain.PageRequest;
import org.hzero.order.hzeroorder24870.app.service.HodrItemService;
import org.hzero.order.hzeroorder24870.domain.entity.HodrItem;
import org.hzero.order.hzeroorder24870.domain.repository.HodrItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ExampleServiceImpl
 */
@Service
public class HodrItemServiceImpl implements HodrItemService {

    @Autowired
    private HodrItemRepository hodrItemRepository;

    @Override
    public Page<HodrItem> findHodrItembyExample(HodrItem hodrItem, PageRequest pageRequest) {
        Page<HodrItem> hodrItemList = hodrItemRepository.pageHodrItem(hodrItem,pageRequest);
        return hodrItemList;
    }
}
