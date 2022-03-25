import com.lsq.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void test01(){       //通过 Spring API 实现
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserService userService = (UserService) context.getBean("userService");

        userService.select();
        userService.add();
        userService.delete();
        userService.update();
    }


    @Test
    public void test02(){       //第二种方式：使用AOP的标签实现
        ApplicationContext context = new ClassPathXmlApplicationContext("beans02.xml");
        UserService userService = (UserService) context.getBean("userService");

        userService.add();
        userService.select();
        userService.delete();
        userService.update();
    }

    @Test
    public void test03(){   //第三种方式:注解实现
        ApplicationContext context = new ClassPathXmlApplicationContext("beans03.xml");
        UserService userService = (UserService) context.getBean("userService");

        userService.add();
        userService.select();
        userService.delete();
        userService.update();
    }
}
