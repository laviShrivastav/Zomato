package com.course.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.course.demo.model.ZomatoOrderDetail;
import com.course.demo.repository.ZomatoOrderDetailRepository;

@RestController
@RequestMapping("/REST/v1/orderDetail")
public class ZomatoOrderDetailController {

	@Autowired
	ZomatoOrderDetailRepository zomatoOrderDetailRepository;
	
	@GetMapping
	public List<ZomatoOrderDetail> findAllOrderDetail()
	{
		return zomatoOrderDetailRepository.findAll();
	}
}
