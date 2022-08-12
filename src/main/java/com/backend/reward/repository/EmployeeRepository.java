package com.backend.reward.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.backend.reward.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}