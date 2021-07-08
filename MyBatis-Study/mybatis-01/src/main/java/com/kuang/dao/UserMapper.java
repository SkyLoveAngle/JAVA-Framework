package com.kuang.dao;

import com.kuang.pojo.User;
import java.util.List;
import java.util.Map;

public interface UserMapper {
    //查询全部用户
    List<User> getUserList();

    //模糊查询
    List<User> getUserLikeList(String value);

    //根据ID查询用户
    User getUserById(int id);

    int getUserById2(Map<String,Object> map);

    //insert一个用户数据
    int addUser(User user);

    //insert 一群 用户数据, 万能的Map
    int addUser2(Map<String,Object> map);

    //修改用户数据
    int updateUser(User user);

    //删除用户
    int deleteUser(int id);
}
