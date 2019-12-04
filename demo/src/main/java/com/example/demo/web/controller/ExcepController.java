package com.example.demo.web.controller;

import java.awt.List;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.web.dao.UserMapper;
import com.example.demo.web.entity.User;

@RestController
public class ExcepController {
	
	@Autowired
	private UserMapper userMapper;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     
 
    @RequestMapping(value="/excel")
    public String Excel() {
    	int x = 2 / 0;
    	return "hello excepl";
    }
    
    @RequestMapping(value="/getuser")
    public Object getUser(Integer id) {
    	return userMapper.getUser_loginById(id);
    }
}