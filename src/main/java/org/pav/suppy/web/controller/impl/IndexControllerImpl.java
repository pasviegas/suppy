package org.pav.suppy.web.controller.impl;



import org.pav.suppy.web.controller.IndexController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class IndexControllerImpl implements IndexController {
	
    @RequestMapping(value="/", method=RequestMethod.GET)
    public String handle(ModelMap modelMap){
        return "index";
    }
    
}
