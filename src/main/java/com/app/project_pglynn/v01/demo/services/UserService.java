package com.app.project_pglynn.v01.demo.services;

import com.app.project_pglynn.v01.demo.models.User;
import com.app.project_pglynn.v01.demo.repositories.UserRepository;
import org.springframework.stereotype.Service;



//note this could be deleted as interface. Using existing
//libraries in UserDetails Spring Security core

//
@Service
public interface UserService extends CrudService <User> {

   // IUserRepository userRepository;

}
