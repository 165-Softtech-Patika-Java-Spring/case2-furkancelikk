package com.furkancelik.Case2.nei.service;

import com.furkancelik.Case2.nei.entity.NeiNeighborhood;
import com.furkancelik.Case2.nei.service.entityservice.NeiNeighborhoodEntityService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
@RequiredArgsConstructor
public class NeiNeighborhoodService {

    private final NeiNeighborhoodEntityService neiNeighborhoodEntityService;

    public NeiNeighborhood save(NeiNeighborhood neighborhood) {
        return neiNeighborhoodEntityService.save(neighborhood);
    }

    public List<NeiNeighborhood> findAllByDistrictID(Long districtID) {
        List<NeiNeighborhood> neiNeighborhoodList = neiNeighborhoodEntityService.findAllByDistrictID(districtID);
        if (neiNeighborhoodList == null)
            return Collections.emptyList();
        return neiNeighborhoodList;
    }

    public NeiNeighborhood update(NeiNeighborhood neiNeighborhood) {
        NeiNeighborhood neighborhood = neiNeighborhoodEntityService.getByIdWithControl(neiNeighborhood.getId());
        return save(neiNeighborhood);
    }
}
