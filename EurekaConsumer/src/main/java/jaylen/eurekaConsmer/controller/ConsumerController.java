package jaylen.eurekaConsmer.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/consumer-hello")
    @HystrixCommand(fallbackMethod = "error")
    public String consumerTest(){
        return restTemplate.getForEntity("http://eureka-client/index", String.class).getBody();
    }

    public String error(){
        return "error";
    }
}
