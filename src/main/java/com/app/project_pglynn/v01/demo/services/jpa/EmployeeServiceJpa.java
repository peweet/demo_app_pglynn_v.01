package com.app.project_pglynn.v01.demo.services.jpa;

import com.app.project_pglynn.v01.demo.models.Employee;
import com.app.project_pglynn.v01.demo.repositories.EmployeeRepository;
import com.app.project_pglynn.v01.demo.services.EmployeeService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Profile("jpa")
@Transactional
public class EmployeeServiceJpa extends AbstractJpaService<Employee, EmployeeRepository> implements EmployeeService {

    public EmployeeServiceJpa(EmployeeRepository repository){
        super(repository);
    }

    //   @Override
    //  public void deleteById(ID id) {

    //  }

    @Override
    public Employee findByLastName(String lastName) {
        return null;
    }
}
