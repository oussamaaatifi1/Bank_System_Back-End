package com.banksystem.service;

import com.banksystem.dto.CarteBancaireDTO;
import com.banksystem.dto.UserDTO;
import com.banksystem.entity.CarteBancaire;
import com.banksystem.entity.CompteBancaire;
import com.banksystem.repository.CarteBancaireRepository;
import com.banksystem.repository.CompteBancaireRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CartesBancaireServiceImpl implements CartesBancaireService {

    @Autowired
    private CarteBancaireRepository carteBancaireRepository;

    @Autowired
    private CompteBancaireRepository compteBancaireRepository;

    @Override
    public CarteBancaireDTO createCarte(CarteBancaireDTO carteBancaireDTO) {
        CompteBancaire compteBancaire = compteBancaireRepository.findById(carteBancaireDTO.getCompteId())
                .orElseThrow(() -> new RuntimeException("CompteBancaire not found"));

        CarteBancaire carteBancaire = new CarteBancaire();
        carteBancaire.setCompteBancaire(compteBancaire);
        carteBancaire.setNumeroCarte(carteBancaireDTO.getNumeroCarte());
        carteBancaire.setDateExpiration(carteBancaireDTO.getDateExpiration());
        carteBancaire.setTypeCarte(carteBancaireDTO.getTypeCarte());

        CarteBancaire savedCarteBancaire = carteBancaireRepository.save(carteBancaire);

        CarteBancaireDTO savedCarteBancaireDTO = new CarteBancaireDTO();
        savedCarteBancaireDTO.setCarteId(savedCarteBancaire.getCarteId());
        savedCarteBancaireDTO.setCompteId(savedCarteBancaire.getCompteBancaire().getCompteId());
        savedCarteBancaireDTO.setNumeroCarte(savedCarteBancaire.getNumeroCarte());
        savedCarteBancaireDTO.setDateExpiration(savedCarteBancaire.getDateExpiration());
        savedCarteBancaireDTO.setTypeCarte(savedCarteBancaire.getTypeCarte());

        return savedCarteBancaireDTO;
    }

}
