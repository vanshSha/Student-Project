package com.learning.StudentDetails.service;

import com.learning.StudentDetails.entity.EmployeeEntity;
import com.learning.StudentDetails.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@Service
public class EmployeeImpl implements EmployeeService {

     private EmployeeRepository employeeRepository;
     public EmployeeImpl(EmployeeRepository employeeRepository){
         super();
         this.employeeRepository = employeeRepository;
     }


    //List<EmployeeEntity> employees = new ArrayList<>();
    @Override
    public String createEmployee(EmployeeEntity employeeEntity) {
        employeeRepository.save(employeeEntity);
        return "Saved Successfully";
    }

    @Override
    public List<EmployeeEntity> getAllEmployee() {
        return employeeRepository.findAll();
    }
    @Override
    public boolean deleteEmployee(int id) {
        employeeRepository.deleteById(id);
        return true;
    }

    @Override
    public String updateEmployee(EmployeeEntity employeeEntity, int id) {
        Optional<EmployeeEntity> optionalaEmp = employeeRepository.findById(id);
        if (optionalaEmp.isPresent()) {
            EmployeeEntity existingEmployee = optionalaEmp.get();
            existingEmployee.setGmail(employeeEntity.getGmail());
            existingEmployee.setName(employeeEntity.getName());
            employeeRepository.save(existingEmployee);
            return "Update Successfull";

        } else {
            return "Employee not fount";
        }
    }
}