package com.banksystem.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class TransactionDTO {
    private int idTransaction;
    private Date dateHeure;
    private float montant;
    private String typeTransaction;
    private String description;
    private int compteId;
}
