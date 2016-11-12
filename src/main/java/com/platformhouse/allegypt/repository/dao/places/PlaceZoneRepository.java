package com.platformhouse.allegypt.repository.dao.places;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.platformhouse.allegypt.model.places.PlaceZone;

public interface PlaceZoneRepository extends JpaRepository<PlaceZone, Long>{

	
	List<PlaceZone> findByCity_cityId(int cityId);
	
	
	
}
