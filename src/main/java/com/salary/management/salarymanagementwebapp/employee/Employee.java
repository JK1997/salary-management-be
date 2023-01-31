package com.salary.management.salarymanagementwebapp.employee;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
//@Table(uniqueConstraints = { @UniqueConstraint(columnNames = { "login" }) })
public class Employee {

	@Id
	private String id;

	@Column(unique = true)
	private String login;

	private String name;

	private BigDecimal salary;

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (id != other.id)
			return false;
		return true;
	}


}
