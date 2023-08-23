package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.Prescription;

public interface PrescriptionRepo extends JpaRepository<Prescription, Integer>{

}
