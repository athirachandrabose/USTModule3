package com.ust.practice.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ust.practice.Model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {

}
