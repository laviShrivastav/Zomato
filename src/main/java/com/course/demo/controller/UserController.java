package com.course.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.course.demo.model.User;
import com.course.demo.repository.UserRepository;

@RestController
@RequestMapping("/REST/v1/user")
public class UserController {

	@Autowired
	UserRepository userRepository;
	
	@GetMapping
	public List<User> getUsers()
	{
		return userRepository.findAll();
	}
	
}
