package com.hello.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hello.model.entity.City;
import com.hello.repositerios.cityRepo;

@Service
public class cityService {
	
     @Autowired
     cityRepo cityRepo ;
     
     public List<City> all () {
    	
    	return cityRepo.findAll();
     }
     
     public City findById (int idd) {
    	
     return cityRepo.findById(idd).orElse(null);
     }
     public void addCity(City newCity) {
    	 cityRepo.save(newCity); 
     }
     public void ubdateCity(City newCity) {
    	 cityRepo.save(newCity); 
     }
     public void deleteCity(int id) {
    	 cityRepo.deleteById(id);
     }
     
}
