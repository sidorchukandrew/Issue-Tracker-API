package com.issuetrackerapi.business.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.issuetrackerapi.business.service.IssueService;
//import com.issuetrackerapi.business.service.IssueService;
import com.issuetrackerapi.business.service.SeverityService;
import com.issuetrackerapi.business.service.StatusService;
import com.issuetrackerapi.business.service.UserService;
import com.issuetrackerapi.data.entity.Issue;
import com.issuetrackerapi.data.entity.IssueProjection;
import com.issuetrackerapi.data.entity.IssueSkeleton;
import com.issuetrackerapi.data.entity.Severity;
import com.issuetrackerapi.data.entity.Status;
import com.issuetrackerapi.data.entity.UserProjection;

@Controller
@CrossOrigin(origins = "*")
@RequestMapping(path = "/api")
public class MainController {

	@Autowired
	private UserService userService;

	@Autowired
	private IssueService issueService;

	@Autowired
	private StatusService statusService;

	@Autowired
	private SeverityService severityService;

	@GetMapping(path = "/users")
	@ResponseBody
	public Iterable<UserProjection> getAllUsers() {
		return userService.getAllUsers();
	}

	@GetMapping(path = "/user", params="user")
	@ResponseBody
	public Iterable<IssueProjection> getIssuesAssignedToUser(@RequestParam(name = "user") String name) {
		return userService.getIssuesAssignedToUser(name);
	}
	
	@GetMapping(path = "/user", params="username")
	@ResponseBody
	public UserProjection getDetailsBasedOnUsername(@RequestParam(name = "username") String username) {
		return userService.getUserBasedOnUsername(username);
	}

	@GetMapping(path = "/severities")
	@ResponseBody
	public Iterable<Severity> getAllSeverities() {
		return severityService.getSeverities();
	}

	@GetMapping(path = "/statuses")
	@ResponseBody
	public Iterable<Status> getAllStatuses() {
		return statusService.getStatuses();
	}

	@GetMapping(path = "/issues")
	@ResponseBody
	public Iterable<IssueProjection> getIssues() {
		return issueService.getIssues();
	}

	@GetMapping(path = "/issue")
	@ResponseBody
	public Optional<IssueProjection> getIssueById(@RequestParam long id) {
		return issueService.getIssueById(id);
	}

	@PostMapping(path = "/issues")
	public String saveIssue(@RequestBody IssueSkeleton issue) {
		issueService.saveIssue(issue);
		return "OK";
	}

}
