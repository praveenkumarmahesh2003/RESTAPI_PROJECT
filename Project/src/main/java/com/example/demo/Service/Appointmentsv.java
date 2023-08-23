package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Appointment;
import com.example.demo.Repository.AppointmentRepo;

@Service
public class Appointmentsv {
	@Autowired
	AppointmentRepo ar;
	
	public Appointment saveinfo(Appointment a)
	{
		return ar.save(a);
	}
	public List<Appointment> savemoreinfo(List<Appointment> a)
	{
		return (List<Appointment>)ar.saveAll(a);
	}
	public List<Appointment> showinfo()
	{
		return ar.findAll();
	}
	public Optional<Appointment> showone(int id) {
		return ar.findById(id);
	}
	
	public Appointment updateinfo(Appointment a)
	{
		return ar.saveAndFlush(a);
	}
	
	public String deleteinfo(int id) {
		ar.deleteById(id);
		return "Succesfully deleted :" + id;
	}
}
