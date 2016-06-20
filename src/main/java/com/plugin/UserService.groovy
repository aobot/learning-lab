package com.plugin

import com.plugin.dao.UserDao
import com.plugin.model.User
import org.springframework.stereotype.Service

import javax.annotation.Resource

/**
 * Created by @ssysong.ssy  2016-06-03 16:11
 */

@Service('userService')
class UserService {
    @Resource
    UserDao userDao

    void add(User user) {
        try {
            userDao.add(user)
        } catch (e) {
            println 'error ,' + e
        }
    }
}
