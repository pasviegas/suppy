package br.org.pav.suppy.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import br.org.pav.suppy.model.User;
import br.org.pav.suppy.repository.Users;



@Component
@RequestMapping(UserController.BASE_URL)
public class UserController {
	
	public static final String BASE_URL = "/user";
	
	@Autowired
	private Users users;
	
	@ResponseBody
	@RequestMapping(value="/{id}", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public User findOne(@PathVariable("id") String id) {		
		return users.findOne(id);
	}
	
	@ResponseBody
	@RequestMapping(value="/all", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public List<User> findAll() {		
		return users.findAll();
	}
	
	@ResponseBody
	@RequestMapping(method=RequestMethod.POST, produces=MediaType.APPLICATION_JSON_VALUE)
	public List<User> store(@RequestBody User user) {
		users.store(user);
		return users.findAll();
	}
	
}
