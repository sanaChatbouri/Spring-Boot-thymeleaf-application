package com.software.technology.repositories;
import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.software.technology.model.User;

public interface UserRepository extends JpaRepository<User, Long>  {
 
	User findByName(String name);
}
