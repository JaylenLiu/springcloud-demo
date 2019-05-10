package jaylen.configClient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.config.environment.Environment;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Jaylen
 * @Description:
 * @Date: 2019/5/10 16:04
 */
@RefreshScope
@RestController
public class TestController {
    @Value("${from}")
    private String from;

    // 参数注入的另一种方式
//    @Autowired
//    private Environment env;

    @GetMapping("/from")
    public String from(){
        return this.from;
    }

//    @GetMapping("/hello")
//    public String hello(){
//        env.getPropertySources().forEach(System.out::println);
//        return  "hello";
//    }
}
