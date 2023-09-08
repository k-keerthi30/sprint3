package com.example.JewelleryProductDatabase.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.example.JewelleryProductDatabase.Entity.Login;
import com.example.JewelleryProductDatabase.Service.LoginService;


@RestController
public class LoginController {

	@Autowired
	LoginService loginService;
	
	@GetMapping("/login")
	public Login login(@RequestHeader String email ,
			@RequestHeader String password) {
		
		return loginService.login(email, password); 
	}
	
	
}
