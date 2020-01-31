package com.issuetrackerapi.business.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.issuetrackerapi.business.service.IssueService;
//import com.issuetrackerapi.business.service.IssueService;
import com.issuetrackerapi.business.service.SeverityService;
import com.issuetrackerapi.business.service.StatusService;
import com.issuetrackerapi.business.service.UserService;
import com.issuetrackerapi.data.entity.Issue;
import com.issuetrackerapi.data.entity.IssueProjection;
import com.issuetrackerapi.data.entity.Severity;
import com.issuetrackerapi.data.entity.Status;
import com.issuetrackerapi.data.entity.User;

@Controller
@RequestMapping(path="/api")
@CrossOrigin(origins = "http://localhost:4200")
public class MainController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private IssueService issueService;
	
	@Autowired
	private StatusService statusService;
	
	@Autowired
	private SeverityService severityService;
	
	@GetMapping(path="/users")
	@ResponseBody
	public  Iterable<User> getAllUsers() {
		return userService.getAllUsers();
	}
	
	@GetMapping(path="/severities")
	@ResponseBody
	public Iterable<Severity> getAllSeverities() {
		return severityService.getSeverities();
	}
	
	@GetMapping(path="/statuses")
	@ResponseBody
	public Iterable<Status> getAllStatuses() {
		return statusService.getStatuses();
	}
	
	@GetMapping(path ="/issues")
	public @ResponseBody Iterable<Issue> getAllIssues() {
		return issueService.getAllIssues();
	}
	
	@GetMapping(path = "/issuetest")
	@ResponseBody
	public Iterable<IssueProjection> getIssues() {
		return issueService.getIssueTest();
	}

//	@GetMapping(path="/issue")
//	@ResponseBody
//	public Optional<Issue> getIssueById(@RequestParam String id) {
//		Long idAsNum = Long.parseLong(id);
//		return issueService.getIssueById(idAsNum);
//	}
//	
	
//	@PostMapping(path = "/newissue")
//	public void newIssue(@RequestBody Issue issue) {
//		issueService.createNewIssues(issue);
//	}
	
	
}
