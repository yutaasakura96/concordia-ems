package com.concordia.concordia_ems.mapper;

import com.concordia.concordia_ems.dto.EmployeeDto;
import com.concordia.concordia_ems.entity.Employee;

public class EmployeeMapper {
  public static EmployeeDto mapToEmployeeDto(Employee employee) {
    return new EmployeeDto(
      employee.getId(),
      employee.getFirstName(),
      employee.getLastName(),
      employee.getEmail()
    );
  }

  public static Employee mapToEmployee(EmployeeDto employeeDto) {
    return new Employee(
      employeeDto.getId(),
      employeeDto.getFirstName(),
      employeeDto.getLastName(),
      employeeDto.getEmail()
    );
  }
}
