package org.pav.suppy.entity.basic.impl;

import org.pav.suppy.entity.basic.BaseEntity;

public class Currency extends BaseEntity<Long> {

	private static final long serialVersionUID = -5893698315853510817L;

	private Long currencyid;
	
	private String name;

	public Long getCurrencyid() {
		return currencyid;
	}

	public void setCurrencyid(Long id) {
		this.currencyid = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
