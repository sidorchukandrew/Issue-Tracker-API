package com.issuetrackerapi.data.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.issuetrackerapi.data.entity.Issue;
import com.issuetrackerapi.data.entity.IssueProjection;

public interface IssueRepository extends CrudRepository<Issue, Long>{
	
	@Query(value = "SELECT iss.issue as issue, iss.status as status, iss.resolved as resolved, iss.dateCreated as dateCreated, iss.dateDue as dateDue, iss.assignedTo as assignedTo, "
			+ "iss.reporter as reporter, iss.severity as severity, iss.id as id FROM Issue iss")
	public Iterable<IssueProjection> getIssues();
	
	@Query(value = "SELECT iss.issue as issue, iss.status as status, iss.resolved as resolved, iss.dateCreated as dateCreated, iss.dateDue as dateDue, iss.assignedTo as assignedTo, "
			+ "iss.reporter as reporter, iss.severity as severity, iss.id as id FROM Issue iss WHERE iss.assignedTo.name = :queryName" )
	public Iterable<IssueProjection> getIssuesAssignedToUser(@Param("queryName")String name);
	
	@Query(value = "SELECT iss.issue as issue, iss.status as status, iss.resolved as resolved, iss.dateCreated as dateCreated, iss.dateDue as dateDue, iss.assignedTo as assignedTo, "
			+ "iss.reporter as reporter, iss.severity as severity, iss.id as id FROM Issue iss WHERE iss.id = :queryId" )
	public Optional<IssueProjection> getById(@Param("queryId") long id);
}

