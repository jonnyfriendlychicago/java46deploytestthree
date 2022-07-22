package com.jonfriend.java46deploytestthree.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jonfriend.java46deploytestthree.models.DojoMdl;

@Repository
public interface DojoRpo extends CrudRepository<DojoMdl, Long>{
	List<DojoMdl> findAll(); 

	// end repo
}
