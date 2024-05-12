package com.learning.StudentDetails.controller;

import com.learning.StudentDetails.entity.EmployeeEntity;
import com.learning.StudentDetails.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EmployeeController {
 //List<EmployeeEntity> employee = new ArrayList<>();

   private EmployeeService employeeService;
   public EmployeeController(EmployeeService employeeService){
       super();
       this.employeeService = employeeService;
   }

    @GetMapping("/")
    public List<EmployeeEntity> getEmployee(){
        return employeeService.getAllEmployee();
    }
//@GetMapping("/employee")
//    public String getEmployee(Model model){
//       model.addAttribute("employee",employeeService.getAllEmployee());
//       return "Employee";
//    }

    @DeleteMapping("/Employee/{id}")
    public String deleteEmployee(@PathVariable int id){
        employeeService.deleteEmployee(id);
        return "Delete Employee";
    }

    @PostMapping("Employee")
    public String createEmployees(@RequestBody EmployeeEntity employeeEntity){
        return employeeService.createEmployee(employeeEntity);
    }
@PutMapping("/{id}")
    public String updateEmployee(@PathVariable int id, @RequestBody EmployeeEntity employeeEntity){
        return employeeService.updateEmployee(employeeEntity,id);
    }
}
