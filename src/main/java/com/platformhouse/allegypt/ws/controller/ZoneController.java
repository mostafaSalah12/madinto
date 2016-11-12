package com.platformhouse.allegypt.ws.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.platformhouse.allegypt.model.places.PlaceZone;
import com.platformhouse.allegypt.repository.dao.places.PlaceZoneRepository;

@RestController
@RequestMapping("/zone")
public class ZoneController {
	@Autowired
	PlaceZoneRepository zone;
	
	@RequestMapping("/{id}")
	Map<String,List<PlaceZone>> findZonesByCityId(@PathVariable("id") int id){
		
		Map<String,List<PlaceZone>> zones = new HashMap<>();
		
		zones.put("results", zone.findByCity_cityId(id));
		
		
		return zones;
	}
	
	

}
