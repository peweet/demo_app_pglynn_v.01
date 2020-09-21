package com.app.project_pglynn.v01.demo.repositories;


import com.app.project_pglynn.v01.demo.domain.Author;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends CrudRepository<Author, Long> {


}
