package com.issuetrackerapi.data.entity;

import java.sql.Date;

public class IssueSkeleton {
	
	private boolean resolved;
	private String issue;
	private Date dateCreated;
	private Date dateDue;
	private String assignedTo;
	private String reporter;
	private String status;
	private String severity;
	private long id;
	
	public IssueSkeleton() {
		
	}

	public IssueSkeleton(boolean resolved, String issue, Date dateCreated, Date dateDue, String assignedTo,
			String reporter, String status, String severity, long id) {
		super();
		this.resolved = resolved;
		this.issue = issue;
		this.dateCreated = dateCreated;
		this.dateDue = dateDue;
		this.assignedTo = assignedTo;
		this.reporter = reporter;
		this.status = status;
		this.severity = severity;
		this.id = id;
	}

	public boolean isResolved() {
		return resolved;
	}

	public void setResolved(boolean resolved) {
		this.resolved = resolved;
	}

	public String getIssue() {
		return issue;
	}

	public void setIssue(String issue) {
		this.issue = issue;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public Date getDateDue() {
		return dateDue;
	}

	public void setDateDue(Date dateDue) {
		this.dateDue = dateDue;
	}

	public String getAssignedTo() {
		return assignedTo;
	}

	public void setAssignedTo(String assignedTo) {
		this.assignedTo = assignedTo;
	}

	public String getReporter() {
		return reporter;
	}

	public void setReporter(String reporter) {
		this.reporter = reporter;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getSeverity() {
		return severity;
	}

	public void setSeverity(String severity) {
		this.severity = severity;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
}
