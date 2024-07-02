package com.banksystem.repository;

import com.banksystem.entity.CarteBancaire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarteBancaireRepository extends JpaRepository<CarteBancaire, String> {
}
