package com.kuang.mapper;

import com.kuang.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

public class UserMapperImpl extends SqlSessionDaoSupport implements UserMapper {
//    //我们的所有操作，原来都是使用的SqlSession来执行
//    //现在都是用SqlSessionTemplate来完成
//    private SqlSessionTemplate sqlSession;
//    public void setSqlSession(SqlSessionTemplate sqlSession){
//        this.sqlSession = sqlSession;
//    }

    public List<User> selectUser() {
        UserMapper mapper = getSqlSession().getMapper(UserMapper.class);
        return mapper.selectUser();
    }

}
