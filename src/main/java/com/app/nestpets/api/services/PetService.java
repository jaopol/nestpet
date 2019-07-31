package com.app.nestpets.api.services;

import java.util.List;

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
}
