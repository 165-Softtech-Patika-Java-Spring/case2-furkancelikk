package com.furkancelik.Case2.cit.service.entityservice;

import com.furkancelik.Case2.cit.dao.CitCityDao;
import com.furkancelik.Case2.cit.entity.CitCity;
import com.furkancelik.Case2.gen.service.GenGenericEntityService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
public class CitCityEntityService extends GenGenericEntityService<CitCity, CitCityDao> {

    public CitCityEntityService(CitCityDao citCityDao) {
        super(citCityDao);
    }

    public CitCity findByPlate(Integer plate) {
        return getDao().findByPlate(plate);
    }
}
