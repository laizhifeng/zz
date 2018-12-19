package com.zhiyou100.SpringBoot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zhiyou100.SpringBoot.model.User;
import com.zhiyou100.SpringBoot.service.UserService;

@RestController
public class UserControler {
	
	@Autowired
	UserService userService;
	
	@RequestMapping("/get")
	public User get(){
		return userService.getUser(1);
	}
	
	@RequestMapping("/getAll")
	public List<User> getAll(){
		return userService.getAll();
	}
	
	@RequestMapping("/save")
	public void save(){
		User user = new User(null,"张三",22);
		userService.save(user);
	}
	
	@RequestMapping("/delete")
	public void delete(){
		userService.delete(1);
	}
	
}
