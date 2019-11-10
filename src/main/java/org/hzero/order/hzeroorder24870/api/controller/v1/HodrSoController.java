package org.hzero.order.hzeroorder24870.api.controller.v1;

import io.choerodon.core.domain.Page;
import io.choerodon.core.iam.ResourceLevel;
import io.choerodon.mybatis.pagehelper.domain.PageRequest;
import io.choerodon.swagger.annotation.Permission;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.hzero.boot.platform.lov.annotation.ProcessLovValue;
import org.hzero.core.base.BaseConstants;
import org.hzero.core.util.Results;
import org.hzero.export.annotation.ExcelExport;
import org.hzero.export.vo.ExportParam;
import org.hzero.order.hzeroorder24870.api.dto.OrderDetailsDTO;
import org.hzero.order.hzeroorder24870.api.dto.OrderRecodeDTO;
import org.hzero.order.hzeroorder24870.api.dto.OrderVo;
import org.hzero.order.hzeroorder24870.app.service.OrderService;
import org.hzero.order.hzeroorder24870.config.SwaggerTags;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Api(tags = SwaggerTags.HodrSo)
@RestController("orderController.v1")
@RequestMapping("/v1/hodrso")
public class HodrSoController {

    @Autowired
    private OrderService orderService;

    @ProcessLovValue(targetField = BaseConstants.FIELD_BODY)
    @Permission(level = ResourceLevel.ORGANIZATION)
    @GetMapping("/outline")
    public List<OrderVo> findOrderByCondition(OrderVo orderVo){
        List<OrderVo> orderVoList = null;
        orderVoList = orderService.findOrderByCondition(orderVo);
        return  orderVoList;
    }

    @Permission(level = ResourceLevel.ORGANIZATION)
    @GetMapping("/details")
    public OrderDetailsDTO findHodrSoByOrderNumber(@RequestParam String orderNumber){
        OrderDetailsDTO orderDetailsDTO = orderService.findHodrSoByOrderNumber(orderNumber);
        return orderDetailsDTO;
    }

    @Permission(level = ResourceLevel.ORGANIZATION)
    @ApiOperation(value = "导出Excel", produces = "application/octet-stream")
    @GetMapping("/export")
    @ExcelExport(OrderRecodeDTO.class)
    public ResponseEntity exportHodrSoExcel(ExportParam exportParam, HttpServletResponse response, OrderVo orderVo, PageRequest pageRequest){
        Page<OrderRecodeDTO> orderRecodeDTOPage = orderService.exportHodrSo(orderVo,pageRequest);
        return Results.success(orderRecodeDTOPage);
    }

}