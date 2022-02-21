package com.furkancelik.Case2.cou.entity;

import com.furkancelik.Case2.cit.entity.CitCity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@Table(name = "COUNTRY")
public class CouCountry {

    @Id
    @GeneratedValue(generator = "COUNTRY")
    @SequenceGenerator(name = "COUNTRY", sequenceName = "COUNTRY_ID_SEQ")
    private Long id;

    @Column(name = "NAME", length = 30, nullable = false)
    private String name;

    @Column(name = "COUNTRY_CODE", nullable = false)
    private String countryCode;

}
