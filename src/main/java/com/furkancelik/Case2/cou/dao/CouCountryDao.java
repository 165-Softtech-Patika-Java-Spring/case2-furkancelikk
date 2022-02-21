package com.furkancelik.Case2.cou.dao;

import com.furkancelik.Case2.cou.entity.CouCountry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CouCountryDao extends JpaRepository<CouCountry, Long> {
    CouCountry findByCountryCode(String code);
}
