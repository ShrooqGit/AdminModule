package com.savina.service;

import java.util.List;

import com.savina.entity.CreateAccount;

public interface CreateAccountService {

	
	public String saveOrUpdateCreatAcc(CreateAccount createAccount);
	public List<CreateAccount> getAllCreateAccount();
	public List<String>getPlanNames();
}
