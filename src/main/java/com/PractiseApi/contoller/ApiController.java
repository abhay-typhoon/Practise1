package com.PractiseApi.contoller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.PractiseApi.entity.Cars;
import com.PractiseApi.service.ServiceApi;

@RestController
@RequestMapping("/cars")
public class ApiController {
	
	@Autowired
	private ServiceApi serviceApi;
	
	
	@GetMapping("/detail")
	public List<Cars> getAll() {
		
		return serviceApi.getcarDetails();
	}
	
	@PostMapping("/newCar")
	public List<Cars> createEntry(@RequestBody Cars carsEntry){
		
		return serviceApi.addDetails(carsEntry);
				
	}

}
