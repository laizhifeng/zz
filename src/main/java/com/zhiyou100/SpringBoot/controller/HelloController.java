package com.zhiyou100.SpringBoot.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.zhiyou100.SpringBoot.model.User;
//@RestController   相当于在本类所有中所有@RequestMapping之上加上@ResponseBody
@Controller
public class HelloController {
	@RequestMapping("/hello")
	public String hello(Map<String,String> map){
		map.put("msg", "哈哈哈哈");
		
		return "hello";
	}
	//SpringBoot支持Json，会把返回对象与数组以JSON方式显示
	@RequestMapping("/getUser")
	public List<User> getUser(){
		List<User> list = new ArrayList<>();
		list.add(new User(1,"张三",22));
		list.add(new User(2,"ss",23));
		list.add(new User(3,"ww",24));
		return list;
	}
}
