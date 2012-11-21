package org.pav.suppy.service.operation;

import org.pav.suppy.entity.basic.impl.User;
import org.pav.suppy.entity.operation.impl.UserSpecification;

public interface UserSpecificationService {
	
	void addSpecification(User user, UserSpecification us);
	
}
