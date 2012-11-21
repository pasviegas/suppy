package org.pav.suppy.web.controller;

import org.pav.suppy.entity.basic.impl.StockKeepingUnit;
import org.springframework.ui.ModelMap;

public interface StockKeepingUnitController {

	String handle(ModelMap modelMap) throws Exception;

	StockKeepingUnit storeStockKeepingUnit(String entity, ModelMap modelMap) throws Exception;

	StockKeepingUnit findStockKeepingUnit(Long id, ModelMap modelMap) throws Exception;

	StockKeepingUnit updateStockKeepingUnit(Long id, ModelMap modelMap) throws Exception;

	StockKeepingUnit deactivateStockKeepingUnit(Long id, ModelMap modelMap) throws Exception;

	StockKeepingUnit activateStockKeepingUnit(Long id, ModelMap modelMap) throws Exception;
}
