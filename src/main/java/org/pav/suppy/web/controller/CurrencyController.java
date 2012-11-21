package org.pav.suppy.web.controller;

import org.pav.suppy.entity.basic.impl.Currency;
import org.springframework.ui.ModelMap;

public interface CurrencyController {

	String handle(ModelMap modelMap) throws Exception;

	Currency storeCurrency(String entity, ModelMap modelMap) throws Exception;

	Currency findCurrency(Long id, ModelMap modelMap) throws Exception;

	Currency updateCurrency(Long id, ModelMap modelMap) throws Exception;

	Currency deactivateCurrency(Long id, ModelMap modelMap) throws Exception;

	Currency activateCurrency(Long id, ModelMap modelMap) throws Exception;
}
