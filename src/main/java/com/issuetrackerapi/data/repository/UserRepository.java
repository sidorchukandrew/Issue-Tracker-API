package com.issuetrackerapi.data.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.issuetrackerapi.data.entity.Severity;
import com.issuetrackerapi.data.entity.User;
import com.issuetrackerapi.data.entity.UserProjection;

public interface UserRepository extends CrudRepository<User, Integer> {

	@Query(value = "SELECT user.name as name FROM User user")
	public Iterable<UserProjection> getAllNames();
	
	@Query(value = "SELECT user FROM User user WHERE user.name = :type")
	public User findByName(@Param("type") String name);
	
	@Query(value = "SELECT user.name as name FROM User user WHERE user.username = :username")
	public UserProjection findByUsername(@Param("username") String username);
}
