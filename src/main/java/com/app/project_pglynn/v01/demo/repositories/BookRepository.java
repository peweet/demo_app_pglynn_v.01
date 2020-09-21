package com.app.project_pglynn.v01.demo.repositories;

import com.app.project_pglynn.v01.demo.domain.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {
}
