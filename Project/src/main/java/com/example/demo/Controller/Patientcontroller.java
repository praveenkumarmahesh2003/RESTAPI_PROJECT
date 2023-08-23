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

import com.example.demo.Entity.Patient;
import com.example.demo.Service.Patientsv;

@RestController
public class Patientcontroller {

	@Autowired
	Patientsv ps;
	
	@PostMapping("postdetails1")
	public Patient add1(@RequestBody Patient p)
	{
		return ps.saveinfo1(p);
	}
	@PostMapping("postmoredetails1")
	public List<Patient> addmore1(@RequestBody List<Patient>p)
	{
		return ps.savemoreinfo1(p);
	}
	@GetMapping("showdetails1")
	public List<Patient>show1()
	{
		return ps.showinfo1();
	}
	@GetMapping("showdetails1/{id}")
	public Optional<Patient> showemp1(@PathVariable int id) {
		return ps.showone1(id);
	}
	
	@GetMapping("showdetail1")
	public Optional<Patient> showEmp1(@RequestParam int id) {
		return ps.showone1(id);
	}
	@PutMapping("updatedetail1")
	public Patient update1(@RequestBody Patient p)
	{
		return ps.updateinfo1(p);
	}
	
	@DeleteMapping("deletedetails1")
	public String delete1(@RequestParam int id)
	{
		return ps.deleteinfo1(id);
	}
}
