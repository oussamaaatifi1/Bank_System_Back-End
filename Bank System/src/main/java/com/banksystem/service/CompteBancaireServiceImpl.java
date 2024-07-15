package com.banksystem.service;

import com.banksystem.dto.CompteBancaireDTO;
import com.banksystem.dto.UserDTO;
import com.banksystem.entity.CompteBancaire;
import com.banksystem.entity.Users;
import com.banksystem.repository.CompteBancaireRepository;
import com.banksystem.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CompteBancaireServiceImpl implements CompteBancaireService {

    @Autowired
    public CompteBancaireRepository compteBancaireRepository;

    @Autowired
    private UserRepository userRepository;

    @Override
    public CompteBancaireDTO CreateCompte(CompteBancaireDTO compteBancaireDTO) {
        Users user = userRepository.findById(compteBancaireDTO.getUserId())
                .orElseThrow(() -> new RuntimeException("User not found"));

        CompteBancaire compteBancaire = new CompteBancaire();
        compteBancaire.setUser(user);
        compteBancaire.setTypeCompte(compteBancaireDTO.getTypeCompte());
        compteBancaire.setSolde(compteBancaireDTO.getSolde());
        compteBancaire.setDateCreation(compteBancaireDTO.getDateCreation());

        CompteBancaire savedCompteBancaire = compteBancaireRepository.save(compteBancaire);

        CompteBancaireDTO savedCompteBancaireDTO = new CompteBancaireDTO();
        savedCompteBancaireDTO.setUserId(savedCompteBancaire.getUser().getUser_id());
        savedCompteBancaireDTO.setTypeCompte(savedCompteBancaire.getTypeCompte());
        savedCompteBancaireDTO.setSolde(savedCompteBancaire.getSolde());
        savedCompteBancaireDTO.setDateCreation(savedCompteBancaire.getDateCreation());

        return savedCompteBancaireDTO;
    }

    @Override
    public List<CompteBancaireDTO> getAllComptes() {
        return compteBancaireRepository.findAll().stream()
                .map(compte -> {
                    CompteBancaireDTO dto = new CompteBancaireDTO();
                    dto.setUserId(compte.getUser().getUser_id());
                    dto.setTypeCompte(compte.getTypeCompte());
                    dto.setSolde(compte.getSolde());
                    dto.setDateCreation(compte.getDateCreation());
                    return dto;
                })
                .collect(Collectors.toList());
    }

    @Override
    public boolean deleteMovie(int id) {
        if (compteBancaireRepository.existsById(id)) {
            compteBancaireRepository.deleteById(id);
            return true;
        }
        return false;
    }

    public CompteBancaire getCompteById(int id) {
        Optional<CompteBancaire> optionalMovie = compteBancaireRepository.findById(id);
        return optionalMovie.orElse(null);
    }


}
