package com.hello.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hello.model.entity.AdminUser;
import com.hello.services.AdminUserService;


@CrossOrigin(origins="http://localhost:4200")
@RestController

public class adminUserController {
	
	@Autowired
	AdminUserService adminUserService;
	@GetMapping("/aa")
	    public List<AdminUser> getAll(){
		
		return adminUserService.allData();
	
	
	}
	}





