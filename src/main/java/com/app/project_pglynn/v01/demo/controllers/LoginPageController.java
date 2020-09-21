package com.app.project_pglynn.v01.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginPageController {

    //@GetMapping("/index")
   // public String index(){
            //Model model, Principal principal){

        //model.addAttribute("message", "You are loggied in as" +
          //      principal.getName());
     //   return "login";

    //}
            //({"", "/", "/index.html"})

    @RequestMapping
    public String greeting(@RequestParam(name="name", required=false) String name, Model model){
        model.addAttribute("name", name);
        return "greeting";
    }

}
