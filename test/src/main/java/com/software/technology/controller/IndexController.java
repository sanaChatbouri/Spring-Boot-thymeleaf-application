package com.software.technology.controller;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.software.technology.model.Appel;
import com.software.technology.model.Team;
import com.software.technology.repositories.ActualiteRepository;
import com.software.technology.repositories.AppelRepository;
import com.software.technology.repositories.MessageRepository;
import com.software.technology.repositories.TeamRepository;
import com.software.technology.services.AppelService;


@Controller
public class IndexController {
	@Autowired
	private AppelRepository appelRepository ;
	
	@Autowired
	MessageRepository messageRepository;
	
	@Autowired
	private  AppelService  appelService;
	

	@Autowired
	private  ActualiteRepository  actualiteRepository;
	
	@Autowired
	private TeamRepository teamRepository ;
	
	 @RequestMapping(value= "index", method = RequestMethod.GET)
	  public String newIndex(Model model, ModelMap mm) {
		 model.addAttribute("list", appelRepository.findAll());
  		  model.addAttribute("msgs", messageRepository.findAll());
  		 mm.put("nbreAppel", appelService.countAppel() );
  		 mm.put("nbreMessage", messageRepository.count() );
  		mm.put("nbreActualite", actualiteRepository.count() );
	      return  ("index");
       
	    }
//deleteeeeeeeeeeeeeeeeeeeee appel
	 @RequestMapping(value= "/appel/delete/{id}", method = RequestMethod.GET)
	  public String deleteapl(@PathVariable("id") Long id ) {
		 appelService.deleteAppel(id);
			      return  "redirect:/index";
      
	    }
	 
	//deleteeeeeeeeeeeeeeeeeeeeeeeeee msg 

	 @RequestMapping(value= "/message/delete/{id}", method = RequestMethod.GET)
	  public String deletemsg(@PathVariable("id") Long id ) {
		messageRepository.delete(id);
			      return  "redirect:/index";
      
	    }
	 
	 @RequestMapping(value= "/edit/{id}")
	 public String editapl(@PathVariable(value = "id") Long id, Model model) {
	 
	model.addAttribute("appel", appelService.findAppelById(id));
	 appelService.deleteAppel(id);
	   return  "edit";
	 }
	 
	 
	 
	  @RequestMapping(value="/team",method=RequestMethod.POST)
	  public String saveAppel(@ModelAttribute("team") Team team, BindingResult result, ModelMap model)
	  {
	  
		  if (result.hasErrors()) {
				return "appel";
			}
		
		  teamRepository.save(team);
		 
			//return "success";
			return "redirect:/index";
	  } 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 

}
