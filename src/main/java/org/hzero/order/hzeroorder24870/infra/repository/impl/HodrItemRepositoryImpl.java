package org.hzero.order.hzeroorder24870.infra.repository.impl;

import io.choerodon.core.domain.Page;
import io.choerodon.mybatis.pagehelper.PageHelper;
import io.choerodon.mybatis.pagehelper.domain.PageRequest;
import org.hzero.mybatis.base.impl.BaseRepositoryImpl;
import org.hzero.order.hzeroorder24870.domain.entity.HodrItem;
import org.hzero.order.hzeroorder24870.domain.repository.HodrItemRepository;
import org.hzero.order.hzeroorder24870.infra.mapper.HodrItemMapper;
import org.springframework.stereotype.Repository;

/**
 * Repository Impl
 */
@Repository
public class HodrItemRepositoryImpl extends BaseRepositoryImpl<HodrItem> implements HodrItemRepository {

    private HodrItemMapper hodrItemMapper;

    public HodrItemRepositoryImpl(HodrItemMapper hodrItemMapper){
        this.hodrItemMapper = hodrItemMapper;
    }

    @Override
    public Page<HodrItem> pageHodrItem(HodrItem hodrItem, PageRequest pageRequest) {
        return PageHelper.doPage(pageRequest,() ->hodrItemMapper.selectHodrItemList(hodrItem));
    }

    @Override
    public HodrItem selectOneByItemCode(String itemCode) {
        HodrItem hodrItem = hodrItemMapper.selectOneByItemCode(itemCode);
        return hodrItem;
}


}
