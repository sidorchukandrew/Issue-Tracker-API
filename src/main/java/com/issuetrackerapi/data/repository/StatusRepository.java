package com.issuetrackerapi.data.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.issuetrackerapi.data.entity.Status;

public interface StatusRepository extends CrudRepository<Status, Integer> {

	@Query(value = "SELECT status FROM Status status WHERE status.name = :type")
	public Status findByName(@Param("type") String name);
} 
