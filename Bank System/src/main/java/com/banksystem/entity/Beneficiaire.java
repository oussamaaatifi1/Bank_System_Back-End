package com.banksystem.entity;

import javax.persistence.*;

@Entity
public class Beneficiaire {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nom;
    private String detailsCompte;

    @ManyToOne
    @JoinColumn(name = "compte_id")
    private CompteBancaire compteBancaire;

    // Getters and setters
}