package org.hzero.order.hzeroorder24870.api.controller.v1;


import io.choerodon.core.iam.ResourceLevel;
import io.choerodon.swagger.annotation.Permission;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.hzero.order.hzeroorder24870.app.service.HodrSoLineService;
import org.hzero.order.hzeroorder24870.config.SwaggerTags;
import org.hzero.order.hzeroorder24870.domain.entity.HodrSoLine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Api(tags = SwaggerTags.HodrSoLine)
@RestController(value = "hodrSoLineController.v1")
@RequestMapping("/v1/{organizationId}/soline")
public class HodrSoLineController {


    @Autowired
    private HodrSoLineService hodrSoLineService;


    @Permission(level = ResourceLevel.ORGANIZATION)
    @ApiOperation(value = "订单行新增")
    @PostMapping
    public String postHodrSoHeader(HodrSoLine hodrSoLine){
        int flag = hodrSoLineService.postHodrSoHeader(hodrSoLine);
        return flag==0?"新增失败":"新增成功";
    }

    @Permission(level = ResourceLevel.ORGANIZATION)
    @ApiOperation(value = "订单行查看")
    @GetMapping
    public HodrSoLine findHodrSoHeader(Long soLineId){
        HodrSoLine hodrSoLine = hodrSoLineService.findHodrSoHeader(soLineId);
        return hodrSoLine;
    }

    @Permission(level = ResourceLevel.ORGANIZATION)
    @ApiOperation(value = "订单行修改")
    @PutMapping
    public String updateHodrSoHeader(HodrSoLine hodrSoLine){
        int flag = hodrSoLineService.updateHodrSoHeader(hodrSoLine);
        return flag==0?"修改失败":"修改成功";
    }


    @Permission(level = ResourceLevel.ORGANIZATION)
    @ApiOperation(value = "订单行删除")
    @DeleteMapping
    public String deleteHodrSoHeader(Long soLineId){
        int flag = hodrSoLineService.deleteHodrSoHeader(soLineId);
        return flag==0?"删除失败":"删除成功";
    }
}
