package com.app.nestpets.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.app.nestpets.api.models.Pet;

@Repository 
public interface PetRepository extends MongoRepository<Pet, String> {

}
