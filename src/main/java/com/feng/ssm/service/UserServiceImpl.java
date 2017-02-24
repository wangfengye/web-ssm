package com.feng.ssm.service;

import com.feng.ssm.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by feng on 2017/2/23.
 */
@Service("userServiceImpl")
public class UserServiceImpl{
    @Autowired
    UserMapper userMapper;
    public String getName() {
        return this.userMapper.selectByPrimaryKey(1).getName();
    }
}
