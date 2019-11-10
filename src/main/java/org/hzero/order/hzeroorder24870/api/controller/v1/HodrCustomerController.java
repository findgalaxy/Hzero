package org.hzero.order.hzeroorder24870.api.controller.v1;

import io.choerodon.core.domain.Page;
import io.choerodon.core.iam.ResourceLevel;
import io.choerodon.mybatis.pagehelper.domain.PageRequest;
import io.choerodon.swagger.annotation.Permission;
import io.swagger.annotations.Api;
import org.hzero.order.hzeroorder24870.app.service.HodrCustomerService;
import org.hzero.order.hzeroorder24870.config.SwaggerTags;
import org.hzero.order.hzeroorder24870.domain.entity.HodrCustomer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = SwaggerTags.HodrCustomer)
@RestController(value = "hodrCustomerController.v1")
@RequestMapping("/v1/{organizationId}/cumtomer")
public class HodrCustomerController {

    @Autowired
    private HodrCustomerService hodrCustomerService;

    @Permission(level = ResourceLevel.ORGANIZATION)
    @GetMapping
    public Page<HodrCustomer> findCustomerbyExample(HodrCustomer hodrCustomer, PageRequest pageRequest){
        Page<HodrCustomer> customerList=null;
        if(hodrCustomer != null){
            customerList = hodrCustomerService.findCustomerbyExample(hodrCustomer,pageRequest);
        }
        return customerList;

    }

}
