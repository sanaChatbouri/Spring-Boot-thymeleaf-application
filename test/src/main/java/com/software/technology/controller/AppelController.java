package com.software.technology.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.software.technology.model.Appel;
import com.software.technology.repositories.AppelRepository;

@Controller
public class AppelController {
	@Autowired
	private AppelRepository appelRepository ;

	 @RequestMapping(value= "/appel", method = RequestMethod.GET)
	  public String newAppel(ModelMap model) {
		 Appel appel = new Appel();
		 model.addAttribute("appel", appel);
	      return  ("appel");
      }
	 
	 
	  @RequestMapping(value="/appel",method=RequestMethod.POST)
	  public String saveAppel(@ModelAttribute("appel") Appel appel, BindingResult result, ModelMap model)
	  {
	  
		  if (result.hasErrors()) {
				return "appel";
			}
		
		  appelRepository.save(appel);
		  model.addAttribute("success", "Appel " + appel.getName() + " "+ appel.getEmail() + " "+ appel.getSite() + " "+appel.getServiceCode() + " "+appel.getDescription()+ " registered successfully");
			//return "success";
			return "homepage";
	  }
	  
	  
	  

		
}

