package org.pav.suppy.web.controller;

import org.pav.suppy.entity.basic.impl.Country;
import org.springframework.ui.ModelMap;

public interface CountryController {

	String handle(ModelMap model) throws Exception;

	Country storeCountry(String entity, ModelMap modelMap) throws Exception;

	Country findCountry(Long id, ModelMap modelMap) throws Exception;

	Country updateCountry(Long id, ModelMap modelMap) throws Exception;

	Country deactivateCountry(Long id, ModelMap modelMap) throws Exception;

	Country activateCountry(Long id, ModelMap modelMap) throws Exception;
}
