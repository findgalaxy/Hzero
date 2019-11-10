package org.hzero.order.hzeroorder24870.infra.mapper;

import io.choerodon.mybatis.common.BaseMapper;

import org.hzero.order.hzeroorder24870.domain.entity.HodrItem;

import java.util.List;

/**
 * Mapper
 */
public interface HodrItemMapper extends BaseMapper<HodrItem> {

    List<HodrItem> selectHodrItemList(HodrItem hodrItem);

    HodrItem selectOneByItemCode(String itemCode);
}
