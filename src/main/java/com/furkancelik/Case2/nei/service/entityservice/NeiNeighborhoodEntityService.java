package com.furkancelik.Case2.nei.service.entityservice;

import com.furkancelik.Case2.gen.service.GenGenericEntityService;
import com.furkancelik.Case2.nei.dao.NeiNeighborhoodDao;
import com.furkancelik.Case2.nei.entity.NeiNeighborhood;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NeiNeighborhoodEntityService extends GenGenericEntityService<NeiNeighborhood, NeiNeighborhoodDao> {

    public NeiNeighborhoodEntityService(NeiNeighborhoodDao neiNeighborhoodDao) {
        super(neiNeighborhoodDao);
    }

    public List<NeiNeighborhood> findAllByDistrictID(Long districtID) {
        return getDao().findAllByDistrictID(districtID);
    }

}
