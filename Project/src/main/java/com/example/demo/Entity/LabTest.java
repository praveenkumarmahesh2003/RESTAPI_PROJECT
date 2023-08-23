package com.example.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class LabTest {

	@Id
	private int LabTest_ID;
	private int MedicalRecord_ID;
	private String TestName;
	private String TestDate;
	private String TestResult;
	public LabTest() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LabTest(int labTest_ID, int medicalRecord_ID, String testName, String testDate, String testResult) {
		super();
		LabTest_ID = labTest_ID;
		MedicalRecord_ID = medicalRecord_ID;
		TestName = testName;
		TestDate = testDate;
		TestResult = testResult;
	}
	public int getLabTest_ID() {
		return LabTest_ID;
	}
	public void setLabTest_ID(int labTest_ID) {
		LabTest_ID = labTest_ID;
	}
	public int getMedicalRecord_ID() {
		return MedicalRecord_ID;
	}
	public void setMedicalRecord_ID(int medicalRecord_ID) {
		MedicalRecord_ID = medicalRecord_ID;
	}
	public String getTestName() {
		return TestName;
	}
	public void setTestName(String testName) {
		TestName = testName;
	}
	public String getTestDate() {
		return TestDate;
	}
	public void setTestDate(String testDate) {
		TestDate = testDate;
	}
	public String getTestResult() {
		return TestResult;
	}
	public void setTestResult(String testResult) {
		TestResult = testResult;
	}
	
}
