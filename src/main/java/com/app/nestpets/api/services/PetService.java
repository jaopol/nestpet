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
	
	public Pet update(Pet pet) {
		
		Optional<Pet> newPet = petRepository.findById(pet.getId());
		
		if( newPet.isPresent() ) {
			
			updateData(newPet.get(), pet);
			return petRepository.save( newPet.get() );
		}
		pet.setId(null);
		return pet;
	}

	private void updateData(Pet newPet, Pet pet) {
		newPet.setCor( pet.getCor() );
		newPet.setCuidados( pet.getCuidados() );
		newPet.setDataNascimentoMae( pet.getDataNascimentoMae() );
		newPet.setDataNascimentoPai( pet.getDataNascimentoPai() );
		newPet.setDataNascimentoPet( pet.getDataNascimentoPet() );
		newPet.setFoto( pet.getFoto() );
		newPet.setNome( pet.getNome() );
		newPet.setNomeMae( pet.getNomeMae() );
		newPet.setNomePai( pet.getNomePai() );
		newPet.setNumeroIdentidade( pet.getNumeroIdentidade() );
		newPet.setObservacao( pet.getObservacao() );
		newPet.setPedigree( pet.getPedigree() );
		newPet.setPelagem( pet.getPelagem() );
		newPet.setPorte( pet.getPorte() );
		newPet.setRaca( pet.getRaca() );
		newPet.setSexo( pet.getSexo() );
	}
}
