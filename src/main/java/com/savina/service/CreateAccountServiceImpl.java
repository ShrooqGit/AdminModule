package com.savina.service;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.savina.entity.CreateAccount;
import com.savina.repo.CreateAccountReposetory;

@Service
public class CreateAccountServiceImpl  implements CreateAccountService{

	@Autowired
	private CreateAccountReposetory createAccRepo;
	
	@Override
	public String saveOrUpdateCreatAcc(CreateAccount createAccount) {  
		
		createAccRepo.save(createAccount);
		return " createAccount ";
	}

	@Override
	public List<CreateAccount> getAllCreateAccount() {
		
		return createAccRepo.findAll();
	}

	@Override
	public List<String> getPlanNames() {
		
		return createAccRepo.getPlanNames();
	}

	
}
