package com.zhiyou100.SpringBoot.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zhiyou100.SpringBoot.model.User;
import com.zhiyou100.SpringBoot.service.UserService2;

@RestController
public class UserControler2 {
	
	@Autowired
	UserService2 userService;
	
	@RequestMapping("/getName")
	public User getName(){
		String name = "zz";
		return userService.finByName(name);
	}
	
	@RequestMapping("/getxx")
	public User xx(){
		String n = "zz";
		return userService.xx(n);
	}
	
	
}
