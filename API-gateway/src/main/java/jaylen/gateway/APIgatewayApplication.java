package jaylen.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @Author: Jaylen
 * @Description:
 * @Date: 2019/5/8 18:00
 */
@EnableZuulProxy
@SpringCloudApplication
public class APIgatewayApplication {
    public static void main(String[] args) {
        SpringApplication.run(APIgatewayApplication.class, args);
    }
}
