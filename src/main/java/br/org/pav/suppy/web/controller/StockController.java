package br.org.pav.suppy.web.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import br.org.pav.suppy.model.Stock;
import br.org.pav.suppy.repository.Stocks;



@Component
@RequestMapping(StockController.BASE_URL)
public class StockController {
	
	public static final String BASE_URL = "/stock";
	
	@Autowired
	private Stocks stocks;
	
	@ResponseBody
	@RequestMapping(value="/{id}", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public Stock findOne(@PathVariable("id") String id) {		
		return stocks.findOne(id);
	}
	
	@ResponseBody
	@RequestMapping(method=RequestMethod.POST, produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Stock> store(@RequestBody Stock stock) {
		stocks.store(stock);
		return Arrays.asList(stocks.findOne(stock.getId()));
	}
	
}
