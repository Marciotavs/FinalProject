package com.OnTrack.Ontrack.controller;


import com.OnTrack.Ontrack.model.Employee;
import com.OnTrack.Ontrack.repository.EmployeeRepository;
import com.OnTrack.Ontrack.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employee")

public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;


    @PostMapping
    public String saveEmployee(@RequestBody  Employee employee) {
        employeeService.saveEmployee(employee);
        return "Employee saved successfully";
    }

    @GetMapping
    public List<Employee> getAllEmployee(){
        return employeeService.getAllEmployees();

    }

    @GetMapping("/{employeeID}")
    public List <Employee> getEmployeeById(@PathVariable String employeeID) {
        return employeeService.findByEmployeeID(employeeID);
    }


}