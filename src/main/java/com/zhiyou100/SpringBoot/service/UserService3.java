package com.zhiyou100.SpringBoot.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.zhiyou100.SpringBoot.model.User;
import com.zhiyou100.SpringBoot.repository.UserRepository3;
@Service
public class UserService3 {
	@Autowired
	private UserRepository3 userRepository;
	
	public Page<User> UserAll(Pageable pageable){
		return userRepository.findAll(pageable);
	}
}
