package com.issuetrackerapi.business.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.issuetrackerapi.data.entity.Issue;
import com.issuetrackerapi.data.entity.IssueProjection;
import com.issuetrackerapi.data.repository.IssueRepository;

@Service
public class IssueService {

	@Autowired
	private IssueRepository issueRepository;
	
	public Iterable<Issue> getAllIssues() {
		return issueRepository.findAll();
	}
	
	public Iterable<IssueProjection> getIssueTest() {
		return issueRepository.getIssuesTest();
	}
	
//	public Optional<Issue> getIssueById(Long id) {
//		return issueRepository.findById(id);
//	}
//	
//	public void createNewIssues(Issue issue) {
//		issueRepository.save(issue);
//	}
}
