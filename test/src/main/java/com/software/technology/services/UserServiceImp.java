package com.software.technology.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.software.technology.model.User;
import com.software.technology.repositories.UserRepository;

@Service("userService")
public class UserServiceImp implements userService {
	
	@Autowired
	UserRepository userRepository; 

	@Override
	public User finduserById(Long id) {
		// TODO Auto-generated method stub
		
	return	userRepository.findOne(id);
			
	}

}
