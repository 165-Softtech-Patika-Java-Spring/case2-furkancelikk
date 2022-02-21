package com.furkancelik.Case2.cit.entity;

import com.furkancelik.Case2.cou.entity.CouCountry;
import com.furkancelik.Case2.dis.entity.DisDistrict;
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
@Table(name = "CITY")
public class CitCity {

    @Id
    @GeneratedValue(generator = "CITY")
    @SequenceGenerator(name = "CITY", sequenceName = "CITY_ID_SEQ")
    private Long id;

    @Column(name = "NAME", length = 30)
    private String name;

    @Column(name = "PLATE")
    private Integer plate;

    @Column(name = "ID_COUNTRY")
    private Long countryID;

}
