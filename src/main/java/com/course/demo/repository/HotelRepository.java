package com.course.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.course.demo.model.Hotel;

@Repository
public interface HotelRepository extends JpaRepository<Hotel, Long>{

}
