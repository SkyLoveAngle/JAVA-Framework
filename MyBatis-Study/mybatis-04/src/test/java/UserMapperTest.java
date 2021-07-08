import com.kuang.dao.UserMapper;
import com.kuang.pojo.User;
import com.kuang.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

import java.util.List;
public class UserMapperTest {

//    @Test
//    public void test(){
//        SqlSession sqlSession = MybatisUtils.getSqlSession();
//        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
//        List<User> users = mapper.getUsers();
//        for(User user : users ){
//            System.out.println(user);
//        }
//        sqlSession.close();
//    }

    @Test
    public void test(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        //底层主要应用反射
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        //mapper.addUser(new User(5,"Hello","1124"));
        mapper.updateUser(new User(5,"WORLD","00000"));

        sqlSession.close();
    }
}
