package com.arg.spring.jwt.mongodb.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arg.spring.jwt.mongodb.models.User;
import com.arg.spring.jwt.mongodb.repository.UserRepository;
import com.arg.spring.jwt.mongodb.services.UserService;

//@CrossOrigin(origins = "*", maxAge = 3600)

	@RestController

	@RequestMapping("/api/users")
	public class UserController {
		@Autowired 
		private UserRepository userRepository;
		@Autowired
		PasswordEncoder encoder;
		
		@Autowired
		private UserService userService;
		
		//@CrossOrigin(origins = "*", maxAge = 3600)
		@GetMapping
	    public List<User> getAllUsers(){
			//return this.userService.getUsers();
	   	return this.userRepository.findAll();
	    }
		//@CrossOrigin(origins = "*", maxAge = 3600)
		 @PostMapping
	     public User CreateUser(@RequestBody  User user) {
			
			User usert = new User(user.getUsername(), 
					 user.getEmail(),encoder.encode(user.getPassword()));

	    	 return this.userRepository.save(usert);
	     }
		  //@CrossOrigin(origins = "*", maxAge = 3600)
		  @GetMapping("/{id}")
		    public String deleteUser(@PathVariable(value = "id") String id){
			System.out.println("deleted");
				userRepository.deleteById(id);
					return "success";
		        
		    }
		  @GetMapping("/getUser/{id}")
		    public User getUser(@PathVariable(value = "id") String id){
		   	 return this.userRepository.findUserById(id);
		    }
		  @PostMapping("/updateUser/{id}")
		     public User updateUser(@PathVariable(value = "id") String id ,@RequestBody  User user) {
			User usert  = this.userRepository.findUserById(id);
		                  System.out.println(user.getPassword());
		                  usert.setUsername(user.getUsername());
						 usert.setEmail(user.getEmail());
						 usert.setPassword(user.getPassword());
						 
		    	 return this.userRepository.save(usert);
		     }
		 

}
