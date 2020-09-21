package com.app.project_pglynn.v01.demo.services.map;

import com.app.project_pglynn.v01.demo.models.User;
import com.app.project_pglynn.v01.demo.services.CrudService;
import org.springframework.stereotype.Service;
//import org.springframework.security.core.userdetails.User;


//note this could be deleted as anterface. Using existing
//libraries in UserDetails Spring Security core

//
@Service
public interface UserService extends CrudService<User> {

   // IUserRepository userRepository;

}
