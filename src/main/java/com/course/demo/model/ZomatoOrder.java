package com.course.demo.model;

import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ZOMATO_ORDER")
public class ZomatoOrder {
	
	@Id
	Long orderId;
	Date date;
	Long cost;
	
	@ManyToOne
	@JoinColumn(name = "USER_ID_CUST")
	User userCust;
	
	@ManyToOne
	@JoinColumn(name = "USER_ID_HOTEL")
	User userHotel;

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public Date getDateTime() {
		return date;
	}

	public void setDateTime(Date dateTime) {
		this.date = dateTime;
	}

	public Long getCost() {
		return cost;
	}

	public void setCost(Long cost) {
		this.cost = cost;
	}

	public User getUserCust() {
		return userCust;
	}

	public void setUserCust(User userCust) {
		this.userCust = userCust;
	}

	public User getUserHotel() {
		return userHotel;
	}

	public void setUserHotel(User userHotel) {
		this.userHotel = userHotel;
	}
	
	
}
