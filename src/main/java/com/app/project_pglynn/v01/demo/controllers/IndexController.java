package com.app.project_pglynn.v01.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {


    @RequestMapping({"", "/", "/index"})
    public String index(){
        return "index";
    }
}