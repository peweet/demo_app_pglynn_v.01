package com.app.project_pglynn.v01.demo.services;

import com.app.project_pglynn.v01.demo.models.Employee;
import org.springframework.stereotype.Service;

@Service
public interface EmployeeService extends CrudService<Employee>  {
Employee findByLastName(String lastName);

}
