package com.salary.management.salarymanagementwebapp.employee;

import com.salary.management.salarymanagementwebapp.message.ResponseMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.math.BigDecimal;
import java.net.URI;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class EmployeeJpaResource {


	@Autowired
	private EmployeeJpaRepository employeeJpaRepository;

	
	/*@GetMapping("/jpa/users/employees")
	public List<Employee> getAllEmployees(){
		return employeeJpaRepository.findAll();
	}*/

	@GetMapping("/jpa/users/employees")
	@ResponseBody
	public ResponseEntity<Object> getAllEmployees
			(@RequestParam(defaultValue = "0") BigDecimal minSalary,
			 @RequestParam(defaultValue = "99999999") BigDecimal maxSalary,
			 @RequestParam(defaultValue = "0") BigDecimal offset,
			 @RequestParam(defaultValue = "30") BigDecimal limit,
			 @RequestParam(defaultValue = "asc") String sort){
		Map<String, Object> responseMap = new HashMap<>();
		try {
			responseMap.put("results", employeeJpaRepository.findEmployeeBySalary(minSalary, maxSalary));
		} catch (Exception e) {
			throw new ResponseStatusException(
					HttpStatus.BAD_REQUEST);
		}
//		return "minSalary: " + minSalary + " maxSalary: " + maxSalary + " offset: " + offset + " limit: " + limit + " sort: " + sort;
		return new ResponseEntity<>(responseMap, HttpStatus.OK);
	}

	@GetMapping("/jpa/users/employees/{id}")
	public Employee getEmployee(@PathVariable String id){
		return employeeJpaRepository.findById(id).get();
	}

	@DeleteMapping("/jpa/users/employees/{id}")
	public ResponseEntity<Void> deleteEmployee(@PathVariable String id){
		

		employeeJpaRepository.deleteById(id);
		
		return ResponseEntity.noContent().build();
	}
	
	
	@PutMapping("/jpa/users/employees/{id}")
	public ResponseEntity<Employee> updateEmployee(@PathVariable String id, @RequestBody Employee employee){
		
		Employee todoUpdated = employeeJpaRepository.save(employee);
		
		return new ResponseEntity<Employee>(employee, HttpStatus.OK);
	}
	
	@PostMapping("/jpa/users/employees/{id}")
	public ResponseEntity<Employee> createEmployee(
			@PathVariable String id, @RequestBody Employee employee){

		Employee createdEmployee = employeeJpaRepository.save(employee);


		/*URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
				.path("/{id}").buildAndExpand(createdEmployee.getId()).toUri();
		
		return ResponseEntity.created(uri).build();*/
		return new ResponseEntity<Employee>(employee, HttpStatus.OK);
	}
		
}
