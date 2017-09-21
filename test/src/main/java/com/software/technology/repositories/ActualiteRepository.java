package com.software.technology.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.software.technology.model.Actualite;

@Repository("actualiteRepository")
public interface ActualiteRepository extends JpaRepository<Actualite, Long>  {
	

}
