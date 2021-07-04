package com.course.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.course.demo.model.ZomatoOrder;

@Repository
public interface ZomatoOrderRepository extends JpaRepository<ZomatoOrder, Long>{

}
