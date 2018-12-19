package com.zhiyou100.SpringBoot.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zhiyou100.SpringBoot.model.User;
import com.zhiyou100.SpringBoot.service.UserService3;

@RestController
public class UserControler3 {
	
	@Autowired
	UserService3 userService;
	@RequestMapping("/userAll")
	public List<User> getName(){
		Pageable page = new PageRequest(1, 3);
		Page<User> p = userService.UserAll(page);
		System.out.println(p.getNumber());//当前查询的是第几页
		System.out.println(p.getNumberOfElements());//当前页面的信息条数
		System.out.println(p.getSize());
		System.out.println(p.getTotalElements());//总条数
		System.out.println(p.getTotalPages());//总页数
		System.out.println(p.getPageable());
		System.out.println(p.getSort());
		System.out.println(1/0);
		return p.getContent();
	}
	
}
