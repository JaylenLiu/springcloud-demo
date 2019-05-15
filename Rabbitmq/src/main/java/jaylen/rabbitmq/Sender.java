package jaylen.rabbitmq;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Date;

/**
 * @Author: Jaylen
 * @Description:
 * @Date: 2019/5/14 16:02
 */
@Component
public class Sender {
    @Autowired
    private AmqpTemplate rabbitTemplate;

    @PostConstruct
    public void init () {
        send();
    }

    public void send(){
        String context = "hello " + new Date();
        System.out.println("sender:" + context);
        this.rabbitTemplate.convertAndSend("hello", context);
    }
}
