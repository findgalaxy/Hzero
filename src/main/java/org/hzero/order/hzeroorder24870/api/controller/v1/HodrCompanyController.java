package org.hzero.order.hzeroorder24870.api.controller.v1;

import io.choerodon.core.domain.Page;
import io.choerodon.core.iam.ResourceLevel;
import io.choerodon.mybatis.pagehelper.domain.PageRequest;
import io.choerodon.swagger.annotation.Permission;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.hzero.order.hzeroorder24870.app.service.HodrCompanyService;
import org.hzero.order.hzeroorder24870.config.SwaggerTags;
import org.hzero.order.hzeroorder24870.domain.entity.HodrCompany;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = SwaggerTags.HodrCompany)
@RestController(value = "hodrCompanyController.v1")
@RequestMapping("/v1/{organizationId}/company")
public class HodrCompanyController {

    @Autowired
    private HodrCompanyService hodrCompanyService;

    @Permission(level = ResourceLevel.ORGANIZATION)
    @ApiOperation(value = "根据条件获取")
    @GetMapping
    public Page<HodrCompany> findCompanybyNumberOrName(HodrCompany hodrCompany, PageRequest pageRequest){
        Page<HodrCompany> hodrCompanyList = null;
        if(hodrCompany != null){
            hodrCompanyList = hodrCompanyService.findCompanybyExample(hodrCompany,pageRequest);
        }
        return hodrCompanyList;

    }


}
