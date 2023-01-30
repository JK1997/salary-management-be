package com.salary.management.salarymanagementwebapp.employee;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeJpaRepository extends JpaRepository<Employee, String>{
//	List<Employee> findByUsername(String login);

	List<Employee> findByLogin(String login);
}
