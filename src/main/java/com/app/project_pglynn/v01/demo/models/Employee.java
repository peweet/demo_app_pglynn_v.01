package com.app.project_pglynn.v01.demo.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Getter
@Setter
@Table(name ="employees")
public class Employee extends Person {

    private String address;
    private String town;
    private String email;
    private String userID;

    public Employee(String firstName, String lastName, String address, String town, String email) {
        super(firstName, lastName);
        this.address = address;
        this.town = town;
        this.email = email;
        this.userID = userID;

    }

}
