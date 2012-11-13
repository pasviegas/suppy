package org.pav.suppy.entity.operation.impl;

import java.math.BigDecimal;
import java.util.Date;

public class UserSpecification {

	private String id;
	
	private String skuId;
	
	private BigDecimal price;
	
	private Date last;
	
	private Integer daysInStock;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSkuId() {
		return skuId;
	}

	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public Date getLast() {
		return last;
	}

	public void setLast(Date last) {
		this.last = last;
	}

	public Integer getDaysInStock() {
		return daysInStock;
	}

	public void setDaysInStock(Integer daysInStock) {
		this.daysInStock = daysInStock;
	}
}
