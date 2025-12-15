package com.dheeraj.SpringbbotCurdDemo.controller;

import com.dheeraj.SpringbbotCurdDemo.model.Employee;
import com.dheeraj.SpringbbotCurdDemo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/createEmployee")
    public Employee createEmployee(@RequestBody Employee employee){
      employeeService.createEmplopyee(employee);
        return employee;
    }

    @GetMapping("/getEmployee/{id}")
    public Employee getEmployee(@PathVariable Integer id){
        return employeeService.getEmployee(id);
    }

    @PutMapping("/updateEmployee/{id}")
    public Employee updateEmployee(@RequestBody Employee employee, @PathVariable Integer id){
      return employeeService.updateEmployee(employee,id);
    }

    @DeleteMapping("/deleteEmployee/{id}")
    public void deleteEmployee(@PathVariable Integer id){
      employeeService.deleteEmployee(id);
    }

}
