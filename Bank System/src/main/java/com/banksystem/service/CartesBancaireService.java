package com.banksystem.service;


import com.banksystem.dto.CarteBancaireDTO;
import com.banksystem.entity.CarteBancaire;
import com.banksystem.entity.User;

import java.util.List;
import java.util.Optional;

public interface CartesBancaireService {
    public CarteBancaireDTO createCarte(CarteBancaireDTO carteBancaireDTO);
}
