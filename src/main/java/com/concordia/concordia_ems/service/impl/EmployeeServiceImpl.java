package com.concordia.concordia_ems.service.impl;

import org.springframework.stereotype.Service;
import com.concordia.concordia_ems.dto.EmployeeDto;
import com.concordia.concordia_ems.entity.Employee;
import com.concordia.concordia_ems.mapper.EmployeeMapper;
import com.concordia.concordia_ems.repository.EmployeeRepository;
import com.concordia.concordia_ems.service.EmployeeService;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

  private EmployeeRepository employeeRepository;

  @Override
  public EmployeeDto createEmployee(EmployeeDto employeeDto) {

    Employee employee = EmployeeMapper.mapToEmployee(employeeDto);
    Employee savedEmployee = employeeRepository.save(employee);

    return EmployeeMapper.mapToEmployeeDto(savedEmployee);
  }
}
