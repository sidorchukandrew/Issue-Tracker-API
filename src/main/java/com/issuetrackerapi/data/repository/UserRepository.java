package com.issuetrackerapi.data.repository;

import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.issuetrackerapi.data.entity.IssueProjection;
import com.issuetrackerapi.data.entity.User;

public interface UserRepository extends CrudRepository<User, Integer> {

}
