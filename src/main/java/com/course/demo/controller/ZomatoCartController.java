package com.course.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.course.demo.model.ZomatoCart;
import com.course.demo.repository.ZomatoCartRepository;

@RestController
@RequestMapping("/REST/v1/cart")
public class ZomatoCartController {

	@Autowired
	ZomatoCartRepository zomatoCartRepository;
	
	@GetMapping
	public List<ZomatoCart> findAllCart()
	{
		return zomatoCartRepository.findAll();
	}
}
