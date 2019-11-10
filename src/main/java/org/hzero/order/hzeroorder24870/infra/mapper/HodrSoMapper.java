package org.hzero.order.hzeroorder24870.infra.mapper;
import org.hzero.order.hzeroorder24870.api.dto.OrderDetailsDTO;
import org.hzero.order.hzeroorder24870.api.dto.OrderRecodeDTO;
import org.hzero.order.hzeroorder24870.api.dto.OrderVo;

import java.util.List;

/**
 * Mapper
 */
public interface HodrSoMapper{

    List<OrderVo> findOrderByCondition(OrderVo orderVo);

    OrderDetailsDTO findHodrSoByOrderNumber(String orderNumber);

    List<OrderRecodeDTO> exportHodrSo(OrderVo orderVo);
}
