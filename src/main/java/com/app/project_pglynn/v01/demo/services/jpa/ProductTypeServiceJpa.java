package com.app.project_pglynn.v01.demo.services.jpa;


import com.app.project_pglynn.v01.demo.models.ProductType;
import com.app.project_pglynn.v01.demo.repositories.ProductTypeRepository;
import com.app.project_pglynn.v01.demo.services.ProductTypeService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Profile("jpa")
@Transactional
public class ProductTypeServiceJpa extends AbstractJpaService<ProductType, ProductTypeRepository> implements ProductTypeService {


    public ProductTypeServiceJpa(ProductTypeRepository repository) {
        super(repository);
    }

    //  @Override
    // public void deleteById(ID id) {

    //  }
}
