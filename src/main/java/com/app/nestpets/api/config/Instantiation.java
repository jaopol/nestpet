package com.app.nestpets.api.config;

import java.time.Instant;
import java.util.Arrays;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.app.nestpets.api.models.Pet;
import com.app.nestpets.api.models.User;
import com.app.nestpets.api.repository.PetRepository;
import com.app.nestpets.api.repository.UserRepository;

@Configuration
public class Instantiation implements CommandLineRunner {

	@Autowired
	private PetRepository petRepository;
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		petRepository.deleteAll();
		userRepository.deleteAll();
		
		Pet pet1 = new Pet(null, "Boby","Boby Pai","Boby Mae","shinauzer","media","cinza","macho"," ", "P",new Date(),new Date(),new Date(),"obs","","1234", "123456", Instant.now(), Instant.now() );
		Pet pet2 = new Pet(null, "Raica","Raica Pai","Raica Mae","pitbull","media","marron","femea"," ","M",new Date(),new Date(),new Date(),"obs","","4321", "123457", Instant.now(), Instant.now() );
		Pet pet3 = new Pet(null, "Rex","Rex Pai","Rex Mae","pastor","grande","cinza","macho"," ", "G",new Date(),new Date(),new Date(),"obs","","2345", "123458", Instant.now(), Instant.now() );
		Pet pet4 = new Pet(null, "Til","Til Pai","Til Mae","pinscher","pequeno","preto","macho","", "P",new Date(),new Date(),new Date(),"obs","","5432", "123459", Instant.now(), Instant.now() );
		
		User user1 = new User(null, "Maria", "maria@test.com", pet2);
		User user2 = new User(null, "Anthony", "anthony@test.com", pet1);
		
		petRepository.saveAll( Arrays.asList( pet1, pet2, pet3, pet4 ) );
		userRepository.saveAll( Arrays.asList( user1, user2) );
		
	}

}
