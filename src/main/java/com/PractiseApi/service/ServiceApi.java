package com.PractiseApi.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.PractiseApi.entity.Cars;

@Service
public class ServiceApi {

	private List<Cars> cars = new ArrayList<>();
	
	
	public List<Cars> getcarDetails() {
		
	try {	
		return this.cars;
	}catch(Exception e) {
		
		System.out.println("An error occured"+ e.getMessage());
		e.printStackTrace();
		
		return new ArrayList<>();
		
		
	}
		
	}


	public List<Cars> addDetails(Cars carDetail) {
	
		cars.add(carDetail);
		return cars;
		
	}
	
	
}
