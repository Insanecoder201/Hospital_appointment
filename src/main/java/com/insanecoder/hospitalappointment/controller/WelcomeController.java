package com.insanecoder.hospitalappointment.controller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.insanecoder.hospitalappointment.models.AppointmentDetails;
import com.insanecoder.hospitalappointment.models.UserCredentials;
import com.insanecoder.hospitalappointment.models.UserInfo;
import com.insanecoder.hospitalappointment.service.HospitalService;

@Controller
public class WelcomeController {

	
	@Autowired
	private HospitalService service;
	
	@RequestMapping(value="/welcome")
	public String register() {
		return "Registration";
	}
	
	@RequestMapping(value="/welcome", method=RequestMethod.POST)
	public String register(@RequestParam String name, @RequestParam String email, @RequestParam String phone, @RequestParam String genderselect, @RequestParam String dob, @RequestParam String createpass, @RequestParam String repeatpass) {
		
		if(createpass.equals(repeatpass)) {
			UserCredentials credentials = new UserCredentials();
			UserInfo info = new UserInfo();
			
			LocalDate date = LocalDate.parse(dob);
			credentials.setEmail(email);
			credentials.setPassword(createpass);
			info.setEmail(email);
			info.setPassword(createpass);
			info.setDob(date);
			info.setGender(genderselect);
			info.setName(name);
			info.setPhone(phone);
			
			service.insertUserInfo(credentials, info);
			
		}
		
		
		return "redirect:/login";
	}
	
	@RequestMapping(value="/login")
	public String login() {
		return "Login";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String login(RedirectAttributes attributes, @RequestParam String email, @RequestParam String password) {
		Long count = service.getUserCount(email, password);
		
		
		if(count > 0) {
			attributes.addFlashAttribute("count", "1");
			attributes.addFlashAttribute("email", email);
			return "redirect:/appointment";
		}
		return "Error";
	}
	
	@RequestMapping(value="/appointment")
	public String appointment(Model model) {
		if(model.containsAttribute("count")) {
			return "Appointment";
		}
		
		return "Error";
	}
	
	@RequestMapping(value="/appointment", method=RequestMethod.POST)
	public String appointment(Model model, @RequestParam String startdate, @RequestParam String time, @RequestParam String apptype, @RequestParam String comments) {
		
		
			AppointmentDetails details = new AppointmentDetails();
			details.setComments(comments);
			details.setFacility("EH");
			
			LocalDate date = LocalDate.parse(startdate);
			details.setStartdate(date);
			details.setTime(time);
			details.setType(apptype);
			service.insertAppointmentDetails(details);
	
		
		return "redirect:/login";
	}
	
}
