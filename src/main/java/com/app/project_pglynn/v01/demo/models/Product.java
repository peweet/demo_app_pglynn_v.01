package com.app.project_pglynn.v01.demo.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name ="products")
public class Product extends BaseEntity{

    //    private ProductType productType;
  //  private BusinessUser businessUser;
    private String name;

    @ManyToOne
    @JoinColumn(name ="type_id")
    private ProductType productType;

    @ManyToOne
    @JoinColumn(name = "owner_id")
    private Employee employee;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "product")
    private Set<Purchases> purchases = new HashSet<>();

    public Product(ProductType productType, String name, Set<Purchases> purchases){
        this.productType = productType;
        this.purchases = purchases;
        this.name = name;
    }


}
