package com.NeST.employeeAppBackend.dao;

import com.NeST.employeeAppBackend.model.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeDao extends CrudRepository<Employee, Integer> {
}
