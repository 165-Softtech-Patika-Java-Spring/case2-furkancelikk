package com.furkancelik.Case2.dis.service;

import com.furkancelik.Case2.dis.entity.DisDistrict;
import com.furkancelik.Case2.dis.service.entityservice.DisDistrictEntityService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
@RequiredArgsConstructor
public class DisDistrictService {

    private final DisDistrictEntityService disDistrictEntityService;

    public DisDistrict save(DisDistrict district) {
        return disDistrictEntityService.save(district);
    }

    public List<DisDistrict> findAllByCityID(Long cityID) {

        List<DisDistrict> disDistrictList = disDistrictEntityService.findAllByCityID(cityID);
        if (disDistrictList == null)
            return Collections.emptyList();
        return disDistrictList;
    }
}
