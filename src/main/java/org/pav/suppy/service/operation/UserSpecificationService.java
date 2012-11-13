package org.pav.suppy.service.operation;

import org.pav.suppy.entity.basic.impl.User;
import org.pav.suppy.entity.operation.impl.UserSpecification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;

public class UserSpecificationService {
	
	@Autowired
	private MongoTemplate mongoTemplate;
	
	public void addSpecification(User user, UserSpecification us) {
		mongoTemplate.getCollection(user.getId().toString());
		mongoTemplate.insert(us, user.getId().toString());
	}
}
