package com.app.project_pglynn.v01.demo.models;

// import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;

@Entity
@Table(name ="roles")
public class Roles //  implements GrantedAuthority
{

    @Id
    @Column(name ="role_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

   // @OneToMany(mappedBy = "roles")
    //♦private Set<User> users;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //   @Override
    //  public String getAuthority() {
    //     return null;
    // }
}

