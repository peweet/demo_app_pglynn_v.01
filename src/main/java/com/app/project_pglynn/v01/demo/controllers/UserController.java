package com.app.project_pglynn.v01.demo.controllers;


import com.app.project_pglynn.v01.demo.models.User;
import com.app.project_pglynn.v01.demo.repositories.UserRepository;
import com.app.project_pglynn.v01.demo.services.UserService;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RequestMapping({"/users"})
@RestController
public class UserController {
  private UserService userService;

private UserRepository userRepository;
private BCryptPasswordEncoder bCryptPasswordEncoder;

public UserController(UserRepository userRepository,
                      BCryptPasswordEncoder bCryptPasswordEncoder){
    this.userRepository = userRepository;
    this.bCryptPasswordEncoder = bCryptPasswordEncoder;
}
//used for inspiration https://auth0.com/blog/implementing-jwt-authentication-on-spring-boot/
@PostMapping("/sign-up")
public void signUp(@RequestBody User user) {
    user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
    userRepository.save(user);

        }
}


