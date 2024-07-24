package com.devEntrepreneurFormation.ensembleMamanApi.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.devEntrepreneurFormation.ensembleMamanApi.model.Donation;
import com.devEntrepreneurFormation.ensembleMamanApi.repository.DonationRepository;

@Component
public class DonationService {
    @Autowired
    DonationRepository donationRepository;

    public Iterable<Donation> getAllDonation(){
       return donationRepository.findAll();
    }
}
