package com.furkancelik.Case2.add.dto;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;

@Getter
@Setter
public class AddAddressDTO {
    private Long id;
    private String description;
    private Long countryID;
    private Long cityID;
    private Long districtID;
    private Long neighborhoodID;
    private Long streetID;
    private String buildingNumber;
    private String doorNumber;
}
