package com.whs.instructor.smith.personmanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.whs.instructor.smith.personmanagementsystem.model.Person;
 
public interface PersonRepository extends JpaRepository<Person, Long>{
 
}
