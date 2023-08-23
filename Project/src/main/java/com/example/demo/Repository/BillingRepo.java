package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.Billing;

public interface BillingRepo extends JpaRepository<Billing, Integer>{

}
