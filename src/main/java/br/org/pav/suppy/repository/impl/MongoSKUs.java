package br.org.pav.suppy.repository.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;

import br.org.pav.suppy.model.SKU;
import br.org.pav.suppy.repository.SKUs;

@Component
public class MongoSKUs implements SKUs {
	
	@Autowired
	private MongoTemplate mongoTemplate;

	@Override
	public List<SKU> findAll() {
		return mongoTemplate.findAll(SKU.class, "skus");
	}

	@Override
	public SKU findOne(String id) {
		Criteria criteria = new Criteria("id");
		criteria.is(id);
		Query query = new Query(criteria);
		return mongoTemplate.findOne(query, SKU.class, "skus");
	}

}
