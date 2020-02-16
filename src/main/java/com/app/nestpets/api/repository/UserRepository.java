package com.app.nestpets.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.app.nestpets.api.models.User;

@Repository 
public interface UserRepository extends MongoRepository<User, String> {

}
