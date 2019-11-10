package org.hzero.order.hzeroorder24870.app.service.impl;

import io.choerodon.core.domain.Page;
import io.choerodon.mybatis.pagehelper.PageHelper;
import io.choerodon.mybatis.pagehelper.domain.PageRequest;
import org.hzero.order.hzeroorder24870.api.dto.OrderDetailsDTO;
import org.hzero.order.hzeroorder24870.api.dto.OrderRecodeDTO;
import org.hzero.order.hzeroorder24870.api.dto.OrderVo;
import org.hzero.order.hzeroorder24870.app.service.OrderService;
import org.hzero.order.hzeroorder24870.infra.mapper.HodrSoMapper;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ExampleServiceImpl
 */
@Service
public class OrderServiceImpl implements OrderService {
    private HodrSoMapper hodrSoMapper;

    public OrderServiceImpl(HodrSoMapper hodrSoMapper){
        this.hodrSoMapper = hodrSoMapper;
    }

    @Override
    public List<OrderVo> findOrderByCondition(OrderVo orderVo) {
        List<OrderVo> orderVoList = hodrSoMapper.findOrderByCondition(orderVo);
        return orderVoList;
    }

    @Override
    public OrderDetailsDTO findHodrSoByOrderNumber(String orderNumber) {
        OrderDetailsDTO orderDetailsDTO = hodrSoMapper.findHodrSoByOrderNumber(orderNumber);
        return orderDetailsDTO;
    }

    @Override
    public Page<OrderRecodeDTO> exportHodrSo(OrderVo orderVo, PageRequest pageRequest) {
        Page<OrderRecodeDTO> orderRecodeDTOPage = PageHelper.doPage(pageRequest, () -> hodrSoMapper.exportHodrSo(orderVo));
        return orderRecodeDTOPage;
    }
}
