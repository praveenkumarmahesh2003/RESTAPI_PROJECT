package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.LabTest;

public interface LabTestRepo extends JpaRepository<LabTest, Integer>{

}
