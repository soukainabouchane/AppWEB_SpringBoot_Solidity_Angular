package com.arg.spring.jwt.mongodb.controllers;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.arg.spring.jwt.mongodb.models.Acteurs;
import com.arg.spring.jwt.mongodb.models.Contract;
import com.arg.spring.jwt.mongodb.models.User;
import com.arg.spring.jwt.mongodb.repository.ActeursRepository;
import com.arg.spring.jwt.mongodb.repository.BienImRepository;
import com.arg.spring.jwt.mongodb.repository.UserRepository;


@RequestMapping("/apiii/BienIm")
@RestController
public class ContractController {
	
	@Autowired 
	private UserRepository userRepository;
	@Autowired
	public BienImRepository bienImRepository;
	
	@Autowired
	public ActeursRepository acteursRepository;
	@PostMapping("/addBienIm")
	public String saveContract(@RequestBody Contract bienImm,
			@RequestParam String  nomAcheteur,
			@RequestParam String  nomVendeur,
			@RequestParam String  addressAcheteur,
			@RequestParam String  addressVendeur,
			@RequestParam String  email) {
		Acteurs acteurA= new Acteurs(addressAcheteur,nomAcheteur,"Acheteur");
		acteursRepository.save(acteurA);
		Acteurs acteurV= new Acteurs(addressVendeur,nomVendeur,"Vendeur");
		acteursRepository.save(acteurV);
		Set<Acteurs> acteurs  = new HashSet<>();
		acteurs.add(acteurA);
		acteurs.add(acteurV);
		bienImm.setActeurs(acteurs);
		User user  =  userRepository.findByEmail(email);
		  bienImm.setUser(user);
		 
		  System.out.println(email);
		bienImRepository.save(bienImm);
		return "success";
	}
	 
		@GetMapping("/findAllBienIm")
		public List<Contract> getContract() {
			System.out.println("heloalltre");
			return bienImRepository.findAll();
		}
	 
	  @GetMapping("/{titre}")
	    public String deleteContract(@PathVariable(value = "titre") String titre){
			System.out.println("helo titre"+titre);
		   bienImRepository.deleteById(titre);
				return "success";
	        
	    }
	
	  @GetMapping("/getBienImm/{titre}")
	    public Contract getContract(@PathVariable(value = "titre") String titre){
			System.out.println("helo titre"+titre);
			
			
				return bienImRepository.findByTitre(titre);
	        
	    }
}
	  /*@CrossOrigin(origins = "*", maxAge = 3600)
	  @GetMapping("/getBienImm/{titre}")
	    public List<BienImm> getBienImm(@PathVariable(value = "titre") String titre){
			System.out.println("helo titre"+titre);
			
			
				return bienImRepository.findByTitres(titre);
	        
	    }
}*/
