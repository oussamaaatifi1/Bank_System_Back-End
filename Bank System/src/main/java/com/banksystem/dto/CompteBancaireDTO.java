package com.banksystem.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class CompteBancaireDTO {
    private int compteId;
    private String typeCompte;
    private float solde;
    private Date dateCreation;
    private int userId;
}

