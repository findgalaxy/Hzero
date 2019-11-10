package org.hzero.order.hzeroorder24870;

import io.choerodon.resource.annoation.EnableChoerodonResourceServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableChoerodonResourceServer
@EnableDiscoveryClient
@SpringBootApplication
public class HzeroOrder24870Application {

    public static void main(String[] args) {
        SpringApplication.run(HzeroOrder24870Application.class, args);
    }

}
