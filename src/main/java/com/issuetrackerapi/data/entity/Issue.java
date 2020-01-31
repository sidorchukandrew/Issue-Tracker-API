package com.issuetrackerapi.data.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "issues")
public class Issue {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "id")
	private long id;
	
	@Column(name = "issue")
	private String issue;
	
	@Column(name = "resolved")
	private boolean resolved;
	
	@Column(name = "date_created")
	private java.sql.Date dateCreated;
	
	@ManyToOne
//	@Column(name = "reporter_id")
	private User reporter;
	
	@Column(name = "date_due")
	private java.sql.Date dateDue;
	
	@ManyToOne
//	@Column(name = "status")
	@JoinColumn(name = "status")
	private Status status;
	
	@ManyToOne
//	@Column(name = "severity")
	@JoinColumn(name = "severity")
	private Severity severity;
	
	@ManyToOne
//	@Column(name = "assigned_to")
	@JoinColumn(name = "assigned_to")
	private User assignedTo;
	
	public Issue(long id, String issue, boolean resolved, Date dateCreated, User reporter, Date dateDue, Status status,
			Severity severity, User assignedTo) {
		super();
		this.id = id;
		this.issue = issue;
		this.resolved = resolved;
		this.dateCreated = dateCreated;
		this.reporter = reporter;
		this.dateDue = dateDue;
		this.status = status;
		this.severity = severity;
		this.assignedTo = assignedTo;
	}

	public Issue() { }

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getIssue() {
		return issue;
	}

	public void setIssue(String issue) {
		this.issue = issue;
	}

	public boolean isResolved() {
		return resolved;
	}

	public void setResolved(boolean resolved) {
		this.resolved = resolved;
	}

	public java.sql.Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(java.sql.Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public User getReporter() {
		return reporter;
	}

	public void setReporter(User reporter) {
		this.reporter = reporter;
	}

	public java.sql.Date getDateDue() {
		return dateDue;
	}

	public void setDateDue(java.sql.Date dateDue) {
		this.dateDue = dateDue;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Severity getSeverity() {
		return severity;
	}

	public void setSeverity(Severity severity) {
		this.severity = severity;
	}

	public User getAssignedTo() {
		return assignedTo;
	}

	public void setAssignedTo(User assignedTo) {
		this.assignedTo = assignedTo;
	}


	
}
