package com.devEntrepreneurFormation.ensembleMamanApi.model;

import com.devEntrepreneurFormation.ensembleMamanApi.model.ConstantDonation.SizeEnum;
import com.devEntrepreneurFormation.ensembleMamanApi.model.ConstantDonation.StateEnum;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
@DiscriminatorValue("CLOTHE")
public class Clothe extends Donation {
    public StateEnum state;
    public SizeEnum size;
}
