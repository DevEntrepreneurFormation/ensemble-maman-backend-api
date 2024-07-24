package com.devEntrepreneurFormation.ensembleMamanApi.model;

import java.time.LocalDateTime;

import com.devEntrepreneurFormation.ensembleMamanApi.model.ConstantDonation.HygieneCategoryEnum;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Data;
@Data
@Entity
@DiscriminatorValue("HYGIENE")
public class Hygiene extends Donation {
    @Column(name = "date_expiration")
    public String dateExpiration;
    public HygieneCategoryEnum category;

    Hygiene(){}

}
