package com.app.project_pglynn.v01.demo.repositories;


import com.app.project_pglynn.v01.demo.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//note future refactor
// could be better to extend JpaRepository
//https://www.baeldung.com/spring-data-jpa-pagination-sorting
// JpaRepository https://www.baeldung.com/spring-data-repositories
@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
