package br.org.pav.suppy.repository.impl;

import static org.springframework.data.mongodb.core.query.Criteria.where;
import static org.springframework.data.mongodb.core.query.Query.query;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

import br.org.pav.suppy.model.SKU;
import br.org.pav.suppy.model.Stock;
import br.org.pav.suppy.repository.Stocks;

@Component
public class MongoStocks implements Stocks {
	
	@Autowired
	private MongoTemplate mongoTemplate;

	@Override
	public Stock findOne(String id) {
		mongoTemplate.getCollection(id);
		List<SKU> skus = mongoTemplate.findAll(SKU.class, id);
		Stock stock = new Stock();
		stock.setId(id);
		stock.setSKUs(skus);
		return stock;
	}

	@Override
	public void store(Stock stock) {
		mongoTemplate.getCollection(stock.getId());
		for (SKU sku : stock.getSKUs()) {
			if(sku.getId() == null){
				sku.setBought(new Date());
				mongoTemplate.insert(sku, stock.getId());
			} else if(sku.getDirty()){
				mongoTemplate.findAndRemove(query(where("id").is(sku.getId())), SKU.class, stock.getId());
				mongoTemplate.insert(sku, stock.getId());
			}	
		}
	}

	@Override
	public void remove(String id) {
		mongoTemplate.dropCollection(id);
	}

}
