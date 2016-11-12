package com.platformhouse.allegypt.ws.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.platformhouse.allegypt.model.places.Cities;
import com.platformhouse.allegypt.repository.dao.places.CitiesRepository;

@RestController
@RequestMapping("/city")
public class CityController {
	
	
  @Autowired
	private CitiesRepository city;
	@RequestMapping(method=RequestMethod.GET)
    Map<String,List<Cities>> findAllCities(){	
		Map<String,List<Cities>> result = new HashMap<>();
		result.put("Results", city.findAll());
		
	return result;
	}
	
	
	
	
	
}
