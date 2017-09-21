package com.software.technology.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.software.technology.model.Appel;
import com.software.technology.model.Message;
import com.software.technology.repositories.AppelRepository;

@Controller
public class EditController {

	@Autowired
	private AppelRepository appelRepository ;
	
	
	 @RequestMapping(value= "/edit", method = RequestMethod.GET)
	  public String newEdit(ModelMap model) {
		 Appel appel = new Appel();
		 model.addAttribute("appel", appel);
	
	      return  ("edit");
}
////////////save
	 

@RequestMapping(value="/update",method=RequestMethod.POST)
public String saveAppel(@ModelAttribute("appel") Appel appel)
{

	
appelRepository.save(appel);

	//return "success";
	return "redirect:/index";
}

}