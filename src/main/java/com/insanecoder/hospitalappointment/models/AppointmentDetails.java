package com.insanecoder.hospitalappointment.models;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class AppointmentDetails {

	public AppointmentDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Id
	@GeneratedValue
	@Column(name="pk_seq")
	private long id;
	
	@Column(name="startdate")
	private LocalDate startdate;
	
	@Column(name="time")
	private String time;
	
	@Column(name="comments")
	private String comments;
	
	@Column(name="type")
	private String type;
	
	@Column(name="facility")
	private String facility;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public LocalDate getStartdate() {
		return startdate;
	}

	public void setStartdate(LocalDate startdate) {
		this.startdate = startdate;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getFacility() {
		return facility;
	}

	public void setFacility(String facility) {
		this.facility = facility;
	}

	@Override
	public String toString() {
		return "AppointmentDetails [id=" + id + ", name=" + "" + ", startdate=" + startdate + ", time=" + time
				+ ", comments=" + comments + ", type=" + type + ", facility=" + facility + "]";
	}
	
	
	
	
	
}
