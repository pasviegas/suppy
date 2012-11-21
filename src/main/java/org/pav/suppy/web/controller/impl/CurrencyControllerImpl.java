package org.pav.suppy.web.controller.impl;



import org.pav.suppy.entity.basic.impl.Currency;
import org.pav.suppy.web.controller.CurrencyController;
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
@RequestMapping("/currency")
public class CurrencyControllerImpl implements CurrencyController {
	
	@RequestMapping(value="/", method=RequestMethod.GET)
    public String handle(ModelMap modelMap){
        return "currency";
    }
	
    @RequestMapping(value="/store", produces=MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE, method= RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public @ResponseBody Currency storeCurrency(@RequestBody String entity, ModelMap modelMap){
        return null;
    }
    
    @RequestMapping(value="/find/{id}", produces=MediaType.APPLICATION_JSON_VALUE, method= RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public @ResponseBody Currency findCurrency(@PathVariable Long id, ModelMap modelMap){
        return null;
    }
    
    @RequestMapping(value="/update/{id}", produces=MediaType.APPLICATION_JSON_VALUE, method= RequestMethod.PUT)
    public @ResponseBody Currency updateCurrency(@PathVariable Long id, ModelMap modelMap){
    	return null;
    }
    
    @RequestMapping(value="/deactivate/{id}", produces=MediaType.APPLICATION_JSON_VALUE, method= RequestMethod.DELETE)
    public Currency deactivateCurrency(@PathVariable Long id, ModelMap modelMap){
    	return null;
    }

    @RequestMapping(value="/activate/{id}", produces=MediaType.APPLICATION_JSON_VALUE, method= RequestMethod.PUT)
    public Currency activateCurrency(@PathVariable Long id, ModelMap modelMap){
    	return null;
    }
}
