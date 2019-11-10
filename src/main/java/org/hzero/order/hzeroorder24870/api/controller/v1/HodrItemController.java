package org.hzero.order.hzeroorder24870.api.controller.v1;

import io.choerodon.core.domain.Page;
import io.choerodon.core.iam.ResourceLevel;
import io.choerodon.mybatis.pagehelper.domain.PageRequest;
import io.choerodon.swagger.annotation.Permission;
import io.swagger.annotations.Api;
import org.hzero.order.hzeroorder24870.app.service.HodrItemService;
import org.hzero.order.hzeroorder24870.config.SwaggerTags;
import org.hzero.order.hzeroorder24870.domain.entity.HodrItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = SwaggerTags.HodrItem)
@RestController(value = "hodrItemController.v1")
@RequestMapping("/v1/{organizationId}/item")
public class HodrItemController {

    @Autowired
    private HodrItemService hodrItemService;

    @Permission(level = ResourceLevel.ORGANIZATION)
    @GetMapping
    public Page<HodrItem> findHodrItembyExample(HodrItem hodrItem, PageRequest pageRequest){
        Page<HodrItem> hodrItemList = null;
        if(hodrItem != null){
            hodrItemList = hodrItemService. findHodrItembyExample(hodrItem,pageRequest);
        }
        return hodrItemList;
    }

}
