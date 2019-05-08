package jaylen.feign.controller;

import jaylen.feign.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Jaylen
 * @Description:
 * @Date: 2019/5/8 15:00
 */
@RestController
public class HelloController {
    @Autowired
    HelloService helloService;

    @GetMapping("/feign-consumer")
    public String helloConsumer(){
        return helloService.hello();
    }
}
