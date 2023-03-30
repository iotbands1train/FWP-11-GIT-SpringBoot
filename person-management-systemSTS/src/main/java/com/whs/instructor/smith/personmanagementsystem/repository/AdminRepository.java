package com.whs.instructor.smith.personmanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.whs.instructor.smith.personmanagementsystem.model.Admin; 
 
public interface AdminRepository extends JpaRepository<Admin, Long>{
 
}
