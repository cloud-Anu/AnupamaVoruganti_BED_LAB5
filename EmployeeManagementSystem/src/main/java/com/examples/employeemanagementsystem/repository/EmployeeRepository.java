package com.examples.employeemanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examples.employeemanagementsystem.domain.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	// This will be AUTO IMPLEMENTED by Spring into a Bean
}
