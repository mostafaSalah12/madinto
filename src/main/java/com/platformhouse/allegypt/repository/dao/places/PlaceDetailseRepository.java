package com.platformhouse.allegypt.repository.dao.places;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.platformhouse.allegypt.model.places.PlaceDetails;

public interface PlaceDetailseRepository extends JpaRepository<PlaceDetails, Long> {

	PlaceDetails findOne(Long placeId);

	@SuppressWarnings("unchecked")
	PlaceDetails save(PlaceDetails newPlaceDetails);
	
	Page<PlaceDetails> findAll(Pageable pageable);

	List<PlaceDetails> findByNameArLike(String nameAr);

	List<PlaceDetails> findByNameEnLike(String nameEn);

	Page<PlaceDetails> findByCategory_categoryNameArLike(String categoryNameAr, Pageable pageable);

	Page<PlaceDetails> findByCategory_categoryNameEnLike(String categoryNameEn, Pageable pageable);

	Page<PlaceDetails> findByGroup_PlaceGroupNameArLike(String placeGroupNameAr, Pageable pageable);

	Page<PlaceDetails> findByGroup_PlaceGroupNameEnLike(String placeGroupNameEn, Pageable pageable);

}
