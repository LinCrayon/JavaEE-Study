import com.lsq.pojo.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

        @Test
        public void testMethodAutowire() {
            ApplicationContext context = new
                    ClassPathXmlApplicationContext("beans.xml");
            Person person = context.getBean("person",Person.class);
            person.getCat().shout();
            person.getDog().shout();
        }

}
