package jaylen.eurekaclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class HelloController {
    @Autowired
    private DiscoveryClient client;

    @GetMapping("/index")
    public String index() {
        List<String> result =  client.getServices();
        List<ServiceInstance> instances = client.getInstances("eureka-client");
        instances.forEach(serviceInstance -> {
            System.out.println(serviceInstance.getServiceId());
            System.out.println(serviceInstance.getHost());
            System.out.println(serviceInstance.getPort());
            System.out.println(serviceInstance.getUri());
        });
        return "hello world";
    }
}
