package com.example.demo.web.controller;

import java.awt.List;
import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.web.entity.Unit;
import com.example.demo.web.entity.User;

@Controller
public class UserController {

    @RequestMapping(value="/user")
    public String index(Model model) {
        ArrayList<User> users = new ArrayList<User>();
        users.add(new User("皮皮虾", "男", "喜欢皮"));
        users.add(new User("光头强", "男", "砍树"));
        users.add(new User("佩奇", "男", "叫"));
        model.addAttribute("users",users);
        return "user";
    }
    
    @RequestMapping(value="/login")
    public String login(Model model) {
    	model.addAttribute("tips", "账号密码查看js");
        return "index";
    }
    
    @RequestMapping(value="/main")
    public String main(Model model) {
    	ArrayList<Unit> unit = new ArrayList<Unit>(); 
    	ArrayList<String> str = new ArrayList<String>();
    	str.add("<svg viewBox=\"0 0 24 24\" fill=\"none\" stroke=\"currentColor\" stroke-width=\"2\" class=\"feather feather-home\">\n" + 
    			"                  	<path d=\"M3 9l9-7 9 7v11a2 2 0 0 1-2 2H5a2 2 0 0 1-2-2z\"></path>\n" + 
    			"                  	<polyline points=\"9 22 9 12 15 12 15 22\"></polyline>\n" + 
    			"                  </svg>");
//    	String a = "<svg viewBox=\"0 0 24 24\" fill=\"none\" stroke=\"currentColor\" stroke-width=\"2\" class=\"feather feather-home\">\n" + 
//    			"                  	<path d=\"M3 9l9-7 9 7v11a2 2 0 0 1-2 2H5a2 2 0 0 1-2-2z\"></path>\n" + 
//    			"                  	<polyline points=\"9 22 9 12 15 12 15 22\"></polyline>\n" + 
//    			"                  </svg>";
    	str.add("<svg viewBox=\"0 0 24 24\" fill=\"none\" stroke=\"currentColor\" stroke-width=\"2\" class=\"feather feather-file\">\n" + 
    			"                  	<path d=\"M13 2H6a2 2 0 0 0-2 2v16a2 2 0 0 0 2 2h12a2 2 0 0 0 2-2V9z\"></path>\n" + 
    			"                  	<polyline points=\"13 2 13 9 20 9\"></polyline>\n" + 
    			"                  </svg>");
    	str.add("<svg viewBox=\"0 0 24 24\" fill=\"none\" stroke=\"currentColor\" stroke-width=\"2\" class=\"feather feather-shopping-cart\">\n" + 
    			"                  	<circle cx=\"9\" cy=\"21\" r=\"1\"></circle>\n" + 
    			"                  	<circle cx=\"20\" cy=\"21\" r=\"1\"></circle>\n" + 
    			"                  	<path d=\"M1 1h4l2.68 13.39a2 2 0 0 0 2 1.61h9.72a2 2 0 0 0 2-1.61L23 6H6\"></path>\n" + 
    			"                  </svg>");
    	str.add("<svg viewBox=\"0 0 24 24\" fill=\"none\" stroke=\"currentColor\" stroke-width=\"2\" class=\"feather feather-users\">\n" + 
    			"                  	<path d=\"M17 21v-2a4 4 0 0 0-4-4H5a4 4 0 0 0-4 4v2\"></path>\n" + 
    			"                  	<circle cx=\"9\" cy=\"7\" r=\"4\"></circle>\n" + 
    			"                  	<path d=\"M23 21v-2a4 4 0 0 0-3-3.87\"></path>\n" + 
    			"                  	<path d=\"M16 3.13a4 4 0 0 1 0 7.75\"></path>\n" + 
    			"                  </svg>");
    	str.add("<svg viewBox=\"0 0 24 24\" fill=\"none\" stroke=\"currentColor\" stroke-width=\"2\" class=\"feather feather-bar-chart-2\">\n" + 
    			"                  	<line x1=\"18\" y1=\"20\" x2=\"18\" y2=\"10\"></line>\n" + 
    			"                  	<line x1=\"12\" y1=\"20\" x2=\"12\" y2=\"4\"></line>\n" + 
    			"                  	<line x1=\"6\" y1=\"20\" x2=\"6\" y2=\"14\"></line>\n" + 
    			"                  </svg>");
    	str.add("<svg viewBox=\"0 0 24 24\" fill=\"none\" stroke=\"currentColor\" stroke-width=\"2\" class=\"feather feather-layers\">\n" + 
    			"                  	<polygon points=\"12 2 2 7 12 12 22 7 12 2\"></polygon>\n" + 
    			"                  	<polyline points=\"2 17 12 22 22 17\"></polyline>\n" + 
    			"                  	<polyline points=\"2 12 12 17 22 12\"></polyline>\n" + 
    			"                  </svg>");
    	
    	unit.add(new Unit("主页",str.get(0)));
    	unit.add(new Unit("项目",str.get(1)));
    	unit.add(new Unit("报告",str.get(2)));
    	unit.add(new Unit("小记",str.get(3)));
    	unit.add(new Unit("资料",str.get(4)));
    	unit.add(new Unit("错误",str.get(5)));
    	model.addAttribute("unit",unit);
    	//String a[] = new String[] {"项目","报告","小记","日记"};
    	
    	ArrayList<Unit> unit1 = new ArrayList<Unit>(); 
    	ArrayList<String> str1 = new ArrayList<String>();
    	str1.add("<svg viewBox=\"0 0 24 24\" fill=\"none\" stroke=\"currentColor\" stroke-width=\"2\" class=\"feather feather-file-text\">\n" + 
    			"                  	<path d=\"M14 2H6a2 2 0 0 0-2 2v16a2 2 0 0 0 2 2h12a2 2 0 0 0 2-2V8z\"></path>\n" + 
    			"                  	<polyline points=\"14 2 14 8 20 8\"></polyline>\n" + 
    			"                  	<line x1=\"16\" y1=\"13\" x2=\"8\" y2=\"13\"></line>\n" + 
    			"                  	<line x1=\"16\" y1=\"17\" x2=\"8\" y2=\"17\"></line>\n" + 
    			"                  	<polyline points=\"10 9 9 9 8 9\"></polyline>\n" + 
    			"                  </svg>");
    	unit1.add(new Unit("日志1",str1.get(0)));
    	unit1.add(new Unit("日志2",str1.get(0)));
    	unit1.add(new Unit("日志3",str1.get(0)));
    	unit1.add(new Unit("日志4",str1.get(0)));
    	model.addAttribute("unit1",unit1);
        return "main";
    }
    
    @RequestMapping(value="/excep")
    public String Excel() {
    	try {
    		int x = 2 / 0;
    	}catch(Exception e){
    		System.out.print("发现异常");
    	}
    	return "hello excep";
    } 
}
