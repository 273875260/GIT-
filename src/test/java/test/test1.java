package test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.Xx;
import com.service.service1;

import java.util.List;

/**
 * @author xxx
 * @date 2019/7/10 22:38
 * @description
 */
public class test1 {

    @Test
    public void ts(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
        service1 s1= (service1) ac.getBean("service1");
        List<Xx> x=s1.findxx();
        for (Xx d:x) {
            System.out.println(d.getId());
            System.out.println(d.getName());
        }

    }
}
