package br.org.pav.suppy.repository;

import br.org.pav.suppy.model.Stock;

public interface Stocks {

	Stock findOne(String id);
	
	void store(Stock stock);
	
	void remove(String id);

}