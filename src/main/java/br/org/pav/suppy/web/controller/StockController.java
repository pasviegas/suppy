package br.org.pav.suppy.web.controller;

import br.org.pav.suppy.model.Stock;
import br.org.pav.suppy.repository.Stocks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;


@Component
@RequestMapping(StockController.BASE_URL)
public class StockController {

    public static final String BASE_URL = "/stock";

    @Autowired
    private Stocks stocks;

    @ResponseBody
    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Stock findOne(@PathVariable("id") String id) {
        return stocks.findOne(id);
    }

    @ResponseBody
    @RequestMapping(method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Stock> store(@RequestBody Stock stock) {
        stocks.store(stock);
        return Arrays.asList(stocks.findOne(stock.getId()));
    }

}
