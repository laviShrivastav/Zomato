package com.course.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.course.demo.model.Menu;

@Repository
public interface MenuRepository extends JpaRepository<Menu, Long>{

}
