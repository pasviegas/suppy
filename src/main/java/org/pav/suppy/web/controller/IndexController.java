/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pav.suppy.web.controller;



import java.util.Collections;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 *
 * @author kuntzer
 */
@Controller
public class IndexController {
    
    
    @RequestMapping(value="/", method=RequestMethod.GET)
    public String handleHome(ModelMap model){
        return "index";
    }
    
    @RequestMapping(value="/index/singleRow", produces=MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE, method= RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public @ResponseBody String salvarSingleRowEntity(@RequestBody String entity){
        return entity;
    }
    
    @RequestMapping(value="/index/grid", produces=MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE, method= RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public @ResponseBody String salvarGridEntity(@RequestBody String entity){
        return entity;
    }
    
    @RequestMapping(value="/index/grid/{id}", produces=MediaType.APPLICATION_JSON_VALUE, method= RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.OK)
    public void excluirGridEntity(@PathVariable Long id){
        
    }
    
    @RequestMapping(value="/index/grid/suggest", produces=MediaType.APPLICATION_JSON_VALUE, method= RequestMethod.GET)
    public @ResponseBody List<String> obterSuggestGridEntity(@RequestParam("term") String query){
        return Collections.emptyList();  
    }
    
    @RequestMapping(value="/index/grid/all", produces=MediaType.APPLICATION_JSON_VALUE, method= RequestMethod.GET)
    public @ResponseBody List<String> obterTodosGridEntity(){
    	return Collections.emptyList();
    }
}
