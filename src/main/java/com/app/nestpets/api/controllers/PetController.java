package com.app.nestpets.api.controllers;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.app.nestpets.api.dto.PetDTO;
import com.app.nestpets.api.models.Pet;
import com.app.nestpets.api.services.PetService;

@RestController
@RequestMapping(value = "/pets")
public class PetController {
	
	@Autowired
	private PetService petService;
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<PetDTO>> findAll(){
					
		List<Pet> list = petService.findAll();
		List<PetDTO> listDto = list.stream().map( obj -> new PetDTO( obj ) ).collect( Collectors.toList() );
		
		return ResponseEntity.ok().body(listDto);
	}

	@RequestMapping( value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<PetDTO> findById( @PathVariable String id){
		
		Optional<Pet> obj = petService.findById(id);
		if( !obj.isPresent() ) {
			return ResponseEntity.status(404).body( new PetDTO() );
		}
	
		return ResponseEntity.ok().body( new PetDTO(obj.get()) );
	}
}
