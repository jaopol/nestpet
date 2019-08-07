package com.app.nestpets.api.config;

import java.util.Arrays;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.app.nestpets.api.models.Pet;
import com.app.nestpets.api.repository.PetRepository;

@Configuration
public class Instantiation implements CommandLineRunner {

	@Autowired
	private PetRepository petRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		petRepository.deleteAll();
		
		Pet pet1 = new Pet(null, "Boby","Boby Pai","Boby Mae","shinauzer","media","cinza","macho","alta",new Date(),new Date(),new Date(),"obs","","1234");
		Pet pet2 = new Pet(null, "Raica","Raica Pai","Raica Mae","pitbull","media","marron","femea","baixa",new Date(),new Date(),new Date(),"obs","","4321");
		Pet pet3 = new Pet(null, "Rex","Rex Pai","Rex Mae","pastor","grande","cinza","macho","Medio",new Date(),new Date(),new Date(),"obs","","2345");
		Pet pet4 = new Pet(null, "Til","Til Pai","Til Mae","pinscher","pequeno","preto","macho","baixa",new Date(),new Date(),new Date(),"obs","","5432");
		
		petRepository.saveAll( Arrays.asList( pet1, pet2, pet3, pet4 ) ); 
		
	}

}
