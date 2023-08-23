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

import com.example.demo.Entity.MedicalRecord;
import com.example.demo.Service.MedicalRecordsv;

@RestController
public class MedicalRecordcontroller {

	@Autowired
	MedicalRecordsv mv;
	
	@PostMapping("postdetails2")
	public MedicalRecord add2(@RequestBody MedicalRecord mr)
	{
		return mv.saveinfo2(mr);
	}
	
	@PostMapping("postmoredetails2")
	
	public List<MedicalRecord> addmore2(@RequestBody List<MedicalRecord> mr)
	{
		return mv.savemoreinfo2(mr);
	}
	
	@GetMapping("showdetails2")
	public List<MedicalRecord>show2()
	{
		return mv.showinfo2();
	}
	@GetMapping("showdetails2/{id}")
	public Optional<MedicalRecord> showemp2(@PathVariable int id)
	{
		return mv.showone2(id);
	}
	@PutMapping("updatedetail2")
	public MedicalRecord update1(@RequestBody MedicalRecord p)
	{
		return mv.updateinfo2(p);
	}
	
	@DeleteMapping("deletedetails2")
	public String delete1(@RequestParam int id)
	{
		return mv.deleteinfo2(id);
	}
}
