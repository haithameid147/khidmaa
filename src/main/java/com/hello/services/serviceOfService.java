package com.hello.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import com.hello.model.entity.Service;
import com.hello.repositerios.serviceRepo;

@Service
public class serviceOfService {
	
    @Autowired
	serviceRepo serviceRepo ;
    
    public List<com.hello.model.entity.Service> all () {
   	
   	return serviceRepo.findAll();
    }
    
    public com.hello.model.entity.Service findById (int idd) {
    return serviceRepo.findById(idd).orElse(null);
    }
    
    public void add(com.hello.model.entity.Service newCity) {
    	serviceRepo.save(newCity); 
    }
    public void ubdate(com.hello.model.entity.Service newCity) {
    	serviceRepo.save(newCity); 
    }
    public void delete(int id) {
    	serviceRepo.deleteById(id);
    }
    
}
