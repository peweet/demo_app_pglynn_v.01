package com.app.project_pglynn.v01.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;

import java.beans.Transient;

@Controller
public class IndexController {


    @RequestMapping({"", "/", "/index"})
    public String index(){
        return "index";
    }

    @RequestMapping({"/survey"})
    public String question(){
        return "questionnaire";
    }

    @RequestMapping({"/larger_survey"})
    public String deep_questionnaire(){
        return "in_depth_questionnaire";
    }
    //@Transactional
   // public String saveUser(UserDto userDto){
     //   userDto.setPassword(bCryptPasswordEncoder.encode(userDto.getPassword()));
       // return save(new User(userDto)).getId();

    //}
}


