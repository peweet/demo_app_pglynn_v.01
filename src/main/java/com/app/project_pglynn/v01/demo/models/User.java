package com.app.project_pglynn.v01.demo.models;

import lombok.Generated;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.*;
// import org.springframework.security.core.GrantedAuthority;
// import org.springframework.security.core.userdetails.UserDetails;

@Entity
@Getter
@Setter
@Table(name ="users")
public class User extends Person {


    private String userName;
    //@NotBlank
    //@Size(max = 120)
    private String password;

   public User(String firstName, String lastName){
       super(firstName, lastName);
   }

  //  public long getId() {
    //    return id;
    //}

    public String getUsername() {
        return userName;
    }

    public void setUsername(String username) {
        this.userName = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}


/*
@Entity
public class User extends BaseEntity implements UserDetails {
    @Column
    private String name;
    @Column
    private String email;
    @Column
    private String userName;

    public String getName() {
        return name;

    }
    //public Long getId() {
      //  return id;
    //}

    public void setName(String name) {
        this.name
                = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getPassword() {
        return null;
    }

    @Override
    public String getUsername() {
        return null;
    }

    @Override
    public boolean isAccountNonExpired() {
        return false;
    }

    @Override
    public boolean isAccountNonLocked() {
        return false;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return false;
    }

    @Override
    public boolean isEnabled() {
        return false;
    }
}
/*@Entity
@Table(name = "user")
public class User {
    @Id
    //@Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;
    private String username;
    private String email;

    //@ManyToOne(mappedBy = "users")
   // private Set<Roles> roles;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Set<Roles> getRoles() {
      //  return roles;
        return null;
    }

    //p0ublic void setRoles(Set<Roles> roles) {
        //Roles = roles;
    //}
      }

 */




