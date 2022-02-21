package com.furkancelik.Case2.nei.entity;

import com.furkancelik.Case2.dis.entity.DisDistrict;
import com.furkancelik.Case2.str.entity.StrStreet;
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
@Table(name = "NEIGHBORHOOD")
public class NeiNeighborhood {

    @Id
    @GeneratedValue(generator = "NEIGHBORHOOD")
    @SequenceGenerator(name = "NEIGHBORHOOD", sequenceName = "NEIGHBORHOOD_ID_SEQ")
    private Long id;

    @Column(name = "NAME", length = 30)
    private String name;

    @Column(name = "ID_DISTRICT")
    private Long districtID;

}
