import com.lsq.mapper.UserDaoImpl;
import com.lsq.mapper.UserDaoOracleImpl;
import org.junit.Test;
import com.lsq.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test00 {
    @Test
    public void test01(){
        UserServiceImpl service = new UserServiceImpl();
        service.setUserDao( new UserDaoImpl() );
        service.getUser();
        service.setUserDao( new UserDaoOracleImpl() );
        service.getUser();
    }


    @Test
    public void test2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserServiceImpl serviceImpl = (UserServiceImpl) context.getBean("ServiceImpl");
        serviceImpl.getUser();
    }

}
