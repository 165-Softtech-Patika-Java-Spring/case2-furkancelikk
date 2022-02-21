package com.furkancelik.Case2.nei.dao;

import com.furkancelik.Case2.nei.entity.NeiNeighborhood;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NeiNeighborhoodDao extends JpaRepository<NeiNeighborhood, Long> {
    List<NeiNeighborhood> findAllByDistrictID(Long districtID);
}
