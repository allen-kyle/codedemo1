package com.example.demo.dao;

import com.example.demo.model.PO.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface UserDao {
    @Insert("insert into user(id,username, password) values(#{id},#{username}, #{password})")
    void addUser(User user);

    @Select("select * from user where username = #{username}")
    User getName(User user);

    @Delete("delete * from user where username = #{username} and password = #{password}")
    User delUser(User user);

    @Update("update * from user where username = #{username} and password = #{password}")
    User updateUser(User user);
}
