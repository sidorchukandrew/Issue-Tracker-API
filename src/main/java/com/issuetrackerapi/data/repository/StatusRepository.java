package com.issuetrackerapi.data.repository;

import org.springframework.data.repository.CrudRepository;

import com.issuetrackerapi.data.entity.Status;

public interface StatusRepository extends CrudRepository<Status, Integer> {

}
