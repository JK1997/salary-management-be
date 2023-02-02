package com.salary.management.salarymanagementwebapp.employee;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface EmployeeJpaRepository extends JpaRepository<Employee, String>{
//	List<Employee> findByUsername(String login);

	List<Employee> findByLogin(String login);

	@Query("SELECT u FROM Employee u WHERE u.salary >= ?1 and u.salary <= ?2")
	List<Employee> findEmployeeBySalary(BigDecimal minSalary, BigDecimal maxSalary, Pageable pageable);
}
