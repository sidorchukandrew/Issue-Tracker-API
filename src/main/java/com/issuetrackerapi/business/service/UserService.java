package com.issuetrackerapi.business.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.issuetrackerapi.data.entity.IssueProjection;
import com.issuetrackerapi.data.entity.User;
import com.issuetrackerapi.data.repository.IssueRepository;
import com.issuetrackerapi.data.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private IssueRepository issueRepository;
	
	public Iterable<User> getAllUsers() {
		return userRepository.findAll();
	}
}
