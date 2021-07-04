package com.course.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.course.demo.model.ZomatoOrder;
import com.course.demo.repository.ZomatoOrderRepository;

@RestController
@RequestMapping("/REST/v1/order")
public class ZomatoOrderController {

	@Autowired
	ZomatoOrderRepository repository;
	
	@GetMapping
	public List<ZomatoOrder> findAllOrders()
	{
		return repository.findAll();
	}
}
