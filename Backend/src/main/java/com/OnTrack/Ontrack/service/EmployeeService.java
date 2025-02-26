package com.OnTrack.Ontrack.service;

import com.OnTrack.Ontrack.model.Employee;
import com.OnTrack.Ontrack.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;


    public void saveEmployee(Employee employee) {
        employeeRepository.save(employee);
    }

    public List<Employee> findByEmployeeID(String employeeID) {
        return employeeRepository.findByEmployeeID(employeeID);
    }

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();

    }


}