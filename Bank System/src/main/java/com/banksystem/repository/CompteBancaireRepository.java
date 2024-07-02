package com.banksystem.repository;

import com.banksystem.entity.CompteBancaire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompteBancaireRepository extends JpaRepository<CompteBancaire, Integer> {
}
