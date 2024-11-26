package com.stark.repository;

import com.stark.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

/*The EmployeeRepository interface is part of the Spring Data JPA framework. It’s used to interact with the database
and perform CRUD (Create, Read, Update, Delete) operations for the Employee entity.*/

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
  }