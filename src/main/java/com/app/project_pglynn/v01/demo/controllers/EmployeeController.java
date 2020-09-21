package com.app.project_pglynn.v01.demo.controllers;

import com.app.project_pglynn.v01.demo.repositories.EmployeeRepository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    private final EmployeeRepository employeeRepository;
  //  private final EmployeeService employeeService;

    public EmployeeController(EmployeeRepository employeeRepository){

        this.employeeRepository = employeeRepository;
    }

   @RequestMapping("/employees")
   public String displayAll(Model model){
       model.addAttribute("employee", employeeRepository.findAll());
       return "employeeList";


   }


}
