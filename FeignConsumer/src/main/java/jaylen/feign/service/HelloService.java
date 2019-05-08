package jaylen.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author: Jaylen
 * @Description:
 * @Date: 2019/5/8 14:59
 */
@FeignClient("eureka-client")
public interface HelloService {
    @GetMapping("/index")
    String hello();
}
