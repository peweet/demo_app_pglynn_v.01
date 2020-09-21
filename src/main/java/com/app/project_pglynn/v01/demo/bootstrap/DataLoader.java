package com.app.project_pglynn.v01.demo.bootstrap;

import com.app.project_pglynn.v01.demo.models.Employee;
import com.app.project_pglynn.v01.demo.models.Product;
import com.app.project_pglynn.v01.demo.models.ProductType;
import com.app.project_pglynn.v01.demo.repositories.EmployeeRepository;
import com.app.project_pglynn.v01.demo.repositories.ProductRepository;
import com.app.project_pglynn.v01.demo.repositories.ProductTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final EmployeeRepository employeeRepository;
    private final ProductRepository productRepository;
    private final ProductTypeRepository productTypeRepository;



    @Autowired
    public DataLoader(EmployeeRepository employeeRepository, ProductTypeRepository productTypeRepository,
                      ProductRepository productRepository){
        this.employeeRepository = employeeRepository;
        this.productTypeRepository = productTypeRepository;
        this.productRepository = productRepository;

    }

    @Override
    public void run(String... strings) throws Exception {
        this.employeeRepository.save(new Employee("Patrick",
                "Glynn", "Galway, Ireland", "email@gmail.com", "12345"));
        ProductType productType = new ProductType();
        productType.setName("Book");
        this.productTypeRepository.save(new ProductType("Book"));
        this.productRepository.save(new Product());
    }
        }