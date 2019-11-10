package org.hzero.order.hzeroorder24870.config;

import com.baidu.unbiz.fluentvalidator.ValidatorContext;
import com.baidu.unbiz.fluentvalidator.ValidatorHandler;
import org.hzero.boot.imported.infra.constant.HimpBootConstants;
import org.hzero.boot.imported.infra.validator.annotation.ImportValidator;
import org.hzero.boot.imported.infra.validator.annotation.ImportValidators;

import java.util.Map;

@ImportValidators({
        @ImportValidator(templateCode = "ORDER")
})
public class ImportValidatorTest extends ValidatorHandler<String> {

    /*@Autowired
    private ObjectMapper objectMapper;*/

    @Override
    public boolean validate(ValidatorContext context, String data) {
        // 获取自定义参数
        Map args = context.getAttribute(HimpBootConstants.ARGS, Map.class);

        //System.out.println(data);

        // do something
        return true;
    }
}
