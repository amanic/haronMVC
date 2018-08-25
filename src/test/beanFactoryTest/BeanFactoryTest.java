package beanFactoryTest;

import mvc.dal.dao.UserMapper;
import mvc.dal.obj.TestBeanObj;
import mvc.service.TestService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by martea on 2018/8/24.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:META-INF/spring/applicationContext.xml"})
public class BeanFactoryTest {

    @Autowired
    TestService testService;



    @Test
    public void testBeanFactoryLoad(){
        System.out.println(testService.testString("hello world!"));
    }

    @Test
    public void testGetBeanFromXml(){
        BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("META-INF/spring/applicationContext.xml"));
        TestBeanObj obj = (TestBeanObj) beanFactory.getBean("beanObj");
        System.out.println(obj.toString());
    }

    @Test
    public void test1(){
        System.out.println(testService.testString3(""));
    }
}
