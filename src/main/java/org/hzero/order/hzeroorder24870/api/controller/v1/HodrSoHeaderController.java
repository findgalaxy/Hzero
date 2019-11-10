package org.hzero.order.hzeroorder24870.api.controller.v1;

import io.choerodon.core.iam.ResourceLevel;
import io.choerodon.swagger.annotation.Permission;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.hzero.order.hzeroorder24870.app.service.HodrSoHeaderService;
import org.hzero.order.hzeroorder24870.config.SwaggerTags;
import org.hzero.order.hzeroorder24870.domain.entity.HodrSoHeader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@Api(tags = SwaggerTags.HodrSoHeader)
@RestController(value = "hodrSoHeaderController.v1")
@RequestMapping("/v1/{organizationId}/soheader")
public class HodrSoHeaderController {

    @Autowired
    private HodrSoHeaderService hodrSoHeaderService;

    @Permission(level = ResourceLevel.ORGANIZATION)
    @ApiOperation(value = "订单新增")
    @PostMapping
    public String postHodrSoHeader(HodrSoHeader hodrSoHeader){
        hodrSoHeader.setOrderDate(new Date());
        int flag = hodrSoHeaderService.postHodrSoHeader(hodrSoHeader);
        return flag==0?"新增失败":"新增成功";
    }

    @Permission(level = ResourceLevel.ORGANIZATION)
    @ApiOperation(value = "订单查看")
    @GetMapping
    public HodrSoHeader findHodrSoHeader(Long soHeaderId){
        HodrSoHeader hodrSoHeader= hodrSoHeaderService.findHodrSoHeader(soHeaderId);
        return hodrSoHeader;
    }

    @Permission(level = ResourceLevel.ORGANIZATION)
    @ApiOperation(value = "订单修改")
    @PutMapping
    public String putHodrSoHeader(HodrSoHeader hodrSoHeader){
        int flag = hodrSoHeaderService.putHodrSoHeader(hodrSoHeader);
        return flag==0?"更新失败":"更新成功";
    }

    @Permission(level = ResourceLevel.ORGANIZATION)
    @ApiOperation(value = "订单删除")
    @DeleteMapping
    public String deleteHodrSoHeader(Long soHeaderId){
        int flag = hodrSoHeaderService.deleteHodrSoHeader(soHeaderId);
        return flag==0?"删除失败":"删除成功";
    }




}
