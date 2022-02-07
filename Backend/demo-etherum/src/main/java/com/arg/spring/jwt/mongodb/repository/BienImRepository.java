package com.arg.spring.jwt.mongodb.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.arg.spring.jwt.mongodb.models.Contract;





public interface BienImRepository extends MongoRepository<Contract, String> {

	Contract findByTitre(String titre);
	/*Optional<BienIm> findByUsername(String username);

	Boolean existsByUsername(String username);

	Boolean existsByEmail(String email);*/
}
