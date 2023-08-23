package com.example.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Billing {

	@Id
	private int Billing_ID;
	private int Patient_ID;
	private int MedicalRecord_ID;
	private int Doctor_ID;
	private int Amount;
	private String Billing_Date;
	private String Payment_Status;
	public Billing() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Billing(int billing_ID, int patient_ID, int medicalRecord_ID, int doctor_ID, int amount, String billing_Date,
			String payment_Status) {
		super();
		Billing_ID = billing_ID;
		Patient_ID = patient_ID;
		MedicalRecord_ID = medicalRecord_ID;
		Doctor_ID = doctor_ID;
		Amount = amount;
		Billing_Date = billing_Date;
		Payment_Status = payment_Status;
	}
	public int getBilling_ID() {
		return Billing_ID;
	}
	public void setBilling_ID(int billing_ID) {
		Billing_ID = billing_ID;
	}
	public int getPatient_ID() {
		return Patient_ID;
	}
	public void setPatient_ID(int patient_ID) {
		Patient_ID = patient_ID;
	}
	public int getMedicalRecord_ID() {
		return MedicalRecord_ID;
	}
	public void setMedicalRecord_ID(int medicalRecord_ID) {
		MedicalRecord_ID = medicalRecord_ID;
	}
	public int getDoctor_ID() {
		return Doctor_ID;
	}
	public void setDoctor_ID(int doctor_ID) {
		Doctor_ID = doctor_ID;
	}
	public int getAmount() {
		return Amount;
	}
	public void setAmount(int amount) {
		Amount = amount;
	}
	public String getBilling_Date() {
		return Billing_Date;
	}
	public void setBilling_Date(String billing_Date) {
		Billing_Date = billing_Date;
	}
	public String getPayment_Status() {
		return Payment_Status;
	}
	public void setPayment_Status(String payment_Status) {
		Payment_Status = payment_Status;
	} 
	
}
