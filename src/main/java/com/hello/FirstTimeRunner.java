/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hello;
// set global time_zone ="+3:00";


import com.hello.model.entity.Service;
// ssss
import com.hello.sec.AppUser;
import com.hello.sec.UserService;
import com.hello.services.serviceOfService;

import java.util.Date;

import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class FirstTimeRunner implements CommandLineRunner {

	private final Log log = LogFactory.getLog(FirstTimeRunner.class);

	

           
	@Autowired
	private UserService userService ;
	@Autowired
	private serviceOfService service;
	
	@Override
	public void run(String... args) throws Exception {

	//	log.info("when project run");
		


		userService.addUser(new AppUser("admin" , "admin" , true , "admin"));
     	userService.addUser(new AppUser("user11" , "user11" , true , "user"));
     	service.add(new Service("نظافة"));
     	service.add(new Service("نقل اثاث"));

        

	}

}
