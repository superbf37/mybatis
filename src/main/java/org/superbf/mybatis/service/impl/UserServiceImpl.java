package org.superbf.mybatis.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;
import org.superbf.mybatis.dao.SignMapper;
import org.superbf.mybatis.dao.UserMapper;
import org.superbf.mybatis.dto.SignUnitKey;
import org.superbf.mybatis.entity.Sign;
import org.superbf.mybatis.entity.User;
import org.superbf.mybatis.service.UserService;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Autowired
    private SignMapper signMapper;

    @Override
    public User selectById(int id) {
        User user = userMapper.selectByPrimaryKey(id);
        return user;
    }

    @Override
    public Sign selectByUnit(int enterId, int sId) {
        SignUnitKey signUnitKey = new SignUnitKey();
        signUnitKey.setEnterId(enterId);
        signUnitKey.setsId(sId);
//        Sign sign = signMapper.selectByPrimaryKey(signUnitKey);
        Sign sign = signMapper.selectByPrimaryKey(2);


        return sign;
    }

    @Override
    public int deleteByUnitKey(int enterId, int sId) {
        SignUnitKey signUnitKey = new SignUnitKey();
        signUnitKey.setEnterId(enterId);
        signUnitKey.setsId(sId);
        int i = signMapper.deleteByPrimaryKey(signUnitKey);
        return i;
    }


    @Override
    public void insertUser(User user) {
        userMapper.insertSelective(user);
        TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();

    }


    @Override
    public User selectUser(User user) {
        user = userMapper.selectOne(user);
        return user;
    }


    @Override
    public int insertList(List<User> userlist) {

        int i = userMapper.insertList(userlist);

        return i;
    }
}
