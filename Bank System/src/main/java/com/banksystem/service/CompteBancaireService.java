package com.banksystem.service;

import com.banksystem.dto.CompteBancaireDTO;
import com.banksystem.dto.UserDTO;
import com.banksystem.entity.CompteBancaire;
import com.banksystem.entity.User;

import java.util.List;

public interface CompteBancaireService {
    public CompteBancaireDTO CreateCompte(CompteBancaireDTO compteBancaireDTO);
    public List<CompteBancaireDTO> getAllComptes();

    public boolean deleteMovie(int id);
}
