package com.jonfriend.java46deploytestthree.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jonfriend.java46deploytestthree.models.PersonMdl;

@Repository
public interface PersonRpo extends CrudRepository<PersonMdl, Long>{
	List<PersonMdl> findAll(); 

	// end repo
}
