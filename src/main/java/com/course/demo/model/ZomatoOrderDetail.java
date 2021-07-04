package com.course.demo.model;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "ZOMATO_ORDER_DETAIL")
public class ZomatoOrderDetail {
	
	@EmbeddedId
	OrderDetailMenuPK orderDetailMenuPK;
	Long qty;
	Double itemCost;
	
	public OrderDetailMenuPK getOrderDetailMenuPK() {
		return orderDetailMenuPK;
	}
	public void setOrderDetailMenuPK(OrderDetailMenuPK orderDetailMenuPK) {
		this.orderDetailMenuPK = orderDetailMenuPK;
	}
	public Long getQty() {
		return qty;
	}
	public void setQty(Long qty) {
		this.qty = qty;
	}
	public Double getItemCost() {
		return itemCost;
	}
	public void setItemCost(Double itemCost) {
		this.itemCost = itemCost;
	}
	
	
}
