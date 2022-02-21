package com.furkancelik.Case2.cou.service;

import com.furkancelik.Case2.cou.entity.CouCountry;
import com.furkancelik.Case2.cou.service.entityservice.CouCountryEntityService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CouCountryService {

    private final CouCountryEntityService couCountryEntityService;

    public CouCountry save(CouCountry country) {
        return couCountryEntityService.save(country);
    }

    public List<CouCountry> findAll() {
        return couCountryEntityService.findAll();
    }

    public CouCountry findById(Long id) {
        Optional<CouCountry> optionalCouCountry = couCountryEntityService.findById(id);
        if (optionalCouCountry.isPresent()){
            CouCountry couCountry = optionalCouCountry.get();
            return couCountry;
        }
        return null;
    }

    public CouCountry findByCode(String code) {
        return couCountryEntityService.findByCountryCode(code);
    }
}
