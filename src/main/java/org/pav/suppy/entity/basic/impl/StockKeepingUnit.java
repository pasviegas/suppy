package org.pav.suppy.entity.basic.impl;

import org.pav.suppy.entity.basic.BaseEntity;

public class StockKeepingUnit extends BaseEntity<Long> {

	private static final long serialVersionUID = 5013782065096503387L;

	private Long stockkeepingunitid;
	
	private String name;
	
	public Long getStockkeepingunitidid() {
		return stockkeepingunitid;
	}

	public void setStockkeepingunitidid(Long id) {
		this.stockkeepingunitid = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
