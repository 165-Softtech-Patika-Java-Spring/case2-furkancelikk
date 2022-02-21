package com.furkancelik.Case2.cit.service;


import com.furkancelik.Case2.cit.entity.CitCity;
import com.furkancelik.Case2.cit.service.entityservice.CitCityEntityService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CitCityService {

    private final CitCityEntityService citCityEntityService;

    public CitCity save(CitCity city) {
        return citCityEntityService.save(city);
    }

    public CitCity findByPlate(Integer plate) {
        return citCityEntityService.findByPlate(plate);
    }
}
