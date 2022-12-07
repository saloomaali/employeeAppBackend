package com.NeST.employeeAppBackend.controller;


import com.NeST.employeeAppBackend.dao.EmployeeDao;
import com.NeST.employeeAppBackend.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired

    private EmployeeDao dao;
    @PostMapping("/")
    public String EmployeeWelcome(){
        return "welcome to employee website";
    }
    @PostMapping(path = "/add", consumes = "application/json", produces = "application/json")
    public String EmployeeAdd(@RequestBody Employee e){
        System.out.println(e.getEmp_code());
        System.out.println(e.getName());
        System.out.println(e.getDesignation());
        System.out.println(e.getSalary());
        System.out.println(e.getCompanyName());
        System.out.println(e.getMobileNO());
        System.out.println(e.getUsername());
        System.out.println(e.getPassword());

        dao.save(e);
        return "this is the employee add page";
    }

    @GetMapping(path = "/view")
    public List<Employee> viewAll(){
        return (List<Employee>) dao.findAll();
    }


}
