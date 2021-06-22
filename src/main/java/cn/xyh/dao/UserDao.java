package cn.xyh.dao;

import cn.xyh.pojo.User;

import java.util.List;

public interface UserDao {

    int insertUser(User user);
    List<User> queryUser();

}
