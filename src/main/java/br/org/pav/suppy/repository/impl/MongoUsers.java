package br.org.pav.suppy.repository.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import br.org.pav.suppy.model.User;
import br.org.pav.suppy.repository.Users;

@Component
public class MongoUsers implements Users {
	
	@Autowired
	private MongoTemplate mongoTemplate;

	@Override
	public List<User> findAll() {
		return mongoTemplate.findAll(User.class, "users");
	}

	@Override
	public User findOne(String id) {
		Criteria criteria = new Criteria("id");
		criteria.is(id);
		Query query = new Query(criteria);
		return mongoTemplate.findOne(query, User.class, "users");
	}

	@Override
	public void store(User user) {
		Assert.isNull(user.getId(), "Should not have id set");
		user.setId(UUID.randomUUID().toString());
		mongoTemplate.insert(user, "users");
	}

	@Override
	public void remove(String id) {
		mongoTemplate.remove(new Query(new Criteria("id").is(id)), "users");
	}

}
