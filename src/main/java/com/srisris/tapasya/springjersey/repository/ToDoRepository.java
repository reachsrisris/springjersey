package com.srisris.tapasya.springjersey.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.srisris.tapasya.springjersey.ToDo;

public interface ToDoRepository extends CrudRepository<ToDo, String> {
	
	public ToDo findBySummary(String summary);
	
	public List<ToDo> findByDateCreated(String dateCreated);

}
