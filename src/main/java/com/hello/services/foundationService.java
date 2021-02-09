package com.hello.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hello.model.entity.Area;
import com.hello.model.entity.Foundation;
import com.hello.repositerios.AreaRepo;
import com.hello.repositerios.foundationRepo;

@Service
public class foundationService {
	@Autowired
	foundationRepo foundationRepo ;
	
	public List<Foundation>  getFoundationOfServiceId(int servicesId){
		return foundationRepo.findByServiceId(servicesId) ;
	}
        	public List<Foundation>  getFoundationOfCityId(int cityId){
		return foundationRepo.findByCityId(cityId) ;
	}
        
        	public List<Foundation>  getFoundationOfAppUserId(long appUserID){
		return foundationRepo.findByAppUserId(appUserID);
	}
	
    public List<Foundation> all () {
   	System.out.print(foundationRepo.findAll()); 
   	return foundationRepo.findAll();
    }
    
    public Foundation findFoundationById (int idd) {
   	   
   	return foundationRepo.findById(idd).orElse(null);
   	//    return areaRepo.findById(idd);

    }
    public void addFoundation(Foundation newFoundation) {
    	foundationRepo.save(newFoundation); 
    	
    }
    public void ubdateFoundation(Foundation newFoundation) {
    	foundationRepo.save(newFoundation); 
    }
    public void deleteFoundation(int id) {
    	foundationRepo.deleteById(id);
    }


}
