package org.pav.suppy.web.controller;



import org.pav.suppy.entity.basic.impl.Currency;
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
public class CurrencyController {
	
	@RequestMapping(value="/currency", method=RequestMethod.GET)
    public String handle(ModelMap model){
        return "currency";
    }
	
    @RequestMapping(value="/currency/store", produces=MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE, method= RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public @ResponseBody Currency storeCurrency(@RequestBody String entity){
        return null;
    }
    
    @RequestMapping(value="/currency/find/{id}", produces=MediaType.APPLICATION_JSON_VALUE, method= RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public @ResponseBody Currency findCurrency(@PathVariable Long id){
        return null;
    }
    
    @RequestMapping(value="/currency/update/{id}", produces=MediaType.APPLICATION_JSON_VALUE, method= RequestMethod.PUT)
    public @ResponseBody Currency updateCurrency(@PathVariable Long id){
    	return null;
    }
    
    @RequestMapping(value="/currency/deactivate/{id}", produces=MediaType.APPLICATION_JSON_VALUE, method= RequestMethod.DELETE)
    public Currency deactivateCurrency(@PathVariable Long id){
    	return null;
    }

    @RequestMapping(value="/currency/activate/{id}", produces=MediaType.APPLICATION_JSON_VALUE, method= RequestMethod.PUT)
    public Currency activateCurrency(@PathVariable Long id){
    	return null;
    }
}
