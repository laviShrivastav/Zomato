package com.course.demo.model;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "MENU")
//@IdClass(MenuUserPK.class)
public class Menu {
	
	@EmbeddedId
	private MenuUserPK menuUserPK;
	
//	@Id
//	Long itemId;
	String itemName;
	Double itemCost;
	Boolean inStock;
	Double discount;
	
//	@ManyToOne
//	@JoinColumn(name = "USER_ID")
//	User user;
	
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public Double getItemCost() {
		return itemCost;
	}
	public void setItemCost(Double itemCost) {
		this.itemCost = itemCost;
	}
	public Boolean getInStock() {
		return inStock;
	}
	public void setInStock(Boolean inStock) {
		this.inStock = inStock;
	}
	public Double getDiscount() {
		return discount;
	}
	public void setDiscount(Double discount) {
		this.discount = discount;
	}
//	public User getUser() {
//		return user;
//	}
//	public void setUser(User user) {
//		this.user = user;
//	}
//	public Long getItemId() {
//		return itemId;
//	}
//	public void setItemId(Long itemId) {
//		this.itemId = itemId;
//	}
	
	public MenuUserPK getMenuUserPK() {
		return menuUserPK;
	}
	public void setMenuUserPK(MenuUserPK menuUserPK) {
		this.menuUserPK = menuUserPK;
	}

	
}
