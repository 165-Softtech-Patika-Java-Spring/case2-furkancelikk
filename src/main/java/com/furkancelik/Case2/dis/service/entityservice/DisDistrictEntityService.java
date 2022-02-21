package com.furkancelik.Case2.dis.service.entityservice;

import com.furkancelik.Case2.dis.dao.DisDistrictDao;
import com.furkancelik.Case2.dis.entity.DisDistrict;
import com.furkancelik.Case2.gen.service.GenGenericEntityService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DisDistrictEntityService extends GenGenericEntityService<DisDistrict, DisDistrictDao> {


    public DisDistrictEntityService(DisDistrictDao disDistrictDao) {
        super(disDistrictDao);
    }

    public List<DisDistrict> findAllByCityID(Long cityID) {
        return getDao().findAllByCityID(cityID);
    }
}
