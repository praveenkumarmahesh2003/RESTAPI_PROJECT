package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Appointment;

import com.example.demo.Service.Appointmentsv;

@RestController
public class Appointmentcontroller {

	@Autowired
	Appointmentsv as;
	
	@PostMapping("postdetails")
	public Appointment add(@RequestBody Appointment a)
	{
		return as.saveinfo(a);
	}
	@PostMapping("postmoredetails")
	public List<Appointment> addmore(@RequestBody List<Appointment>a)
	{
		return as.savemoreinfo(a);
	}
	@GetMapping("showdetails")
	public List<Appointment>show()
	{
		return as.showinfo();
	}
	@GetMapping("showdetails/{id}")
	public Optional<Appointment> showemp(@PathVariable int id) {
		return as.showone(id);
	}
	
	@GetMapping("showdetail")
	public Optional<Appointment> showEmp(@RequestParam int id) {
		return as.showone(id);
	}
	@PutMapping("updatedetail")
	public Appointment update(@RequestBody Appointment a)
	{
		return as.updateinfo(a);
	}
	
	@DeleteMapping("deletedetails")
	public String delete(@RequestParam int id)
	{
		return as.deleteinfo(id);
	}
}
