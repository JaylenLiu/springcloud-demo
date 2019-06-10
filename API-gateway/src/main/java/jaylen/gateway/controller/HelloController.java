package jaylen.gateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Jaylen
 * @Description:
 * @Date: 2019/5/9 15:41
 */
@RestController
public class HelloController {

    @GetMapping("/local/hello")
    public String hello(){
        return "hello, this is gateway!";
    }
}
