package com.furkancelik.Case2.cit.dao;

import com.furkancelik.Case2.cit.entity.CitCity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CitCityDao extends JpaRepository<CitCity, Long> {
    CitCity findByPlate(Integer plate);
}
