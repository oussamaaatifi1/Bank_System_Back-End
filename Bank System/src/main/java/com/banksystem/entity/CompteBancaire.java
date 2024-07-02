package com.banksystem.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class CompteBancaire {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int compteId;
    private String typeCompte;
    private float solde;
    private Date dateCreation;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @OneToMany(mappedBy = "compteBancaire", cascade = CascadeType.ALL)
    private List<Transaction> transactions;

    @OneToMany(mappedBy = "compteBancaire", cascade = CascadeType.ALL)
    private List<CarteBancaire> cartesBancaires;

    @OneToMany(mappedBy = "compteBancaire", cascade = CascadeType.ALL)
    private List<Beneficiaire> beneficiaires;

    // Constructors, getters, and setters
    public CompteBancaire() {}

    public CompteBancaire(String typeCompte, float solde, Date dateCreation, User user) {
        this.typeCompte = typeCompte;
        this.solde = solde;
        this.dateCreation = dateCreation;
        this.user = user;
    }

    public int getCompteId() {
        return compteId;
    }

    public void setCompteId(int compteId) {
        this.compteId = compteId;
    }

    public String getTypeCompte() {
        return typeCompte;
    }

    public void setTypeCompte(String typeCompte) {
        this.typeCompte = typeCompte;
    }

    public float getSolde() {
        return solde;
    }

    public void setSolde(float solde) {
        this.solde = solde;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }

    public List<CarteBancaire> getCartesBancaires() {
        return cartesBancaires;
    }

    public void setCartesBancaires(List<CarteBancaire> cartesBancaires) {
        this.cartesBancaires = cartesBancaires;
    }

    public List<Beneficiaire> getBeneficiaires() {
        return beneficiaires;
    }

    public void setBeneficiaires(List<Beneficiaire> beneficiaires) {
        this.beneficiaires = beneficiaires;
    }
}

