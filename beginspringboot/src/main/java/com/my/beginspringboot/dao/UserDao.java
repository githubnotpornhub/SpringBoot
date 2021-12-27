package com.my.beginspringboot.dao;

import com.my.beginspringboot.entity.User;

import java.util.List;

public interface UserDao {

    /**
     * 返回数据列表
     */
    List<User> findAllUsers();

    /**
     * 通过用户名查询该用户名是否已存在
     */
    List<User> queryUserByUsername(String username);

    /**通过id查询该用户是否已存在*/

    List<User> queryUserById(Integer id);

    /**
     * 增加用户信息
     */
    Integer insertUser(User user);

    /**
     * 修改用户信息
     */
    Integer updateUser(User user);

    /**
     * 删除用户信息
     */
    Integer deleteUser(Integer id);
}
