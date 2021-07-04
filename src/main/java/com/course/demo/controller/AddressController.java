package com.course.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.course.demo.model.Address;
import com.course.demo.repository.AddressRepository;

@RestController
@RequestMapping("/REST/v1/address")
public class AddressController {

	@Autowired
	AddressRepository addressRepository;
	
	@GetMapping
	public List<Address> getAddress()
	{
		return addressRepository.findAll();
	}
}
