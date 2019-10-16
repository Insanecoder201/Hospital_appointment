package com.insanecoder.hospitalappointment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insanecoder.hospitalappointment.models.AppointmentDetails;
import com.insanecoder.hospitalappointment.models.UserCredentials;
import com.insanecoder.hospitalappointment.models.UserInfo;
import com.insanecoder.hospitalappointment.repository.HospitalRepository;

@Service
public class HospitalService {

	@Autowired
	private HospitalRepository repository;
	
	public Long getUserCount(String email, String password) {
		return repository.getUserCount(email, password);
	}
	
	public void insertAppointmentDetails(AppointmentDetails details) {
		repository.insertAppointmentDetails(details);
	}
	
	public void insertUserInfo(UserCredentials credentials, UserInfo info) {
		
		repository.insertUserInfo(credentials, info);
	}
	
}
