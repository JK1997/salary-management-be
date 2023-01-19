package com.salary.management.salarymanagementwebapp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class SalaryManagementController {

    @RequestMapping("/salary")
    public List<Salary> retrieveAllSalaries() {
        return Arrays.asList(
                new Salary(1, "Jun Kai", 5000),
                new Salary(2, "Keane", 8000),
                new Salary(3, "Han", 10000)
        );
    }

}
