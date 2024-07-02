package com.banksystem.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class CarteBancaireDTO {
    private String numeroCarte;
    private Date dateExpiration;
    private String typeCarte;
    private int compteId;
}
