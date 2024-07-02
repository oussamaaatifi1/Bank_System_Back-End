package com.banksystem.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Transfer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTransfer;
    private float montant;
    private Date dateHeure;
    private String description;

    @ManyToOne
    @JoinColumn(name = "compte_source_id")
    private CompteBancaire compteSource;

    @ManyToOne
    @JoinColumn(name = "compte_dest_id")
    private CompteBancaire compteDest;
}