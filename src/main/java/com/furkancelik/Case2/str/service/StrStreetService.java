package com.furkancelik.Case2.str.service;

import com.furkancelik.Case2.str.entity.StrStreet;
import com.furkancelik.Case2.str.service.entityservice.StrStreetEntityService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
@RequiredArgsConstructor
public class StrStreetService {

    private final StrStreetEntityService strStreetEntityService;

    public StrStreet save(StrStreet street) {
        return strStreetEntityService.save(street);
    }

    public List<StrStreet> findAllByNeighborhoodId(Long neighborhoodId) {
        List<StrStreet> strStreetList = strStreetEntityService.findAllByNeighborhoodId(neighborhoodId);
        if (strStreetList == null)
            return Collections.emptyList();
        return strStreetList;
    }

    public StrStreet update(StrStreet strStreet) {
        StrStreet street = strStreetEntityService.getByIdWithControl(strStreet.getId());
        return save(strStreet);
    }
}
