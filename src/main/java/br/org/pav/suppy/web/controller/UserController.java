package br.org.pav.suppy.web.controller;

import br.org.pav.suppy.model.User;
import br.org.pav.suppy.repository.Users;
import com.codahale.metrics.annotation.Metered;
import com.codahale.metrics.annotation.Timed;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Component
@RequestMapping(UserController.BASE_URL)
public class UserController {

    public static final String BASE_URL = "/user";

    @Autowired
    private Users users;

    @Timed
    @Metered
    @ResponseBody
    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public User findOne(@PathVariable("id") String id) {
        return users.findOne(id);
    }

    @Timed
    @Metered
    @ResponseBody
    @RequestMapping(value = "/all", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<User> findAll() {
        return users.findAll();
    }

    @Timed
    @Metered
    @ResponseBody
    @RequestMapping(method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<User> store(@RequestBody User user) {
        users.store(user);
        return users.findAll();
    }

}
