package com.furkancelik.Case2.dis.dao;

import com.furkancelik.Case2.dis.entity.DisDistrict;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DisDistrictDao extends JpaRepository<DisDistrict, Long> {

    List<DisDistrict> findAllByCityID(Long cityID);
}
