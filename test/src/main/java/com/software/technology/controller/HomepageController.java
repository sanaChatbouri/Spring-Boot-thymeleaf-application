package com.software.technology.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.software.technology.repositories.ActualiteRepository;

@Controller
public class HomepageController {

	@Autowired
	private  ActualiteRepository  actualiteRepository;
	
	 @RequestMapping(value= "/homepage", method = RequestMethod.GET)
	  public String newhomepage(ModelMap model) {
		 model.addAttribute("act", actualiteRepository.findAll());
	      return  ("homepage");
       }
	
}
