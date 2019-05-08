package jaylen.feign.service.impl;

import jaylen.feign.service.HelloService;
import org.springframework.stereotype.Component;

/**
 * @Author: Jaylen
 * @Description: 服务降级
 * @Date: 2019/5/8 15:40
 */
@Component
public class HelloServiceImpl implements HelloService {
    @Override
    public String index() {
        return "error";
    }
}
