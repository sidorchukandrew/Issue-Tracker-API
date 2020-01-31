package com.issuetrackerapi.business.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.issuetrackerapi.data.entity.Status;
import com.issuetrackerapi.data.repository.StatusRepository;


@Service
public class StatusService {
	
	@Autowired
	private StatusRepository statusRepository;
	
	
	public Iterable<Status> getStatuses() {
		return statusRepository.findAll();
	}
}

