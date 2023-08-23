package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Patient;
import com.example.demo.Repository.PatientRepo;

@Service
public class Patientsv {

	@Autowired
	PatientRepo pr;
	
	public Patient saveinfo1(Patient p)
	{
		return pr.save(p);
	}
	public List<Patient> savemoreinfo1(List<Patient> p)
	{
		return (List<Patient>)pr.saveAll(p);
	}
	public List<Patient> showinfo1()
	{
		return pr.findAll();
	}
	public Optional<Patient> showone1(int id) {
		return pr.findById(id);
	}
	
	public Patient updateinfo1(Patient p)
	{
		return pr.saveAndFlush(p);
	}
	
	public String deleteinfo1(int id) {
		pr.deleteById(id);
		return "Succesfully deleted :" + id;
	}
}
