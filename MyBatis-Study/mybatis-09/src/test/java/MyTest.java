import com.kuang.dao.UserMapper;
import com.kuang.pojo.User;
import com.kuang.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class MyTest {

    @Test
    public void test(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        SqlSession sqlSession2 = MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        UserMapper mapper2 = sqlSession2.getMapper(UserMapper.class);

        User user1 = mapper.queryUserById(2);
        System.out.println(user1);
        sqlSession.close();

        System.out.println("==========================");

        User user2 = mapper2.queryUserById(2);
        System.out.println(user2);

        System.out.println(user1.equals(user2));
        sqlSession2.close();
    }


}
