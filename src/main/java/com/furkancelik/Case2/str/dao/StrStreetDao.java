package com.furkancelik.Case2.str.dao;

import com.furkancelik.Case2.str.entity.StrStreet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StrStreetDao extends JpaRepository<StrStreet, Long> {
    List<StrStreet> findAllByNeighborhoodID(Long neighborhoodId);
}
