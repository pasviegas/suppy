package org.pav.suppy.web.controller;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.pav.suppy.entity.basic.impl.StockKeepingUnit;
import org.pav.suppy.test.configuration.TestWebConfiguration;
import org.pav.suppy.test.controller.AbstractControllerTest;
import org.pav.suppy.test.provider.controller.StockKeepingUnitControllerProvider;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.ui.ModelMap;

@RunWith(JUnitParamsRunner.class)
@ContextConfiguration(classes = { TestWebConfiguration.class })
@WebAppConfiguration
public class StockKeepingUnitControllerTest extends AbstractControllerTest implements StockKeepingUnitController {

	@Test
	@Override
	@Parameters(source = StockKeepingUnitControllerProvider.HandleProvider.class)
	public String handle(ModelMap modelMap) throws Exception {
		return null;
	}

	@Test
	@Override
	@Parameters(source = StockKeepingUnitControllerProvider.StoreProvider.class)
	public StockKeepingUnit storeStockKeepingUnit(String entity, ModelMap modelMap) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Test
	@Override
	@Parameters(source = StockKeepingUnitControllerProvider.FindProvider.class)
	public StockKeepingUnit findStockKeepingUnit(Long id, ModelMap modelMap) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Test
	@Override
	@Parameters(source = StockKeepingUnitControllerProvider.UpdateProvider.class)
	public StockKeepingUnit updateStockKeepingUnit(Long id, ModelMap modelMap) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Test
	@Override
	@Parameters(source = StockKeepingUnitControllerProvider.DeactivateProvider.class)
	public StockKeepingUnit deactivateStockKeepingUnit(Long id, ModelMap modelMap) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Test
	@Override
	@Parameters(source = StockKeepingUnitControllerProvider.ActivateProvider.class)
	public StockKeepingUnit activateStockKeepingUnit(Long id, ModelMap modelMap) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}