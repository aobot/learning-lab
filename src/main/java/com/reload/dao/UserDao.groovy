package com.reload.dao
import com.reload.model.User
/**
 * Created by @ssysong.ssy  2016-06-03 16:10
 */
interface UserDao {
//    @Insert("insert into user( name,age) values(#{name},#{age})")
    void add(User user)
    void add2(User user)
}
