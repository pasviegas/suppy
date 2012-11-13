package org.pav.suppy.web.controller;



import org.pav.suppy.entity.basic.impl.StockKeepingUnit;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
public class StockKeepingUnitController {
	
	@RequestMapping(value="/stockkeepingunit", method=RequestMethod.GET)
    public String handle(ModelMap model){
        return "stockkeepingunit";
    }
	
    @RequestMapping(value="/stockkeepingunit/store", produces=MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE, method= RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public @ResponseBody StockKeepingUnit storeStockKeepingUnit(@RequestBody String entity){
        return null;
    }
    
    @RequestMapping(value="/stockkeepingunit/find/{id}", produces=MediaType.APPLICATION_JSON_VALUE, method= RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public @ResponseBody StockKeepingUnit findStockKeepingUnit(@PathVariable Long id){
        return null;
    }
    
    @RequestMapping(value="/stockkeepingunit/update/{id}", produces=MediaType.APPLICATION_JSON_VALUE, method= RequestMethod.PUT)
    public @ResponseBody StockKeepingUnit updateStockKeepingUnit(@PathVariable Long id){
    	return null;
    }
    
    @RequestMapping(value="/stockkeepingunit/deactivate/{id}", produces=MediaType.APPLICATION_JSON_VALUE, method= RequestMethod.DELETE)
    public StockKeepingUnit deactivateStockKeepingUnit(@PathVariable Long id){
    	return null;
    }

    @RequestMapping(value="/stockkeepingunit/activate/{id}", produces=MediaType.APPLICATION_JSON_VALUE, method= RequestMethod.PUT)
    public StockKeepingUnit activateStockKeepingUnit(@PathVariable Long id){
    	return null;
    }
}
