package com.app.project_pglynn.v01.demo.services.jpa;



import com.app.project_pglynn.v01.demo.models.Product;
import com.app.project_pglynn.v01.demo.repositories.ProductRepository;
import com.app.project_pglynn.v01.demo.services.ProductService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Profile("jpa")
@Transactional
public class ProductServiceJpa extends AbstractJpaService<Product, ProductRepository> implements ProductService {

public ProductServiceJpa(ProductRepository repository){
    super(repository);
}

 //   @Override
 //   public Product findById(Long id) {
    //    return repository.findById(id);
    //}

   // @Override
    //public void deleteById(ID id) {

    //  }
}