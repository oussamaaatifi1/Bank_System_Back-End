package com.banksystem.controller;

import com.banksystem.dto.CarteBancaireDTO;
import com.banksystem.dto.CompteBancaireDTO;
import com.banksystem.dto.UserDTO;
import com.banksystem.entity.CarteBancaire;
import com.banksystem.entity.User;
import com.banksystem.service.CartesBancaireService;
import com.banksystem.service.CartesBancaireServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/cartes")
public class carteBancaireController {

    @Autowired
    private CartesBancaireServiceImpl carteBancaireService;

    @PostMapping("/add")
    public ResponseEntity<CarteBancaireDTO> createCompteBancaire(@RequestBody CarteBancaireDTO carteBancaireDTO) {
        CarteBancaireDTO createdCarteBancaireDTO = carteBancaireService.createCarte(carteBancaireDTO);
        return ResponseEntity.ok(createdCarteBancaireDTO);
    }


}
