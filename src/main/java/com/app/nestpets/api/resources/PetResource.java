package com.app.nestpets.api.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.app.nestpets.api.models.Pet;
import com.app.nestpets.api.services.PetService;

@RestController
@RequestMapping(value = "/pets")
public class PetResource {
	
	@Autowired
	private PetService petService;
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Pet>> findAll(){
					
		List<Pet> list = petService.findAll();
		
		return ResponseEntity.ok().body(list);
	}

}
