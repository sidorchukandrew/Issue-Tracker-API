package com.issuetrackerapi.business.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.issuetrackerapi.data.entity.Severity;
import com.issuetrackerapi.data.repository.SeverityRepository;

@Service
public class SeverityService {
	
	@Autowired
	private SeverityRepository severityRepository;
	
	public Iterable<Severity> getSeverities() {
		return severityRepository.findAll();
	}
}
