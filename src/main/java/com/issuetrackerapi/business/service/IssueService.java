package com.issuetrackerapi.business.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.issuetrackerapi.data.entity.Issue;
import com.issuetrackerapi.data.entity.IssueProjection;
import com.issuetrackerapi.data.entity.IssueSkeleton;
import com.issuetrackerapi.data.entity.Severity;
import com.issuetrackerapi.data.entity.Status;
import com.issuetrackerapi.data.entity.User;
import com.issuetrackerapi.data.repository.IssueRepository;
import com.issuetrackerapi.data.repository.SeverityRepository;
import com.issuetrackerapi.data.repository.StatusRepository;
import com.issuetrackerapi.data.repository.UserRepository;

@Service
public class IssueService {

	@Autowired
	private IssueRepository issueRepository;

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private StatusRepository statusRepository;

	@Autowired
	private SeverityRepository severityRepository;

	public Iterable<Issue> getAllIssues() {
		return issueRepository.findAll();
	}

	public Iterable<IssueProjection> getIssues() {
		return issueRepository.getIssues();
	}

	public Optional<IssueProjection> getIssueById(Long id) {
		return issueRepository.getById(id);
	}

	public void saveIssue(IssueSkeleton issueSkeleton) {

		Issue issueToSave = new Issue();

		if (issueSkeleton.getDateCreated() != null)
			issueToSave.setDateCreated(issueSkeleton.getDateCreated());
		if (issueSkeleton.getDateDue() != null)
			issueToSave.setDateDue(issueSkeleton.getDateDue());

		issueToSave.setResolved(issueSkeleton.isResolved());

		if (issueSkeleton.getStatus().endsWith("e"))
			issueSkeleton.setStatus(issueSkeleton.getStatus() + "d");
		else if (!issueSkeleton.getStatus().endsWith("ed"))
			issueSkeleton.setStatus(issueSkeleton.getStatus() + "ed");

		if (issueSkeleton.getStatus() != null) {
			Status status = statusRepository.findByName(issueSkeleton.getStatus());
			issueToSave.setStatus(status);
		}

		if (issueSkeleton.getSeverity() != null) {
			Severity severity = severityRepository.findByName(issueSkeleton.getSeverity());
			issueToSave.setSeverity(severity);
			System.out.println(severity.getId() + " : " + severity.getName());
		}

		if (issueSkeleton.getReporter() != null) {
			User reporter = userRepository.findByName(issueSkeleton.getReporter());
			issueToSave.setReporter(reporter);
		}

		if (issueSkeleton.getAssignedTo() != null) {
			User assignee = userRepository.findByName(issueSkeleton.getAssignedTo());
			issueToSave.setAssignedTo(assignee);
		}

		issueToSave.setIssue(issueSkeleton.getIssue());

		issueRepository.save(issueToSave);
	}

	public void updateIssue(IssueSkeleton issueSkeleton) {
		System.out.println("Entered here");
		Issue issueToSave = new Issue();

		if (issueSkeleton.getDateCreated() != null)
			issueToSave.setDateCreated(issueSkeleton.getDateCreated());
		if (issueSkeleton.getDateDue() != null)
			issueToSave.setDateDue(issueSkeleton.getDateDue());

		issueToSave.setResolved(issueSkeleton.isResolved());

		if (issueSkeleton.getStatus().endsWith("e"))
			issueSkeleton.setStatus(issueSkeleton.getStatus() + "d");
		else if (!issueSkeleton.getStatus().endsWith("ed"))
			issueSkeleton.setStatus(issueSkeleton.getStatus() + "ed");

		if (issueSkeleton.getStatus() != null) {
			Status status = statusRepository.findByName(issueSkeleton.getStatus());
			issueToSave.setStatus(status);
		}

		if (issueSkeleton.getSeverity() != null) {
			Severity severity = severityRepository.findByName(issueSkeleton.getSeverity());
			issueToSave.setSeverity(severity);
			System.out.println(severity.getId() + " : " + severity.getName());
		}

		if (issueSkeleton.getReporter() != null) {
			User reporter = userRepository.findByName(issueSkeleton.getReporter());
			issueToSave.setReporter(reporter);
		}

		if (issueSkeleton.getAssignedTo() != null) {
			User assignee = userRepository.findByName(issueSkeleton.getAssignedTo());
			issueToSave.setAssignedTo(assignee);
		}
		
		issueToSave.setId(issueSkeleton.getId());

		issueToSave.setIssue(issueSkeleton.getIssue());

		issueRepository.save(issueToSave);
	}
}
