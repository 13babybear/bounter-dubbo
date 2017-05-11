

import com.bounter.dubbo.api.service.DubboService2;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.bounter.dubbo.api.service.DubboService1;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class ConsumerTest {

    @Autowired
    private DubboService1 dubboService1;

    @Autowired
    private DubboService2 dubboService2;

    @Test
    public void test() {
        try {
            String ret1 = dubboService1.sayHello("simon");
            System.out.println(ret1);
            String ret2 = dubboService2.sayHello("susan");
            System.out.println(ret2);
        } catch (Exception e) {
        }
    }

}
