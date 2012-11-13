package org.pav.suppy.entity.basic.impl;

import org.pav.suppy.entity.basic.BaseEntity;

public class Country extends BaseEntity<Long> {

	private static final long serialVersionUID = -2163589163208519025L;

	private Long countryid;
	
	private String name;
	
	private Currency currency;

	public Long getCountryid() {
		return countryid;
	}

	public void setCountryid(Long id) {
		this.countryid = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Currency getCurrency() {
		return currency;
	}

	public void setCurrency(Currency currency) {
		this.currency = currency;
	}
	
}
