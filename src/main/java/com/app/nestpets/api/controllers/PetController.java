package com.app.nestpets.api.controllers;

import java.net.URI;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.app.nestpets.api.dto.PetDTO;
import com.app.nestpets.api.models.Pet;
import com.app.nestpets.api.services.PetService;

@RestController
@RequestMapping(value = "/pets")
public class PetController {
	
	@Autowired
	private PetService petService;
	
	@Autowired
	private PetDTO petDto;
	
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
	
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Void> insertPet( @RequestBody PetDTO dto ){
		
		Pet obj = petDto.fromDtoToEntity(dto);
		obj = petService.insert(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand( obj.getId() ).toUri();
		
		return ResponseEntity.created(uri).build();
	}
	
	@RequestMapping( value = "/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> deleteById( @PathVariable String id){
		
		Boolean ok = petService.delete(id);
		
		if( ok ) { 
			return ResponseEntity.noContent().build(); 
		}
	
		return ResponseEntity.status(404).build();
	}
	
	@RequestMapping( value = "/{id}", method = RequestMethod.PUT)
	public ResponseEntity<Void> updatePet( @RequestBody PetDTO dto, @PathVariable String id ){
		
		Pet obj = petDto.fromDtoToEntity(dto);
		obj.setId(id);
		obj = petService.update(obj);
		
		return ResponseEntity.noContent().build();
	}

}
