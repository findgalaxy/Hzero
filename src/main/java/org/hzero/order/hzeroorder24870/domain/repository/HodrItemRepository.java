package org.hzero.order.hzeroorder24870.domain.repository;

import io.choerodon.core.domain.Page;
import io.choerodon.mybatis.pagehelper.domain.PageRequest;
import org.hzero.mybatis.base.BaseRepository;
import org.hzero.order.hzeroorder24870.domain.entity.HodrItem;

/**
 * Repository
 */
public interface HodrItemRepository extends BaseRepository<HodrItem> {

    Page<HodrItem> pageHodrItem(HodrItem hodrItem, PageRequest pageRequest);

    HodrItem selectOneByItemCode(String itemCode);
}
