package com.app.project_pglynn.v01.demo.repositories;


import com.app.project_pglynn.v01.demo.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long>, JpaRepository<Employee, Long> {
    List<Employee> findAll();
    Employee findByLastName(String lastName);
    Employee findByUserID(String userID);
    //void deleteById(ID userId);
}
