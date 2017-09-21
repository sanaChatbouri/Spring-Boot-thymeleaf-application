package com.software.technology.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.software.technology.model.Appel;
import com.software.technology.repositories.AppelRepository;

@Service("appelService")
public class AppelService implements Appelsvs {

	@Autowired
	AppelRepository appelRepository;


	@Override
	public void deleteAppel(Long id) {
		// TODO Auto-generated method stub
		appelRepository.delete(id);
	}

	@Override
	public Appel findAppelById(Long id) {
		// TODO Auto-generated method stub
		return appelRepository.findOne(id);
		
	}

	@Override
	public Long countAppel() {
		// TODO Auto-generated method stub
		return appelRepository.count();
		
		
	}
	
	
	

}
