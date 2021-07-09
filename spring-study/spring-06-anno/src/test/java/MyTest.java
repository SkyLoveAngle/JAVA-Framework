import com.kuang.pojo.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
       ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
       User user = context.getBean("user", User.class);
       System.out.println(user.name);
    }
}
