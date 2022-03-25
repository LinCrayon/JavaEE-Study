import com.lsq.pojo.Student;
import com.lsq.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    @Test
    public void test01(){
        ApplicationContext context = new
                ClassPathXmlApplicationContext("applicationContext.xml");
        Student student = (Student) context.getBean("student");
        System.out.println(student.getName());
    }

    @Test
    public void properties(){
        ApplicationContext context = new
                ClassPathXmlApplicationContext("applicationContext.xml");
        User user = (User) context.getBean("user");
        System.out.println(user);
    }
    @Test
    public void Constructor(){
        ApplicationContext context = new
                ClassPathXmlApplicationContext("applicationContext.xml");
        User user = (User) context.getBean("userT");
        System.out.println(user);
    }

    @Test
    public void di(){
        ApplicationContext context = new
                ClassPathXmlApplicationContext("applicationContext.xml");
        Student student = (Student) context.getBean("student");
        System.out.println(student.toString());
    }


}
