package com.arg.spring.jwt.mongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.arg.spring.jwt.mongodb.models.Acteurs;
import com.arg.spring.jwt.mongodb.models.Contract;

public interface ActeursRepository extends MongoRepository<Acteurs, String>{

}
