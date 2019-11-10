package org.hzero.order.hzeroorder24870.app.service;

import io.choerodon.core.domain.Page;
import io.choerodon.mybatis.pagehelper.domain.PageRequest;
import org.hzero.order.hzeroorder24870.api.dto.OrderDetailsDTO;
import org.hzero.order.hzeroorder24870.api.dto.OrderRecodeDTO;
import org.hzero.order.hzeroorder24870.api.dto.OrderVo;

import java.util.List;

public interface OrderService {

    List<OrderVo> findOrderByCondition(OrderVo orderVo);

    OrderDetailsDTO findHodrSoByOrderNumber(String orderNumber);

    Page<OrderRecodeDTO> exportHodrSo(OrderVo orderVo, PageRequest pageRequest);
}
