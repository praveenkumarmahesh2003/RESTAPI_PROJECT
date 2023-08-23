package com.example.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Prescription {

	@Id
	private int Prescription_ID;
	private int MedicalRecord_ID;
	private int Doctor_ID;
	private int Dosage_Instructions;
	public Prescription() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Prescription(int prescription_ID, int medicalRecord_ID, int doctor_ID, int dosage_Instructions) {
		super();
		Prescription_ID = prescription_ID;
		MedicalRecord_ID = medicalRecord_ID;
		Doctor_ID = doctor_ID;
		Dosage_Instructions = dosage_Instructions;
	}
	public int getPrescription_ID() {
		return Prescription_ID;
	}
	public void setPrescription_ID(int prescription_ID) {
		Prescription_ID = prescription_ID;
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
	public int getDosage_Instructions() {
		return Dosage_Instructions;
	}
	public void setDosage_Instructions(int dosage_Instructions) {
		Dosage_Instructions = dosage_Instructions;
	}
	
	
}
