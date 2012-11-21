package org.pav.suppy.web.controller;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.pav.suppy.entity.basic.impl.Country;
import org.pav.suppy.test.configuration.TestWebConfiguration;
import org.pav.suppy.test.controller.AbstractControllerTest;
import org.pav.suppy.test.provider.controller.CountryControllerProvider;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.ui.ModelMap;

@RunWith(JUnitParamsRunner.class)
@ContextConfiguration(classes = { TestWebConfiguration.class })
@WebAppConfiguration
public class CountryControllerTest extends AbstractControllerTest implements CountryController {

	@Test
	@Override
	@Parameters(source = CountryControllerProvider.HandleProvider.class)
	public String handle(ModelMap modelMap) throws Exception {

		
		return null;
	}

	@Test
	@Override
	@Parameters(source = CountryControllerProvider.StoreProvider.class)
	public Country storeCountry(String entity, ModelMap modelMap) throws Exception {
		return null;
	}

	@Test
	@Override
	@Parameters(source = CountryControllerProvider.FindProvider.class)
	public Country findCountry(Long id, ModelMap modelMap) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Test
	@Override
	@Parameters(source = CountryControllerProvider.UpdateProvider.class)
	public Country updateCountry(Long id, ModelMap modelMap) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Test
	@Override
	@Parameters(source = CountryControllerProvider.DeactivateProvider.class)
	public Country deactivateCountry(Long id, ModelMap modelMap) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Test
	@Override
	@Parameters(source = CountryControllerProvider.ActivateProvider.class)
	public Country activateCountry(Long id, ModelMap modelMap) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}