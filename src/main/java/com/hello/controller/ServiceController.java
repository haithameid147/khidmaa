package com.hello.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.hello.model.entity.City;
import com.hello.model.entity.Service;
import com.hello.services.serviceOfService;


@CrossOrigin(origins="http://localhost:4200")
@RestController


public class ServiceController {
	
    @Autowired
	serviceOfService service ;
	
	@GetMapping("/allServices")
	public List<Service> getAllEmployees(){
		return service.all(); 
	}
	
//	@GetMapping("/user/{userName}")
//	public List<Services> geetAllEmployees(@PathVariable String userName){
//		
//		return service.all(); 
//	}
	
	@GetMapping("/service/{idd}")
	
    public Service findById (@PathVariable int idd) {
   	return service.findById(idd) ;
   	
    }
	
	@PostMapping("/addservice")
	public String addCity(@RequestBody Service newCity) {
		service.add(newCity);
		return "Services saved";
	}
	@PutMapping("/addService/{id}")
	public String ubdateCity(@PathVariable int id,
		@RequestBody Service newCity) {
		service.add(newCity);
		return "Services ubdate";
	}
	   
	@DeleteMapping("/deleteService/{id}")
	public String deleteCity(@PathVariable int id) {
		service.delete(id);
		return "Services deleted";
	}
	

	
}
