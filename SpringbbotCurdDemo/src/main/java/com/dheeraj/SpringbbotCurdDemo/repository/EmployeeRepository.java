package com.dheeraj.SpringbbotCurdDemo.repository;

import com.dheeraj.SpringbbotCurdDemo.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
