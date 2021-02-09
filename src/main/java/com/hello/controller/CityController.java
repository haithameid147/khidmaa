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
import com.hello.services.cityService;

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class CityController {
	
	@Autowired
	cityService cityService;
	
	@GetMapping("/employees")
	public List<City> getAllEmployees(){
		
		return cityService.all(); 
	}
	@GetMapping("/user/{userName}")
	public List<City> geetAllEmployees(@PathVariable String userName){
		
		return cityService.all(); 
	}
	
	@GetMapping("/employees/{idd}")
	
    public City findById (@PathVariable int idd) {
   	return cityService.findById(idd) ;
   	
    }
	
	@PostMapping("/addCity")
	public String addCity(@RequestBody City newCity) {
		cityService.addCity(newCity);
		return "city saved";
	}
	@PutMapping("/addCity/{id}")
	public String ubdateCity(@PathVariable int id,
			@RequestBody City newCity) {
		cityService.addCity(newCity);
		return "city ubdate";
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteCity(@PathVariable int id) {
		cityService.deleteCity(id);
		return "city deleted";
	}
	
    

}
