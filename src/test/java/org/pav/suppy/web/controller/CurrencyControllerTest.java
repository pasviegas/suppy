package org.pav.suppy.web.controller;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.pav.suppy.entity.basic.impl.Currency;
import org.pav.suppy.test.configuration.TestWebConfiguration;
import org.pav.suppy.test.controller.AbstractControllerTest;
import org.pav.suppy.test.provider.controller.CurrencyControllerProvider;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.ui.ModelMap;

@RunWith(JUnitParamsRunner.class)
@ContextConfiguration(classes = { TestWebConfiguration.class })
@WebAppConfiguration
public class CurrencyControllerTest extends AbstractControllerTest implements CurrencyController {

	@Test
	@Override
	@Parameters(source = CurrencyControllerProvider.HandleProvider.class)
	public String handle(ModelMap modelMap) throws Exception {
		
		return null;
	}

	@Test
	@Override
	@Parameters(source = CurrencyControllerProvider.StoreProvider.class)
	public Currency storeCurrency(String entity, ModelMap modelMap) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Test
	@Override
	@Parameters(source = CurrencyControllerProvider.FindProvider.class)
	public Currency findCurrency(Long id, ModelMap modelMap) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Test
	@Override
	@Parameters(source = CurrencyControllerProvider.UpdateProvider.class)
	public Currency updateCurrency(Long id, ModelMap modelMap) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Test
	@Override
	@Parameters(source = CurrencyControllerProvider.DeactivateProvider.class)
	public Currency deactivateCurrency(Long id, ModelMap modelMap) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Test
	@Override
	@Parameters(source = CurrencyControllerProvider.ActivateProvider.class)
	public Currency activateCurrency(Long id, ModelMap modelMap) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}