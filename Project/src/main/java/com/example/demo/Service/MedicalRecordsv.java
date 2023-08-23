package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.MedicalRecord;
import com.example.demo.Repository.MedicalRecordRepo;

@Service
public class MedicalRecordsv {

	@Autowired
	MedicalRecordRepo mrr;
	
	public MedicalRecord saveinfo2(MedicalRecord mr)
	{
		return mrr.save(mr);
	}
	public List<MedicalRecord> savemoreinfo2(List<MedicalRecord>mr)
	{
		return (List<MedicalRecord>)mrr.saveAll(mr);
	}
	public List<MedicalRecord> showinfo2()
	{
		return mrr.findAll();
	}
	public Optional<MedicalRecord> showone2(int id)
	{
		return mrr.findById(id);
	}
	
	public MedicalRecord updateinfo2(MedicalRecord mr)
	{
		return mrr.saveAndFlush(mr);
	}
	public String deleteinfo2(int id)
	{
		mrr.deleteById(id);
		return "Succefully deleted";
	}
}
