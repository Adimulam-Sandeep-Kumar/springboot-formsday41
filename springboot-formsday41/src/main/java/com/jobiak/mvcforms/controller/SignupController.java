package com.jobiak.mvcforms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jobiak.mvcforms.model.Bank;
import com.jobiak.mvcforms.repository.BankRepository;

@Controller
public class SignupController{
	
	@Autowired
	BankRepository repo;

	public SignupController(){
		
	}

	public SignupController(BankRepository repo){
		this.repo=repo;
	}
	
	@RequestMapping(path="/test",method=RequestMethod.GET)
	public String redirect(){
		return "signup";
	}

	@RequestMapping(path="/signup",method=RequestMethod.POST)
	public String doSignUp(@ModelAttribute("bank")Bank bank){	
	repo.save(bank);			
	return "success";
}
}
