package com.course.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.course.demo.model.Menu;
import com.course.demo.repository.MenuRepository;

@RestController
@RequestMapping("/REST/v1/menu")
public class MenuController {

	@Autowired
	MenuRepository menuRepository;
	
	@GetMapping
	public List<Menu> findAllMenus()
	{
		return menuRepository.findAll();
	}
}
