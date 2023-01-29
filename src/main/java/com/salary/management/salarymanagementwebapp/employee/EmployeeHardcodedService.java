package com.salary.management.salarymanagementwebapp.employee;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class EmployeeHardcodedService {
	
	private static List<Employee> todos = new ArrayList<>();
	private static long idCounter = 0;
	
	static {
		todos.add(new Employee(++idCounter, "in28minutes","Learn to Dance 2", new Date(), false ));
		todos.add(new Employee(++idCounter, "in28minutes","Learn about Microservices 2", new Date(), false ));
		todos.add(new Employee(++idCounter, "in28minutes","Learn about Angular", new Date(), false ));
	}
	
	public List<Employee> findAll() {
		return todos;
	}

	public Employee save(Employee todo) {
		if(todo.getId()==-1 || todo.getId()==0) {
			todo.setId(++idCounter);
			todos.add(todo);
		} else {
			deleteById(todo.getId());
			todos.add(todo);
		}
		return todo;
	}
	
	public Employee deleteById(long id) {
		Employee todo = findById(id);
		
		if(todo==null) return null;
		
		if(todos.remove(todo)) {
			return todo;
		}
		
		return null;
	}

	public Employee findById(long id) {
		for(Employee todo:todos) {
			if(todo.getId() == id) {
				return todo;
			}
		}
		
		return null;
	}
	
}
