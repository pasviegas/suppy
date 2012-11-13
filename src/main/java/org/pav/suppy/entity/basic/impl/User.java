package org.pav.suppy.entity.basic.impl;

import org.pav.suppy.entity.basic.BaseEntity;

public class User extends BaseEntity<Long> {

	private static final long serialVersionUID = 822300645620842397L;

	private Long userid;
	
	private String name;
	
	private String email;
	
	private String password;

	private Country country;

	public Long getUserid() {
		return userid;
	}

	public void setUserid(Long id) {
		this.userid = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}
}
