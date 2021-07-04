package com.course.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.course.demo.model.CartUserPK;
import com.course.demo.model.ZomatoCart;

@Repository
public interface ZomatoCartRepository extends JpaRepository<ZomatoCart, CartUserPK>{

}
