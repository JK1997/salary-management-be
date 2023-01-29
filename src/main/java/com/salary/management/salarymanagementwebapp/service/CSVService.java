package com.salary.management.salarymanagementwebapp.service;

import java.io.IOException;
import java.util.List;

import com.salary.management.salarymanagementwebapp.helper.CSVHelper;
import com.salary.management.salarymanagementwebapp.employee.Employee;
import com.salary.management.salarymanagementwebapp.employee.EmployeeJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class CSVService {
    @Autowired
    EmployeeJpaRepository employeeJpaRepository;

    public void save(MultipartFile file) {
        try {
            List<Employee> employees = CSVHelper.csvToEmployees(file.getInputStream());
            employeeJpaRepository.saveAll(employees);
        } catch (IOException e) {
            throw new RuntimeException("fail to store csv data: " + e.getMessage());
        }
    }

    public List<Employee> getAllEmployees() {
        return employeeJpaRepository.findAll();
    }
}
