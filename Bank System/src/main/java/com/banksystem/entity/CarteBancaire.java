package com.banksystem.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
public class CarteBancaire {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int numeroCarte;
    private Date dateExpiration;
    private String typeCarte;

    @ManyToOne
    @JoinColumn(name = "compte_id")
    private CompteBancaire compteBancaire;

    // Constructors, getters, and setters
    public CarteBancaire() {}

    public CarteBancaire(Date dateExpiration, String typeCarte, CompteBancaire compteBancaire) {
        this.dateExpiration = dateExpiration;
        this.typeCarte = typeCarte;
        this.compteBancaire = compteBancaire;
    }

    public int getNumeroCarte() {
        return numeroCarte;
    }

    public void setNumeroCarte(int numeroCarte) {
        this.numeroCarte = numeroCarte;
    }

    public Date getDateExpiration() {
        return dateExpiration;
    }

    public void setDateExpiration(Date dateExpiration) {
        this.dateExpiration = dateExpiration;
    }

    public String getTypeCarte() {
        return typeCarte;
    }

    public void setTypeCarte(String typeCarte) {
        this.typeCarte = typeCarte;
    }

    public CompteBancaire getCompteBancaire() {
        return compteBancaire;
    }

    public void setCompteBancaire(CompteBancaire compteBancaire) {
        this.compteBancaire = compteBancaire;
    }
}
