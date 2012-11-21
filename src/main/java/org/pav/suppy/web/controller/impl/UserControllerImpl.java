package org.pav.suppy.web.controller.impl;



import org.pav.suppy.entity.basic.impl.User;
import org.pav.suppy.web.controller.UserController;
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
@RequestMapping("/user")
public class UserControllerImpl implements UserController {
    
	@RequestMapping(value="/", method=RequestMethod.GET)
    public String handle(ModelMap modelMap){
        return "user";
    }
	
    @RequestMapping(value="/store", produces=MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE, method= RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public @ResponseBody User storeUser(@RequestBody String entity, ModelMap modelMap ){
        return null;
    }
    
    @RequestMapping(value="/find/{id}", produces=MediaType.APPLICATION_JSON_VALUE, method= RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public @ResponseBody User findUser(@PathVariable Long id, ModelMap modelMap){
        return null;
    }
    
    @RequestMapping(value="/update/{id}", produces=MediaType.APPLICATION_JSON_VALUE, method= RequestMethod.PUT)
    public @ResponseBody User updateUser(@PathVariable Long id, ModelMap modelMap){
    	return null;
    }
    
    @RequestMapping(value="/deactivate/{id}", produces=MediaType.APPLICATION_JSON_VALUE, method= RequestMethod.DELETE)
    public User deactivateUser(@PathVariable Long id, ModelMap modelMap){
    	return null;
    }

    @RequestMapping(value="/activate/{id}", produces=MediaType.APPLICATION_JSON_VALUE, method= RequestMethod.PUT)
    public User activateUser(@PathVariable Long id, ModelMap modelMap){
    	return null;
    }
}