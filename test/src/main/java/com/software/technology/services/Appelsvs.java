package com.software.technology.services;
import com.software.technology.model.Appel;

public interface Appelsvs{
	
	


	void deleteAppel(Long id);

	Appel findAppelById(Long id);
	
	Long countAppel();

}
	


