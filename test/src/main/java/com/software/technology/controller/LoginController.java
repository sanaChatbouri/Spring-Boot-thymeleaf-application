package com.software.technology.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.software.technology.services.AppelService;
import com.software.technology.services.UserServiceImp;
import com.software.technology.model.Message;
import com.software.technology.model.User;
import com.software.technology.repositories.ActualiteRepository;
import com.software.technology.repositories.AppelRepository;
import com.software.technology.repositories.MessageRepository;
import com.software.technology.repositories.UserRepository;


@Controller
public class LoginController {

	@Autowired
	UserServiceImp userServiceImp ;
	
	@Autowired
	private AppelRepository appelRepository ;
	
	@Autowired
	MessageRepository messageRepository;
	
	@Autowired
	private  AppelService  appelService;
	
	@Autowired
	private  ActualiteRepository  actualiteRepository;
	
	
    @RequestMapping(value="/login", method = RequestMethod.GET)
    public String showLoginPage(ModelMap model){
    	 User user = new User();
		 model.addAttribute("user", user);
        return "login";
    }

    
    @RequestMapping(value="index", method=RequestMethod.POST)
    public String access(@ModelAttribute("user") User user, ModelMap model)
	  {
    	Long id=(long) 1;
    	User u= userServiceImp.finduserById(id);
    	if(user.getName().equals(u.getName()) && user.getPassword().equals(u.getPassword()))
    		
    
    			{ 
    		 model.addAttribute("list", appelRepository.findAll());
   		  model.addAttribute("msgs", messageRepository.findAll());
   		  model.put("nbreAppel", appelService.countAppel() );
   		  model.put("nbreMessage", messageRepository.count() );
   		model.put("nbreActualite", actualiteRepository.count() );
    		return "index"; 
    			}
    	
    	else
    	{
    		model.put("message", "wrong username or password");
    	return "login";
    	}
	}
   
}
