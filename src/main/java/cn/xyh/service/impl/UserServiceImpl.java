package cn.xyh.service.impl;

import cn.xyh.dao.UserDao;
import cn.xyh.pojo.User;
import cn.xyh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public int insertUser(User user) {
        int i = userDao.insertUser(user);
        return i;
    }

    @Override
    public List<User> queryUser() {
        return userDao.queryUser();
    }

}
