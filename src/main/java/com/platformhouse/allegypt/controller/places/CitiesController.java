package com.platformhouse.allegypt.controller.places;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.platformhouse.allegypt.model.places.Cities;
import com.platformhouse.allegypt.repository.dao.places.CitiesRepository;

@Controller
@RequestMapping("/city-management")
public class CitiesController {
	@Autowired
	private CitiesRepository cityServ;

	public ModelAndView showCities() {

		List<Cities> cities = cityServ.findAll();

		if (cities.size() == 0 || cities == null) {
			String message = "No Cities Here";

			return new ModelAndView("city-management", "message", message);
		} else {

			return new ModelAndView("city-management", "cities", cities);
		}

	}

	@RequestMapping(method = RequestMethod.POST)
	public String addNewCity(Cities city) {
		cityServ.save(city);
		return "city-management";
	}

}
