package com.savina.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.savina.entity.CreateAccount;
import com.savina.service.CreateAccountService;
import com.savina.service.CreateAccountServiceImpl;

@RestController
@RequestMapping("/")
public class CreateAccountController {

	@Autowired
	private CreateAccountService createAccService;
	
	@PostMapping("/save")
	 public String handleSubmitBtn(@ RequestBody CreateAccount createAccount) {
		 
		 return createAccService.saveOrUpdateCreatAcc(createAccount);
		 
	 }
	@GetMapping("/find")
	public List<CreateAccount> getCaseWorkers( CreateAccount createAccount ) {
		
		List<CreateAccount> allCreateAccount = createAccService.getAllCreateAccount();
		return allCreateAccount;
	}
	
	
	
}
