package com.reload.dao

import com.reload.dao.model.User
import com.reload.dao.dao.UserDao
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
