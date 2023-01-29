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
public class EmployeeResource {
	
	@Autowired
	private EmployeeHardcodedService employeeService;
	
	@GetMapping("/users/{username}/employees")
	public List<Employee> getAllTodos(@PathVariable String username){
		return employeeService.findAll();
	}

	@GetMapping("/users/{username}/employees/{id}")
	public Employee getTodo(@PathVariable String username, @PathVariable long id){
		return employeeService.findById(id);
	}

	//DELETE /users/{username}/employees/{id}
	@DeleteMapping("/users/{username}/employees/{id}")
	public ResponseEntity<Void> deleteTodo(
			@PathVariable String username, @PathVariable long id){
		
		Employee employee = employeeService.deleteById(id);
		
		if(employee!=null) {
			return ResponseEntity.noContent().build();
		}
		
		return ResponseEntity.notFound().build();
	}
	

	@PutMapping("/users/{username}/employees/{id}")
	public ResponseEntity<Employee> updateTodo(
			@PathVariable String username,
			@PathVariable long id, @RequestBody Employee employee){
		
		Employee todoUpdated = employeeService.save(employee);
		
		return new ResponseEntity<Employee>(employee, HttpStatus.OK);
	}
	
	@PostMapping("/users/{username}/employees")
	public ResponseEntity<Void> updateTodo(
			@PathVariable String username, @RequestBody Employee employee){
		
		Employee createdEmployee = employeeService.save(employee);
		
		//Location
		//Get current resource url
		///{id}
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
				.path("/{id}").buildAndExpand(createdEmployee.getId()).toUri();
		
		return ResponseEntity.created(uri).build();
	}
		
}
