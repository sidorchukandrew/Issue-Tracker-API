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
	public long getId();	
}