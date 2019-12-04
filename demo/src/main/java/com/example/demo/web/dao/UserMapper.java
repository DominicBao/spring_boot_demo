package com.example.demo.web.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.example.demo.web.entity.User_login;

@Mapper
public interface UserMapper {
	@Select("Select * from user where id = ${id}")
	User_login getUser_loginById(@Param("id") Integer id);
}
