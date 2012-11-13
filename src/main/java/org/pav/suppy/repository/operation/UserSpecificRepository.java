package org.pav.suppy.repository.operation;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserSpecificRepository extends MongoRepository<Long, String> {
}
