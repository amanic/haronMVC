package beanFactoryTest;

import mvc.service.TestService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by martea on 2018/8/24.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:META-INF/spring/applicationContext.xml",
        "classpath*:META-INF/spring/dispatcher-servlet.xml"})
public class BeanFactoryTest {

    @Autowired
    TestService testService;

    @Test
    public void testBeanFactoryLoad(){
        System.out.println(testService.testString("hello world!"));
    }
}
