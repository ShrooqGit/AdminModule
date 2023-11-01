package com.savina.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.savina.entity.CreateAccount;
@Repository
public interface CreateAccountReposetory extends JpaRepository<CreateAccount, Integer> {

	 @Modifying
	    @Transactional
		@Query("select distinct(planName) from CreateAccount ")
		public List<String> getPlanNames();
}
