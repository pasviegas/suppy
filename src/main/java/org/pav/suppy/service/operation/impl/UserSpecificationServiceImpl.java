package org.pav.suppy.service.operation.impl;

import org.pav.suppy.entity.basic.impl.User;
import org.pav.suppy.entity.operation.impl.UserSpecification;
import org.pav.suppy.service.operation.UserSpecificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

@Component
public class UserSpecificationServiceImpl implements UserSpecificationService {
	
	@Autowired
	private MongoTemplate mongoTemplate;
	
	public void addSpecification(User user, UserSpecification us) {
		mongoTemplate.getCollection(user.getId().toString());
		mongoTemplate.insert(us, user.getId().toString());
	}
}