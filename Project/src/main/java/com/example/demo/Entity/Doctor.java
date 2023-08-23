package com.example.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Doctor {

	@Id
	 private int Doctor_ID;
	 private String First_Name;
	 private String Last_Name;
	 private int Specialization;
	 private int ContactNo;
	 private int Medical_LicenseNo;
	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Doctor(int doctor_ID, String first_Name, String last_Name, int specialization, int contactNo,
			int medical_LicenseNo) {
		super();
		Doctor_ID = doctor_ID;
		First_Name = first_Name;
		Last_Name = last_Name;
		Specialization = specialization;
		ContactNo = contactNo;
		Medical_LicenseNo = medical_LicenseNo;
	}
	public int getDoctor_ID() {
		return Doctor_ID;
	}
	public void setDoctor_ID(int doctor_ID) {
		Doctor_ID = doctor_ID;
	}
	public String getFirst_Name() {
		return First_Name;
	}
	public void setFirst_Name(String first_Name) {
		First_Name = first_Name;
	}
	public String getLast_Name() {
		return Last_Name;
	}
	public void setLast_Name(String last_Name) {
		Last_Name = last_Name;
	}
	public int getSpecialization() {
		return Specialization;
	}
	public void setSpecialization(int specialization) {
		Specialization = specialization;
	}
	public int getContactNo() {
		return ContactNo;
	}
	public void setContactNo(int contactNo) {
		ContactNo = contactNo;
	}
	public int getMedical_LicenseNo() {
		return Medical_LicenseNo;
	}
	public void setMedical_LicenseNo(int medical_LicenseNo) {
		Medical_LicenseNo = medical_LicenseNo;
	}
	 
	 
}
