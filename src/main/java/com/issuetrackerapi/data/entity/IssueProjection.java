package com.issuetrackerapi.data.entity;

import java.sql.Date;

public interface IssueProjection {
	
	public boolean isResolved();
	public String getIssue();
	public Date getDateCreated();
	public Date getDateDue();
	public UserProjection getAssignedTo();
	public UserProjection getReporter();
	public StatusProjection getStatus();
	public SeverityProjection getSeverity();
	
//	public long getId() {
//		return id;
//	}
//	public void setId(long id) {
//		this.id = id;
//	}
//	public String getIssue() {
//		return issue;
//	}
//	public void setIssue(String issue) {
//		this.issue = issue;
//	}
//	public Date getDateCreated() {
//		return dateCreated;
//	}
//	public void setDateCreated(Date dateCreated) {
//		this.dateCreated = dateCreated;
//	}
//	public IssueProjection(long id, String issue, Date dateCreated) {
//		super();
//		this.id = id;
//		this.issue = issue;
//		this.dateCreated = dateCreated;
//	}
	
	
	
}