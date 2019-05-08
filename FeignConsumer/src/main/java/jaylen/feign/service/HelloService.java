package jaylen.feign.service;

import jaylen.feign.service.impl.HelloServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author: Jaylen
 * @Description:
 * @Date: 2019/5/8 14:59
 */
@FeignClient(name = "eureka-client", fallback = HelloServiceImpl.class)
public interface HelloService {
    @GetMapping("/index")
    String index();
}
