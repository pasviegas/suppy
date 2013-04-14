package br.org.pav.suppy.model;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.annotation.Transient;

public class SKU implements Serializable {

	private String name;
	
	private String id;
	
	private Date bought;
	
	private Integer defaultLifeSpan;
	
	private Boolean ended;
	
	@Transient
	private boolean dirty;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public boolean getDirty() {
		return dirty;
	}
	
	public void setDirty(boolean dirty) {
		this.dirty = dirty;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}

	public Date getBought() {
		return bought;
	}

	public void setBought(Date bought) {
		this.bought = bought;
	}

	public Integer getDefaultLifeSpan() {
		return defaultLifeSpan;
	}

	public void setDefaultLifeSpan(Integer defaultLifeSpan) {
		this.defaultLifeSpan = defaultLifeSpan;
	}

	public Boolean getEnded() {
		return ended;
	}

	public void setEnded(Boolean ended) {
		this.ended = ended;
	}
	
}
