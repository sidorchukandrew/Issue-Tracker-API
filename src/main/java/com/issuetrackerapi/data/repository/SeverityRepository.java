package com.issuetrackerapi.data.repository;

import org.springframework.data.repository.CrudRepository;

import com.issuetrackerapi.data.entity.Severity;

public interface SeverityRepository extends CrudRepository<Severity, Integer>{

}
