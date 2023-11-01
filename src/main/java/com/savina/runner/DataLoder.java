package com.savina.runner;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;


import com.savina.entity.CreateAccount;
import com.savina.repo.CreateAccountReposetory;

@Component
public class DataLoder implements ApplicationRunner  {
	@Autowired
	private CreateAccountReposetory createAccRepo;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		createAccRepo.deleteAll();
		
		CreateAccount c1 = new CreateAccount("SSN", "Food");
		CreateAccount c2 = new CreateAccount("CCAP", "Child Care");
		CreateAccount c3 = new CreateAccount("SSN", "Food");
		CreateAccount c4 = new CreateAccount("Medicaid", "Health");
		CreateAccount c5 = new CreateAccount("Medicare", "Health");
		CreateAccount c6 = new CreateAccount("RIW", "UnEmployment");
List<CreateAccount> records =Arrays.asList(c1,c2,c3,c4,c5,c6);
		
 createAccRepo.saveAll(records);
	}

}
