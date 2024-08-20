package com.tutorialMedium.tutorial.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "product_inventory")
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //con id y generatedvalue (identity) defino al atributo como clave primaria de la entidad
    private long id;

    @Column(name = "product_name", nullable=false)
    private String productName;

    @Column(name = "color")
    private String color;

    @Column(name = "price")
    private int price;

}
