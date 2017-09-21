package com.software.technology.repositories;
import java.util.ArrayList;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.software.technology.model.Message;

@Repository("messageRepository")
public interface MessageRepository  extends CrudRepository<Message, Long>{
	
	
ArrayList<Message> findAll();
}
