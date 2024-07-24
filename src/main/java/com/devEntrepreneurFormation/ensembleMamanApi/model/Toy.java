package com.devEntrepreneurFormation.ensembleMamanApi.model;

import com.devEntrepreneurFormation.ensembleMamanApi.model.ConstantDonation.AgeEnum;
import com.devEntrepreneurFormation.ensembleMamanApi.model.ConstantDonation.StateEnum;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Data;


@Data
@Entity
@DiscriminatorValue("TOY")
public class Toy  extends Donation{
    public StateEnum state;
    public AgeEnum age;
}
