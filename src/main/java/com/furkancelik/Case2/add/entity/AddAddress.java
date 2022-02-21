package com.furkancelik.Case2.add.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "ADDRESS")
public class AddAddress {

    @Id
    @GeneratedValue(generator = "ADDRESS")
    @SequenceGenerator(name = "ADDRESS", sequenceName = "ADDRESS_ID_SEQ")
    private Long id;

    @Column(name = "DESCRIPTION", length = 254)
    private String description;

    @Column(name = "ID_COUNTRY", nullable = false)
    private Long countryID;

    @Column(name = "ID_CITY", nullable = false)
    private Long cityID;

    @Column(name = "ID_DISTRICT", nullable = false)
    private Long districtID;

    @Column(name = "ID_NEIGHBORHOOD", nullable = false)
    private Long neighborhoodID;

    @Column(name = "ID_STREET", nullable = false)
    private Long streetID;

    @Column(name = "BUILDING_NUMBER", nullable = false)
    private String buildingNumber;

    @Column(name = "DOOR_NUMBER", nullable = false)
    private String doorNumber;

}
