package cn.xyh.service;

import cn.xyh.pojo.User;

import java.util.List;

public interface UserService {

    int insertUser(User user);
    List<User> queryUser();

}
