package com.dheeraj.SpringbbotCurdDemo.service;

import com.dheeraj.SpringbbotCurdDemo.model.Employee;
import com.dheeraj.SpringbbotCurdDemo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee createEmplopyee(Employee employee){
        return employeeRepository.save(employee);
    }

    public Employee getEmployee(Integer id){
        Employee emp = employeeRepository.findById(id).orElse(null);
        return emp;
    }

    public Employee updateEmployee(Employee employee,Integer id){
        Employee emp = employeeRepository.findById(id).orElse(null);
        if (emp == null){
            return null;
        }
        emp.setEmpName(employee.getEmpName());
        emp.setEmpAddress(employee.getEmpAddress());;
        emp.setEmpSalary(employee.getEmpSalary());


        return employeeRepository.save(emp);
    }

    public Employee deleteEmployee(Integer id){
         employeeRepository.deleteById(id);
        return null;
    }
}
