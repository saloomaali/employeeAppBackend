package com.NeST.employeeAppBackend.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @GetMapping("/")
    public String EmployeeWelcome(){
        return "welcome to employee website";
    }
}
