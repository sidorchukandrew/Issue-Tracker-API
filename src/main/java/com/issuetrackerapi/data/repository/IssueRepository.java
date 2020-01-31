package com.issuetrackerapi.data.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.issuetrackerapi.data.entity.Issue;
import com.issuetrackerapi.data.entity.IssueProjection;

public interface IssueRepository extends CrudRepository<Issue, Long>{
	
	@Query(value = "SELECT iss.issue as issue, iss.status as status, iss.resolved as resolved, iss.dateCreated as dateCreated, iss.dateDue as dateDue, iss.assignedTo as assignedTo, iss.reporter as reporter, iss.severity as severity FROM Issue iss")
	public Iterable<IssueProjection> getIssuesTest();
}

