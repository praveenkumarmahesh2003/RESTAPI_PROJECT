package com.example.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="patienttable")
public class Patient {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int patientId;
	private String patientname;
	private String dob;
	private String gender;
	private String address;
	private int contactno;
	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Patient(int patientId, String patientname, String dob, String gender, String address, int contactno) {
		super();
		this.patientId = patientId;
		this.patientname = patientname;
		this.dob = dob;
		this.gender = gender;
		this.address = address;
		this.contactno = contactno;
	}
	public int getPatientId() {
		return patientId;
	}
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	public String getPatientname() {
		return patientname;
	}
	public void setPatientname(String patientname) {
		this.patientname = patientname;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getContactno() {
		return contactno;
	}
	public void setContactno(int contactno) {
		this.contactno = contactno;
	}
	
	
}
