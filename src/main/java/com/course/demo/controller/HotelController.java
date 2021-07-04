package com.course.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.course.demo.model.Hotel;
import com.course.demo.repository.HotelRepository;

@RestController
@RequestMapping("/REST/v1/hotel")
public class HotelController {

	@Autowired
	HotelRepository hotelRepository;
	
	@GetMapping
	public List<Hotel> getAllHotels()
	{
		return hotelRepository.findAll();
	}
}
