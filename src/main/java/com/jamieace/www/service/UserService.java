package com.jamieace.www.service;

import com.jamieace.www.po.UserEntity;

import java.util.List;

/**
 * Desc:用户表相关的service接口
 */
public interface UserService {

    /**
     * 获取所有的用户信息
     *
     * @return
     */
    List<UserEntity> getAllUsers();
}
