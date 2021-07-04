package com.course.demo.model;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class ZomatoCart {

	@EmbeddedId
	CartUserPK cartUserPK;
	Long qty;
	Double finalCost;
	
	public CartUserPK getCartUserPK() {
		return cartUserPK;
	}
	public void setCartUserPK(CartUserPK cartUserPK) {
		this.cartUserPK = cartUserPK;
	}
	public Long getQty() {
		return qty;
	}
	public void setQty(Long qty) {
		this.qty = qty;
	}
	public Double getFinalCost() {
		return finalCost;
	}
	public void setFinalCost(Double finalCost) {
		this.finalCost = finalCost;
	}
	
	
}
