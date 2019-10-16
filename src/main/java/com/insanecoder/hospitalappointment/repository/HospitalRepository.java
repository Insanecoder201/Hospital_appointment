package com.insanecoder.hospitalappointment.repository;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.insanecoder.hospitalappointment.models.AppointmentDetails;
import com.insanecoder.hospitalappointment.models.UserCredentials;
import com.insanecoder.hospitalappointment.models.UserInfo;



@Transactional
@Repository
public class HospitalRepository {

	
	@Autowired
	private EntityManager manager;
	
	public Long getUserCount(String email, String password) {
		TypedQuery<Long> query = manager.createQuery("select count(*) from UserCredentials where email = '"+email+"' and password='"+password+"'", Long.class);
		Long count = query.getSingleResult();
		
		return count;
	}
	
	public void insertAppointmentDetails(AppointmentDetails details) {
		manager.persist(details);
	}
	
	public void insertUserInfo(UserCredentials credentials, UserInfo info) {
		manager.persist(credentials);
		manager.persist(info);
	}
}


