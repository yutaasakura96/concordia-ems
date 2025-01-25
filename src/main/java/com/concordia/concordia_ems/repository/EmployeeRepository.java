package com.concordia.concordia_ems.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.concordia.concordia_ems.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
