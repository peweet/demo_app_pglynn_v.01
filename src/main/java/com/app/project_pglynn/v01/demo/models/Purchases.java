package com.app.project_pglynn.v01.demo.models;

import lombok.Generated;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Generated
@Setter
@NoArgsConstructor
@Table(name ="purchases")
public class Purchases extends BaseEntity{

    private LocalDate date;
    private String description;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;
}
