package com.NeST.employeeAppBackend.controller;


import com.NeST.employeeAppBackend.dao.EmployeeDao;
import com.NeST.employeeAppBackend.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
public class EmployeeController {

    @Autowired

    private EmployeeDao dao;

    @CrossOrigin(origins = "*")
    @PostMapping("/")
    public String EmployeeWelcome(){
        return "welcome to employee website";
    }

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/add", consumes = "application/json", produces = "application/json")
    public HashMap<String, String> EmployeeAdd(@RequestBody Employee e){

        dao.save(e);
        HashMap<String, String> map = new HashMap<>();
        map.put("status", "success");

        return map;
    }
    @CrossOrigin(origins = "*")
    @GetMapping(path = "/view")
    public List<Employee> viewAll(){
        return (List<Employee>) dao.findAll();
    }

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/search", consumes = "application/json", produces = "application/json")
    public String searchEmployee(@RequestBody Employee e){

        String employeeCode = String.valueOf(e.getEmp_code());
        System.out.println(employeeCode);
        return "search page";

    }


}
