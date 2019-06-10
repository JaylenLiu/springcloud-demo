package jaylen.rabbitmq;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author: Jaylen
 * @Description:
 * @Date: 2019/5/14 16:09
 */
@RunWith(SpringRunner.class)
@SpringBootTest()
public class HelloApplicationTest {
    @Autowired
    private Sender sender;

    @Test
    public void hello(){
        sender.send();
    }

}
