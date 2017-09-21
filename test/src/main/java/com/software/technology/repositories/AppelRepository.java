package com.software.technology.repositories;
import java.util.ArrayList;


import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.software.technology.model.Appel;

@Repository("appelRepository")
public interface AppelRepository extends JpaRepository<Appel, Long>  {
	
	ArrayList<Appel> findAll();

	
	
	
}
