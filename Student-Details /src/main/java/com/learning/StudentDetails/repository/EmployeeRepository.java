package com.learning.StudentDetails.repository;

import com.learning.StudentDetails.entity.EmployeeEntity;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;
@Repository
public interface EmployeeRepository extends JpaRepository< EmployeeEntity,Integer> {

}
