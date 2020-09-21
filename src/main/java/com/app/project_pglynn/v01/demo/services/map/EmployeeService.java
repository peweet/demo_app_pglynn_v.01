package com.app.project_pglynn.v01.demo.services.map;

import com.app.project_pglynn.v01.demo.models.Employee;
import com.app.project_pglynn.v01.demo.services.CrudService;
import org.springframework.stereotype.Service;

@Service
public interface EmployeeService extends CrudService<Employee> {
Employee findByLastName(String lastName);

}
