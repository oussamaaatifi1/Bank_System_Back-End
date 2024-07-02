package com.banksystem.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTransaction;
    private Date dateHeure;
    private float montant;
    private String typeTransaction; // "DEBIT", "CREDIT", "TRANSFER"
    private String description;

    @ManyToOne
    @JoinColumn(name = "compte_id")
    private CompteBancaire compteBancaire;

    @ManyToOne
    @JoinColumn(name = "compte_dest_id", nullable = true)
    private CompteBancaire compteDest;
}