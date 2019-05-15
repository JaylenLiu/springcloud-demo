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

    public static void main(String[] args) {
        computeAvg(7.60, 8.783,300, 100);
        computeAvg(5.13, 6.217,300, 100);
    }
    // 计算平均成本
    private static void computeAvg(double price_new, double price_old, double amount_old, double amount){
        double cost = price_old * amount_old;
        double result = (cost + price_new * amount) / (amount_old + amount);
        System.out.println("所需金额：" + (price_new * amount));
        System.out.println("平均成本：" + result);
    }
}
