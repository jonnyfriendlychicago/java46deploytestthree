package com.jonfriend.java46deploytestthree.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jonfriend.java46deploytestthree.models.LicenseMdl;

@Repository
public interface LicenseRpo extends CrudRepository<LicenseMdl, Long> {
	List<LicenseMdl> findAll(); 
}
