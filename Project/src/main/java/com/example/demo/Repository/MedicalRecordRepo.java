package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.MedicalRecord;

public interface MedicalRecordRepo extends JpaRepository<MedicalRecord, Integer>{

}
