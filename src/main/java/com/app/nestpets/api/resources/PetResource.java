package com.app.nestpets.api.resources;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.app.nestpets.api.dto.PetDTO;
import com.app.nestpets.api.models.Pet;
import com.app.nestpets.api.services.PetService;

@RestController
@RequestMapping(value = "/pets")
public class PetResource {
	
	@Autowired
	private PetService petService;
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<PetDTO>> findAll(){
					
		List<Pet> list = petService.findAll();
		List<PetDTO> listDto = list.stream().map( obj -> new PetDTO( obj ) ).collect( Collectors.toList() );
		
		return ResponseEntity.ok().body(listDto);
	}

}
