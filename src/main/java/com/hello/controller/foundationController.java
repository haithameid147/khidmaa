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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hello.model.entity.Area;
import com.hello.model.entity.Foundation;
import com.hello.services.AreaService;
import com.hello.services.foundationService;

@CrossOrigin(origins="http://localhost:4200")
@RestController

public class foundationController {

	@Autowired
	foundationService foindationService;
	
	@GetMapping("/foundation")
	public List<Foundation> getAllFoundation(){
	return foindationService.all(); 
	}
	 
	@GetMapping("/employees/{servicesId}/foundation")
	public List<Foundation> getAllfoundationByserviceID(@PathVariable int servicesId){
      return foindationService.getFoundationOfServiceId(servicesId) ;
	}
        @GetMapping("/city/{cityId}/foundation")
	public List<Foundation> getAllfoundationByCityID(@PathVariable int cityId){
      return foindationService.getFoundationOfCityId(cityId) ;
	}
        @GetMapping("/apppUserr/{appUserId}/foundation")
	public List<Foundation> getAllfoundationByAppUserID(@PathVariable long appUserId){
      return foindationService.getFoundationOfAppUserId(appUserId) ;
	}
	
//	@GetMapping("/area")
//	public List<Area> geetAllArea(){
//		
//		return areaService.allArea(); 
//	}
//	
	@GetMapping("/foundation/{idd}")
    public Foundation findFoundationById (@PathVariable int idd) {
   	return foindationService.findFoundationById(idd);
    }
	
	@PostMapping("/addfoundation")
	public void addfoundation(@RequestBody Foundation newArea) {
		foindationService.addFoundation(newArea);
	//	return "area saved";
	}
	
	@PutMapping("/addFoundation/{id}")
	public String ubdatefoundation(@PathVariable int id, @RequestBody Foundation newFoundation) {
		foindationService.addFoundation(newFoundation);
		return "area ubdate";
	}
	
	@DeleteMapping("/deleteFoundation/{id}")
	public String deleteArea(@PathVariable int id) {
		foindationService.deleteFoundation(id);
		return "city deleted";
		
	}
	
}
