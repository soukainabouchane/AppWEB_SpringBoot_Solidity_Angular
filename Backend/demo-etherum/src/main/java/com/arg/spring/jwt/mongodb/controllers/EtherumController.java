package com.arg.spring.jwt.mongodb.controllers;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.protocol.http.HttpService;
import org.web3j.tx.RawTransactionManager;
import org.web3j.tx.TransactionManager;
import org.web3j.tx.Transfer;
import org.web3j.utils.Convert;

import com.arg.spring.jwt.mongodb.models.Contract;
import com.arg.spring.jwt.mongodb.models.MyContract_sol_MyContract;


@SuppressWarnings("deprecation")
@RestController
@RequestMapping("/apiii/etherum")
public class EtherumController {
    
	 private final static BigInteger GAS_LIMIT = BigInteger.valueOf(6721975L);
	 private final static BigInteger GAS_PRICE = BigInteger.valueOf(20000000000L);

	 public static MyContract_sol_MyContract addressContract ;
	 private final static String  PRIVATE_KEY="ec9f5cdf35ed0f88c2632cebded054dd2e7d1079aeb5ca14259bf5efe5a394ac";
	 public static String CONTRACT_ADDRESS ="0xe375dd27ff0cbb7c6afe269d84ad066dcbb686d3";
	 public static Web3j web3j = Web3j.build(new HttpService("HTTP://127.0.0.1:7545")); 
	 
	 public static Credentials credentials = getCredentialsFromPrivateKey();
	 
	 private static Credentials getCredentialsFromPrivateKey() {
        return Credentials.create(PRIVATE_KEY);
    }
	
	
	 public static String deployContract(Web3j web3j, Credentials credentials) throws Exception {
	        return MyContract_sol_MyContract.deploy(web3j, credentials, GAS_PRICE, GAS_LIMIT)
	                .send()
	                .getContractAddress();
	    }


   
	private  Credentials getCredential(String prvKey) {
		
	        return Credentials.create(prvKey);
	  
	}
	 public static MyContract_sol_MyContract loadContract(String contractAddress, Web3j web3j, Credentials credentials) {
	        return MyContract_sol_MyContract.load(contractAddress, web3j, credentials, GAS_PRICE, GAS_LIMIT);
	    }

	  
	@PostMapping("/saveEtherum")
	 public TransactionReceipt setBienImobiler(@RequestBody Contract bienIm ,@RequestParam String addressVendeur, @RequestParam String addressAcheteur) throws Exception {
		     System.out.println("hello" +addressVendeur +"//"+addressAcheteur+"//+"+bienIm.getTitre()+"//."+BigInteger.valueOf( bienIm.getPrice())+"//"+bienIm.getDate());
		   addressContract.setBienImobiler(addressVendeur,addressAcheteur,bienIm.getTitre(), BigInteger.valueOf( bienIm.getPrice()),bienIm.getDate() ).send();
		   TransactionManager transactionManager = new RawTransactionManager(
	                web3j,
	                credentials
	        );

	        Transfer transfer = new Transfer(web3j, transactionManager);
             System.out.println("recepient"+ addressVendeur);
	        TransactionReceipt transactionReceipt = transfer.sendFunds(
	        		addressVendeur,
	                BigDecimal.valueOf( bienIm.getPrice()),
	                Convert.Unit.ETHER,
	                GAS_PRICE,
	                GAS_LIMIT
	        ).send();
	   	 return transactionReceipt;
	 }
	

	 @GetMapping("getBienImobilier")
	 public List getBienImobiler(@RequestParam String address) throws Exception{
		 return addressContract.getBienImobiler(address).send();
	 }
	
	  @RequestMapping(value="getBienImobiliers",method=RequestMethod.GET)
	 
	 public List getBienImobilers() throws Exception {
		 return addressContract.getBienImobilers().send();
	 }
	
}
