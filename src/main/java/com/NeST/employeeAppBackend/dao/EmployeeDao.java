package com.NeST.employeeAppBackend.dao;

import com.NeST.employeeAppBackend.model.Employee;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EmployeeDao extends CrudRepository<Employee, Integer> {

    @Query(value = "SELECT `id`, `company_name`, `designation`, `emp_code`, `mobileno`, `name`, `password`, `salary`, `username` FROM `employees` WHERE `emp_code` = : empCode", nativeQuery = true)
    List<Employee> searchEmployee(Integer empCode);
}
