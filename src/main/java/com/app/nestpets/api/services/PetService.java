package com.app.nestpets.api.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.nestpets.api.models.Pet;
import com.app.nestpets.api.repository.PetRepository;

@Service
public class PetService {

	@Autowired
	private PetRepository petRepository;
	
	public List<Pet> findAll(){
		return petRepository.findAll();
	}
	
	public Optional<Pet> findById(String id) {
		return petRepository.findById(id);
	}
	
	public Pet insert(Pet obj) {
		return petRepository.insert(obj);
	}
	
	public Boolean delete(String id) {
		
		Optional<Pet> pet = findById(id);
		
		if( pet.isPresent() ) {
			petRepository.deleteById(id);
			return Boolean.TRUE;
		}
		
		return Boolean.FALSE;
		 
	}
}
