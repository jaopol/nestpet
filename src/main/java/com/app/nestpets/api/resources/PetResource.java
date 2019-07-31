package com.app.nestpets.api.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.app.nestpets.api.models.Pet;

@RestController
@RequestMapping(value = "/pets")
public class PetResource {
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Pet>> findAll(){
		
		Pet pet = new Pet("1", "Boby");
		Pet pet2 = new Pet("2", "Raica");
		
		List<Pet> list = new ArrayList<Pet>();
		list.addAll(Arrays.asList(pet, pet2));
		
		return ResponseEntity.ok().body(list);
	}

}
