package com.software.technology.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.software.technology.model.Message;
import com.software.technology.repositories.MessageRepository;


@Controller
public class messageController {

	
	@Autowired
	private MessageRepository messageRepository ;


	  @RequestMapping(value= "/contact", method = RequestMethod.GET)
	  public String newMessage(ModelMap model) {
		 Message message = new Message();
		 model.addAttribute("message", message);
	      return  ("contact");
        }
	 
	  @RequestMapping(value="/homepage",method=RequestMethod.POST)
	  public String saveMessage(@ModelAttribute("message") Message message, BindingResult result, ModelMap model)
	  {
	  
		  if (result.hasErrors()) {
			
				return "contact";
			}
		
		  messageRepository.save(message);
		  model.addAttribute("success", "Message " + message.getName() + " "+ message.getEmail() + " "+ message.getComment()+ " registered successfully");
			//return "success";
			return "contact";
			
		
	  }
	  
	
	  
	
	 
}