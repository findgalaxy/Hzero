package org.hzero.order.hzeroorder24870.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.service.Tag;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * Swagger Api 描述配置
 */
@Configuration
public class SwaggerTags {

    public static final String EXAMPLE = "Example";
    public static final String HodrCompany = "HodrCompany";
    public static final String HodrCustomer = "HodrCustomer";
    public static final String HodrItem = "HodrItem";
    public static final String HodrSo = "HodrSo";
    public static final String HodrSoHeader = "HodrSoHeader";
    public static final String HodrSoLine = "HodrSoLine";

    @Autowired
    public SwaggerTags(Docket docket) {
        docket.tags(
                new Tag(EXAMPLE, "EXAMPLE 案例"),
                new Tag(HodrCompany, "HodrCompany 案例"),
                new Tag(HodrCustomer, "HodrCustomer 案例"),
                new Tag(HodrItem, "HodrItem 案例"),
                new Tag(HodrSoHeader, "HodrSoHeader 案例"),
                new Tag(HodrSoLine, "HodrSoLine 案例"),
                new Tag(HodrSo, "HodrSo 案例")
        );
    }
}
