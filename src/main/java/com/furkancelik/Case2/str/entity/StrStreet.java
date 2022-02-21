package com.furkancelik.Case2.str.entity;

import com.furkancelik.Case2.nei.entity.NeiNeighborhood;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "STREET")
public class StrStreet {

    @Id
    @GeneratedValue(generator = "STREET")
    @SequenceGenerator(name = "STREET", sequenceName = "STREET_ID_SEQ")
    private Long id;

    @Column(name = "NAME", length = 30)
    private String name;

    @Column(name = "ID_NEIGHBORHOOD")
    private Long neighborhoodID;
}
