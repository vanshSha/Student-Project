package com.learning.StudentDetails.service;

import com.learning.StudentDetails.entity.EmployeeEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
public interface EmployeeService {

    String createEmployee(EmployeeEntity employeeEntity);
    List<EmployeeEntity> getAllEmployee();
    boolean deleteEmployee(int id);

    String updateEmployee( EmployeeEntity employeeEntity, int id);

}
