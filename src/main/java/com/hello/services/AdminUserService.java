package com.hello.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hello.model.entity.AdminUser;
import com.hello.repositerios.AdminUserRepo;

@Service
public class AdminUserService {
	@Autowired
  AdminUserRepo adminUserRepo ;
	
    public List<AdminUser> allData () {
   	return adminUserRepo.findAll();
    }
}
