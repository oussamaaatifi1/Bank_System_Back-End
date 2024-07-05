package com.banksystem.repository;

import com.banksystem.dto.CarteBancaireDTO;
import com.banksystem.entity.CarteBancaire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CarteBancaireRepository extends JpaRepository<CarteBancaire, String> {
}
