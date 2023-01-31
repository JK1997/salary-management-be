package com.salary.management.salarymanagementwebapp.test;

import com.salary.management.salarymanagementwebapp.employee.Employee;
import com.salary.management.salarymanagementwebapp.employee.EmployeeJpaRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@DataJpaTest
public class JPAUnitTest {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    EmployeeJpaRepository employeeJpaRepository;

    BigDecimal salary =
            new BigDecimal("999.99");

    @Test
    public void should_find_no_employees_if_repository_is_empty() {
        Iterable<Employee> employees = employeeJpaRepository.findAll();

        assertThat(employees).isEmpty();
    }

    @Test
    public void should_store_a_employee() {
        Employee employee = employeeJpaRepository.save(new Employee("e0005","JunKai","JunKai test", salary));

        assertThat(employee).hasFieldOrPropertyWithValue("id", "e0005");
        assertThat(employee).hasFieldOrPropertyWithValue("login", "JunKai");
        assertThat(employee).hasFieldOrPropertyWithValue("name", "JunKai test");
        assertThat(employee).hasFieldOrPropertyWithValue("salary", salary);
    }

    @Test
    public void should_find_all_employees() {
        Employee employee1 = new Employee("e0004","JunKai","JunKai test", salary);
        entityManager.persist(employee1);

        Employee employee2 = new Employee("e0005","JunKai2","JunKai test2", salary);
        entityManager.persist(employee2);

        Employee employee3 = new Employee("e0006","JunKai3","JunKai test3", salary);
        entityManager.persist(employee3);

        Iterable<Employee> employees = employeeJpaRepository.findAll();

        assertThat(employees).hasSize(3).contains(employee1, employee2, employee3);
    }

    @Test
    public void should_find_employee_by_id() {
        Employee employee1 = new Employee("e0004","JunKai","JunKai test", salary);
        entityManager.persist(employee1);

        Employee employee2 = new Employee("e0005","JunKai2","JunKai test2", salary);
        entityManager.persist(employee2);

        Employee foundEmployee = employeeJpaRepository.findById(employee2.getId()).get();

        assertThat(foundEmployee).isEqualTo(employee2);
    }

    @Test
    public void should_update_employee_by_id() {
        Employee employee1 = new Employee("e0004","JunKai","JunKai test", salary);
        entityManager.persist(employee1);

        Employee employee2 = new Employee("e0005","JunKai2","JunKai test2", salary);
        entityManager.persist(employee2);

        Employee updatedEmployee = new Employee("e0005", "JunKai7", "JunKai test Updated", salary);

        Employee employee = employeeJpaRepository.findById(employee2.getId()).get();
        employee.setId(updatedEmployee.getId());
        employee.setLogin(updatedEmployee.getLogin());
        employee.setName(updatedEmployee.getName());
        employee.setSalary(updatedEmployee.getSalary());
        employeeJpaRepository.save(employee);

        Employee checkEmployee = null;
//        Employee checkEmployee = employeeJpaRepository.findById(employee2.getId()).get();
        Optional<Employee> oEmployee = employeeJpaRepository.findById(employee2.getId());

        if (oEmployee.isPresent()) {
            // then you are safe to call
            checkEmployee = oEmployee.get();
        }

        assertThat(checkEmployee.getId()).isEqualTo(employee2.getId());
        assertThat(checkEmployee.getLogin()).isEqualTo(updatedEmployee.getLogin());
        assertThat(checkEmployee.getName()).isEqualTo(updatedEmployee.getName());
        assertThat(checkEmployee.getSalary()).isEqualTo(updatedEmployee.getSalary());
    }

    @Test
    public void should_delete_employee_by_id() {
        Employee employee1 = new Employee("e0004","JunKai","JunKai test", salary);
        entityManager.persist(employee1);

        Employee employee2 = new Employee("e0005","JunKai2","JunKai test2", salary);
        entityManager.persist(employee2);

        Employee employee3 = new Employee("e0006","JunKai3","JunKai test3", salary);
        entityManager.persist(employee3);

        employeeJpaRepository.deleteById(employee2.getId());

        Iterable<Employee> employees = employeeJpaRepository.findAll();

        assertThat(employees).hasSize(2).contains(employee1, employee3);
    }

    @Test
    public void should_delete_all_employees() {
        entityManager.persist(new Employee("e0004","JunKai","JunKai test", salary));
        entityManager.persist(new Employee("e0005","JunKai2","JunKai test2", salary));

        employeeJpaRepository.deleteAll();

        assertThat(employeeJpaRepository.findAll().isEmpty());
    }
}
