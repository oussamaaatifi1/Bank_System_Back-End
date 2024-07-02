package com.banksystem.entity;


import javax.persistence.*;
import java.util.List;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;
    private String nom;
    private String email;
    private String motDePasse;

    @OneToMany(mappedBy = "user")
    private List<CompteBancaire> comptes;

    // Getters and setters
}
