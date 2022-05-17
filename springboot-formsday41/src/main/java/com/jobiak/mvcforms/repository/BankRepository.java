package com.jobiak.mvcforms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jobiak.mvcforms.model.Bank;

@Repository		//CRUD operations
public interface BankRepository extends JpaRepository<Bank, Long>{
	//Entity class and Entity primary key column type
}
