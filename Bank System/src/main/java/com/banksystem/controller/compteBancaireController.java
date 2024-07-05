package com.banksystem.controller;

import com.banksystem.dto.CompteBancaireDTO;
import com.banksystem.dto.UserDTO;
import com.banksystem.entity.CompteBancaire;
import com.banksystem.entity.User;
import com.banksystem.service.CompteBancaireService;
import com.banksystem.service.CompteBancaireServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/comptes")
public class compteBancaireController {

    @Autowired
    public CompteBancaireServiceImpl compteBancaireServiceimpl;

    @PostMapping("/add")
    public ResponseEntity<CompteBancaireDTO> createCompteBancaire(@RequestBody CompteBancaireDTO compteBancaireDTO) {
        CompteBancaireDTO createdCompteBancaireDTO = compteBancaireServiceimpl.CreateCompte(compteBancaireDTO);
        return ResponseEntity.ok(createdCompteBancaireDTO);
    }

    @GetMapping("/all")
    public ResponseEntity<List<CompteBancaireDTO>> getAllComptes() {
        List<CompteBancaireDTO> comptes = compteBancaireServiceimpl.getAllComptes();
        return ResponseEntity.ok(comptes);
    }
    @GetMapping("/{id}")
    public ResponseEntity<CompteBancaire> getMovieById(@PathVariable int id) {
        CompteBancaire compteBancaire = compteBancaireServiceimpl.getCompteById(id);
        if (compteBancaire != null) {
            return ResponseEntity.ok(compteBancaire);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMovie(@PathVariable int id) {
        if (compteBancaireServiceimpl.deleteMovie(id)) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
