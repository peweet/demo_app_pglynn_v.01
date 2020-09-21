package com.app.project_pglynn.v01.demo.repositories;


import com.app.project_pglynn.v01.demo.models.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findAll();
    User findByUserName(String userName);
    //User findByUserName(String name);
    //  User findById(ID id);
    //  void deleteById(ID id);
}
