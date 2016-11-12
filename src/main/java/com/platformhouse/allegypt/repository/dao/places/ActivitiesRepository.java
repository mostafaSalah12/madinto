package com.platformhouse.allegypt.repository.dao.places;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.platformhouse.allegypt.model.places.Activities;

public interface ActivitiesRepository  extends JpaRepository<Activities, Integer>{
	
	
	
	@SuppressWarnings("unchecked")
	Activities save(Activities newActivities);
	
	Page<Activities> findAll(Pageable pageable);

	List<Activities> findByActivityNameArLike(String activityNameAr);

	List<Activities> findByActivityNameEnLike(String activityNameEn);

	
	
	
	
	
	
	

}
