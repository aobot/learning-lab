package com.reload.dao
import com.reload.model.User
/**
 * Created by @ssysong.ssy  2016-06-03 16:10
 */
interface UserDao {
    void add(User user)

    List<User> getAll()
}
