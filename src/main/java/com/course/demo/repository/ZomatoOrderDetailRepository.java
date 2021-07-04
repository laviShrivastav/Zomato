package com.course.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.course.demo.model.OrderDetailMenuPK;
import com.course.demo.model.ZomatoOrderDetail;

@Repository
public interface ZomatoOrderDetailRepository extends JpaRepository<ZomatoOrderDetail, OrderDetailMenuPK>{

}
