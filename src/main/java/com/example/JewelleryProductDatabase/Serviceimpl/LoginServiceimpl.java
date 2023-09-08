package com.example.JewelleryProductDatabase.Serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.JewelleryProductDatabase.Entity.Login;
import com.example.JewelleryProductDatabase.Exception.ResourceNotFoundException;
import com.example.JewelleryProductDatabase.Repository.LoginRepo;
import com.example.JewelleryProductDatabase.Service.LoginService;


@Service
public class LoginServiceimpl implements LoginService {

	@Autowired
	LoginRepo loginRepo;
	
	@Override
	public Login login(String email, String password) {
		 Login s = loginRepo.findByEmail(email);
		 
		 if(s!=null) {
			 if(s.getPassword().equals(password)) {
				 return s;
			 }else {
				throw new ResourceNotFoundException();
			}
		 }else {
			 throw new ResourceNotFoundException();
		 }
	  
	}
	
	
}
