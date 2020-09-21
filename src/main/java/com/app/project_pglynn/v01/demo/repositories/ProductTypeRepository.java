package com.app.project_pglynn.v01.demo.repositories;


import com.app.project_pglynn.v01.demo.models.ProductType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductTypeRepository extends JpaRepository<ProductType, Long> {
}
