package com.devEntrepreneurFormation.ensembleMamanApi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devEntrepreneurFormation.ensembleMamanApi.model.Donation;
import com.devEntrepreneurFormation.ensembleMamanApi.service.DonationService;

@RestController
public class DonationController {
    @Autowired
    DonationService donationService;

    @GetMapping("/donations")
    public Iterable<Donation> getAllDonation(){
        return donationService.getAllDonation();
    }
}
