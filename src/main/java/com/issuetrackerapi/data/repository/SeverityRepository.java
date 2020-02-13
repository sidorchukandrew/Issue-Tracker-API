package com.issuetrackerapi.data.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.issuetrackerapi.data.entity.Severity;
import com.issuetrackerapi.data.entity.Status;

public interface SeverityRepository extends CrudRepository<Severity, Integer>{
	@Query(value = "SELECT severity FROM Severity severity WHERE severity.name = :type")
	public Severity findByName(@Param("type") String name);
}
