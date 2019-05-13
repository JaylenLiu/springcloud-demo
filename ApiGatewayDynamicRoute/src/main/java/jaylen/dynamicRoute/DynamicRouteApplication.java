package jaylen.dynamicRoute;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.netflix.zuul.filters.ZuulProperties;
import org.springframework.context.annotation.Bean;

/**
 * @Author: Jaylen
 * @Description:
 * @Date: 2019/5/13 9:05
 */
@EnableZuulProxy
@SpringCloudApplication
public class DynamicRouteApplication {
    public static void main(String[] args) {
        SpringApplication.run(DynamicRouteApplication.class, args);
    }

    @Bean
    @RefreshScope
    @ConfigurationProperties("zuul")
    public ZuulProperties zuulProperties(){
        return new ZuulProperties();
    }
}
