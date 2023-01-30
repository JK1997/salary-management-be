package com.salary.management.salarymanagementwebapp.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class EmployeeJpaResource {


	@Autowired
	private EmployeeJpaRepository employeeJpaRepository;

	
	@GetMapping("/jpa/users/{login}/employees")
	public List<Employee> getAllEmployees(@PathVariable String login){
		return employeeJpaRepository.findByLogin(login);
	}

	@GetMapping("/jpa/users/{login}/employees/{id}")
	public Employee getEmployee(@PathVariable String login, @PathVariable String id){
		return employeeJpaRepository.findById(id).get();
	}

	@DeleteMapping("/jpa/users/{login}/employees/{id}")
	public ResponseEntity<Void> deleteEmployee(
			@PathVariable String login, @PathVariable String id){
		

		employeeJpaRepository.deleteById(id);
		
		return ResponseEntity.noContent().build();
	}
	
	
	@PutMapping("/jpa/users/{login}/employees/{id}")
	public ResponseEntity<Employee> updateEmployee(
			@PathVariable String login,
			@PathVariable String id, @RequestBody Employee employee){
		
		Employee todoUpdated = employeeJpaRepository.save(employee);
		
		return new ResponseEntity<Employee>(employee, HttpStatus.OK);
	}
	
	@PostMapping("/jpa/users/{login}/employees/{id}")
	public ResponseEntity<Employee> createEmployee(
			@PathVariable String login, @PathVariable String id, @RequestBody Employee employee){
		
		employee.setLogin(login);
		Employee createdEmployee = employeeJpaRepository.save(employee);


		/*URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
				.path("/{id}").buildAndExpand(createdEmployee.getId()).toUri();
		
		return ResponseEntity.created(uri).build();*/
		return new ResponseEntity<Employee>(employee, HttpStatus.OK);
	}
		
}
