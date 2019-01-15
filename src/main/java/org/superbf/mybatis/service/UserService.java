package org.superbf.mybatis.service;


import org.superbf.mybatis.entity.Sign;
import org.superbf.mybatis.entity.User;

import java.util.List;

public interface UserService {
    User selectById(int id);

    Sign selectByUnit(int enterId, int sId);

    int deleteByUnitKey(int enterId, int sId);


    void insertUser(User user);


    User selectUser(User user);

    int insertList(List<User> userlist);

}
