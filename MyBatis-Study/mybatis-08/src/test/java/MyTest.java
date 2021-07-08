import com.kuang.dao.BlogMapper;
import com.kuang.pojo.Blog;
import com.kuang.utils.IDUtils;
import com.kuang.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class MyTest {
    @Test
    public void addBlog(){
        SqlSession session = MybatisUtils.getSqlSession();
        BlogMapper mapper = session.getMapper(BlogMapper.class);
        Blog blog = new Blog();

        blog.setId(IDUtils.getId());
        blog.setTitle( "Mybatis");
        blog.setAuthor("SKY");
        blog.setCreateTime(new Date());
        blog.setViews (9999);
        mapper.addBlog(blog);

        blog.setId(IDUtils.getId());
        blog.setTitle("Java");
        blog.setAuthor("SKY");
        blog.setCreateTime(new Date());
        blog.setViews (8888);
        mapper.addBlog(blog);

        blog.setId(IDUtils.getId());
        blog.setTitle("Spring");
        blog.setAuthor("SKY");
        blog.setCreateTime(new Date());
        blog.setViews (7777);
        mapper.addBlog(blog);

        blog.setId(IDUtils.getId());
        blog.setTitle("MySql");
        blog.setAuthor("SKY");
        blog.setCreateTime(new Date());
        blog.setViews (6666);
        mapper.addBlog(blog);

        session.close();
    }

    @Test
    public void test(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        HashMap map = new HashMap();
        map.put("title","MySql222"); //这句代码是有条件查询
        map.put("author","SKY222");
        map.put("id","e8e3fbebc0c98");
        List<Blog> blogs = mapper.queryBlogIF(map);
        for(Blog blog : blogs){
            System.out.println(blog);
        }
        sqlSession.close();
    }

}
