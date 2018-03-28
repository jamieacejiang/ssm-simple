package com.jamieace.www.service.impl;

import com.jamieace.www.mapper.UserEntityMapper;
import com.jamieace.www.po.UserEntity;
import com.jamieace.www.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Desc:用户表相关的servie接口实现类
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserEntityMapper mapper;

    @Override
    public List<UserEntity> getAllUsers() {
        return mapper.getAllUsers();
    }
}
