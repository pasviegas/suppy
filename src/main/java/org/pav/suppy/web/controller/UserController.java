package org.pav.suppy.web.controller;

import org.pav.suppy.entity.basic.impl.User;
import org.springframework.ui.ModelMap;

public interface UserController {
    
    String handle(ModelMap modelMap) throws Exception;
	
    User storeUser(String entity, ModelMap modelMap) throws Exception;
    
    User findUser(Long id, ModelMap modelMap) throws Exception;
    
    User updateUser(Long id, ModelMap modelMap) throws Exception;
    
    User deactivateUser(Long id, ModelMap modelMap) throws Exception;

    User activateUser(Long id, ModelMap modelMap) throws Exception;
}
