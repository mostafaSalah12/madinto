package com.platformhouse.allegypt.repository.dao.places;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.platformhouse.allegypt.model.places.PlaceArea;

public interface PlaceAreaRepository extends JpaRepository<PlaceArea, Long>{
	


	@SuppressWarnings("unchecked")
	PlaceArea save(PlaceArea newPlaceArea);

	List<PlaceArea> findByNameArLike(String nameAr);

	List<PlaceArea> findByNameEnLike(String nameEn);
	
	Page<PlaceArea> findByZone_NameArLike(String nameAr,Pageable pageable);
	Page<PlaceArea> findByZone_NameEnLike(String nameEn,Pageable pageable);

}
