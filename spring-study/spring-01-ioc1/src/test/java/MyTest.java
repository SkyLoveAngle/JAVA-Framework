import com.kuang.dao.UserDaoImpl;
import com.kuang.dao.UserDaoOracleImpl;
import com.kuang.service.UserService;
import com.kuang.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {

//        //用户实际操作调用的业务层，dao层不需要接触！
//        UserService userService = new UserServiceImpl();
//
//        //((UserServiceImpl) userService).setUserDao(new UserDaoImpl());
//        //((UserServiceImpl) userService).setUserDao(new UserDaoMySqlImpl());
//        ((UserServiceImpl) userService).setUserDao(new UserDaoOracleImpl());
//
//        userService.getUser();

        //使用Spring获取ApplicationContext,拿到Spring容器
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        //需要什么就直接get什么
        UserServiceImpl userServiceImpl = (UserServiceImpl) context.getBean("UserServiceImpl");

        userServiceImpl.getUser();
    }
}
