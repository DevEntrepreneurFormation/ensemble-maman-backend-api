
package com.devEntrepreneurFormation.ensembleMamanApi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;


import com.devEntrepreneurFormation.ensembleMamanApi.model.ConstantDonation.GenderEnum;
import com.devEntrepreneurFormation.ensembleMamanApi.model.ConstantDonation.TypeDonationEnum;

@Data
@Entity
@Table(name = "donations")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type_donation")
public class Donation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    public String name;

    @Column(name="image_url")
    public String imageUrl;

    public int quantity;
    public GenderEnum gender;
    

    Donation(){}

   
}

