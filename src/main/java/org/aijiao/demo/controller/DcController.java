package org.aijiao.demo.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DcController {

    private final Logger logger = Logger.getLogger(getClass());

    @Autowired
    DiscoveryClient discoveryClient;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello() {
//        String services = "Services:" + discoveryClient.getServices();
//        System.out.println(services);
        ServiceInstance instance = discoveryClient.getLocalServiceInstance();
        logger.warn("/hello,host:" + instance.getHost() + ",service_id:" + instance.getServiceId());
        return "Hello Word";
//        return services;
    }

}
