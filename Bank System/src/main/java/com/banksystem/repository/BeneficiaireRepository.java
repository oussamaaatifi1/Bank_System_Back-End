package com.banksystem.repository;

import com.banksystem.entity.Beneficiaire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BeneficiaireRepository extends JpaRepository<Beneficiaire, Integer> {
}
