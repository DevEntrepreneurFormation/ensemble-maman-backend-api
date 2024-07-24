package com.devEntrepreneurFormation.ensembleMamanApi.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devEntrepreneurFormation.ensembleMamanApi.model.Donation;

@Repository
public interface DonationRepository extends JpaRepository<Donation, Long> {} 
