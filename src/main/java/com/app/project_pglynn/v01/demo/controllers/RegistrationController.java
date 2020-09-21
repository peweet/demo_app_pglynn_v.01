package com.app.project_pglynn.v01.demo.controllers;

import com.app.project_pglynn.v01.demo.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RegistrationController {

    @PostMapping({"/register", "/registration"})
    public String registerUser(@RequestParam(required=false) String dateOfBirth, @RequestParam String name, Model model){
        // TODO save user registration to database
        // userService.save(user)

        // TODO send out registration email
       // mailService.sendRegistrationEmail(user.getEmail());;

        User user = new User("Patrick", "Glynn");
        model.addAttribute("user", user);
        return "registration-success";

    }

}
