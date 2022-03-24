import com.lsq.config.MyConfig;
import com.lsq.pojo.Dog;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyTest {

    @Test
    public void test1(){
     ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfig.class);
        Dog dog = applicationContext.getBean("dog",Dog.class);
        System.out.println(dog.name);
    }
}
