package com.zhiyou100.SpringBoot.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhiyou100.SpringBoot.model.User;
import com.zhiyou100.SpringBoot.repository.UserRepository2;
@Service
public class UserService2 {
	@Autowired
	private UserRepository2 userRepository;
	
	public User finByName(String name){
		return userRepository.findByName(name);
	}
	
	public User xx(String n){
		return userRepository.xx(n);
	}
}
