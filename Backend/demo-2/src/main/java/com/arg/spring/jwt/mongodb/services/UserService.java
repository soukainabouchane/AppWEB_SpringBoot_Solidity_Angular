package com.arg.spring.jwt.mongodb.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import com.arg.spring.jwt.mongodb.models.User;
import com.arg.spring.jwt.mongodb.repository.UserRepository;
@Service
public class UserService {
 private final MongoTemplate  mongoTemplate;
 @Autowired 
	private UserRepository userRepository;
 public UserService(MongoTemplate  mongoTemplate){
	 this.mongoTemplate =mongoTemplate;
 }
 
 
 public List<User> getUsers(){
	
	 Query query=  new Query();
	query.addCriteria(Criteria.where("roles").is("admin"));
      
	return  mongoTemplate.find(query, User.class);
 }
}
