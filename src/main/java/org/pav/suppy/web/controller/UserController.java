package org.pav.suppy.web.controller;



import org.pav.suppy.entity.basic.impl.User;
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
public class UserController {
    
	@RequestMapping(value="/user", method=RequestMethod.GET)
    public String handle(ModelMap model){
        return "user";
    }
	
    @RequestMapping(value="/user/store", produces=MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE, method= RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public @ResponseBody User storeUser(@RequestBody String entity){
        return null;
    }
    
    @RequestMapping(value="/user/find/{id}", produces=MediaType.APPLICATION_JSON_VALUE, method= RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public @ResponseBody User findUser(@PathVariable Long id){
        return null;
    }
    
    @RequestMapping(value="/user/update/{id}", produces=MediaType.APPLICATION_JSON_VALUE, method= RequestMethod.PUT)
    public @ResponseBody User updateUser(@PathVariable Long id){
    	return null;
    }
    
    @RequestMapping(value="/user/deactivate/{id}", produces=MediaType.APPLICATION_JSON_VALUE, method= RequestMethod.DELETE)
    public User deactivateUser(@PathVariable Long id){
    	return null;
    }

    @RequestMapping(value="/user/activate/{id}", produces=MediaType.APPLICATION_JSON_VALUE, method= RequestMethod.PUT)
    public User activateUser(@PathVariable Long id){
    	return null;
    }
}
