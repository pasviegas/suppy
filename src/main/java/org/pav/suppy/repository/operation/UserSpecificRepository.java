package org.pav.suppy.repository.operation;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserSpecificRepository extends MongoRepository<Long, String> {
}
