package com.furkancelik.Case2.dis.entity;

import com.furkancelik.Case2.cit.entity.CitCity;
import com.furkancelik.Case2.nei.entity.NeiNeighborhood;
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
@Table(name = "DISTRICT")
public class DisDistrict {

    @Id
    @GeneratedValue(generator = "DISTRICT")
    @SequenceGenerator(name = "DISTRICT", sequenceName = "DISTRICT_ID_SEQ")
    private Long id;

    @Column(name = "NAME", length = 30)
    private String name;

    @Column(name = "ID_CITY")
    private Long cityID;

}
