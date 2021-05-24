package com.udacity.jwdnd.spring_security_basics.mapper;

import com.udacity.jwdnd.spring_security_basics.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {
    @Select("SELECT * FROM USERSS WHERE username = #{username}")
    User getUser(String username);

    @Insert("INSERT INTO USERSS (username, salt, password, firstname, lastname) VALUES(#{username}, #{salt}, #{password}, #{firstName}, #{lastName})")
    @Options(useGeneratedKeys = true, keyProperty = "userId")
    int insert(User user);
}
