package com.furkancelik.Case2.str.service.entityservice;

import com.furkancelik.Case2.gen.service.GenGenericEntityService;
import com.furkancelik.Case2.str.dao.StrStreetDao;
import com.furkancelik.Case2.str.entity.StrStreet;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StrStreetEntityService extends GenGenericEntityService<StrStreet, StrStreetDao> {

    public StrStreetEntityService(StrStreetDao strStreetDao) {
        super(strStreetDao);
    }

    public List<StrStreet> findAllByNeighborhoodId(Long neighborhoodId) {
        return getDao().findAllByNeighborhoodID(neighborhoodId);
    }

}
