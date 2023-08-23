package com.example.demo.Entity;

import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="appointmenttable")
public class Appointment {

	@Id
//	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int appointment_ID;
	private int patient_ID;
	private int doctor_ID;
	private String appointment_Date;
	private String purposeOfAppointment;
	private String status;
	public Appointment() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Appointment(int appointment_ID, int patient_ID, int doctor_ID, String appointment_Date,
			String purposeOfAppointment, String status) {
		super();
		this.appointment_ID = appointment_ID;
		this.patient_ID = patient_ID;
		this.doctor_ID = doctor_ID;
		this.appointment_Date = appointment_Date;
		this.purposeOfAppointment = purposeOfAppointment;
		this.status = status;
	}
	public int getAppointment_ID() {
		return appointment_ID;
	}
	public void setAppointment_ID(int appointment_ID) {
		this.appointment_ID = appointment_ID;
	}
	public int getPatient_ID() {
		return patient_ID;
	}
	public void setPatient_ID(int patient_ID) {
		this.patient_ID = patient_ID;
	}
	public int getDoctor_ID() {
		return doctor_ID;
	}
	public void setDoctor_ID(int doctor_ID) {
		this.doctor_ID = doctor_ID;
	}
	public String getAppointment_Date() {
		return appointment_Date;
	}
	public void setAppointment_Date(String appointment_Date) {
		this.appointment_Date = appointment_Date;
	}
	public String getPurposeOfAppointment() {
		return purposeOfAppointment;
	}
	public void setPurposeOfAppointment(String purposeOfAppointment) {
		this.purposeOfAppointment = purposeOfAppointment;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
}
