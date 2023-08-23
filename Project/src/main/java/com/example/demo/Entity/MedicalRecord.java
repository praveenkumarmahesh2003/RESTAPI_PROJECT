package com.example.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="medicalrecordtable")
public class MedicalRecord {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int medicalrecId;
	private int patientId;
	private int doctorId;
	private String dateofvisit;
	private String diagnosis;
	private String prescribedMedications;
	public MedicalRecord() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MedicalRecord(int medicalrecId, int patientId, int doctorId, String dateofvisit, String diagnosis,
			String prescribedMedications) {
		super();
		this.medicalrecId = medicalrecId;
		this.patientId = patientId;
		this.doctorId = doctorId;
		this.dateofvisit = dateofvisit;
		this.diagnosis = diagnosis;
		this.prescribedMedications = prescribedMedications;
	}
	public int getMedicalrecId() {
		return medicalrecId;
	}
	public void setMedicalrecId(int medicalrecId) {
		this.medicalrecId = medicalrecId;
	}
	public int getPatientId() {
		return patientId;
	}
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	public int getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}
	public String getDateofvisit() {
		return dateofvisit;
	}
	public void setDateofvisit(String dateofvisit) {
		this.dateofvisit = dateofvisit;
	}
	public String getDiagnosis() {
		return diagnosis;
	}
	public void setDiagnosis(String diagnosis) {
		this.diagnosis = diagnosis;
	}
	public String getPrescribedMedications() {
		return prescribedMedications;
	}
	public void setPrescribedMedications(String prescribedMedications) {
		this.prescribedMedications = prescribedMedications;
	}
	
	
}
