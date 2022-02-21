package com.furkancelik.Case2.cou.service.entityservice;

import com.furkancelik.Case2.cou.dao.CouCountryDao;
import com.furkancelik.Case2.cou.entity.CouCountry;
import com.furkancelik.Case2.gen.service.GenGenericEntityService;
import org.springframework.stereotype.Service;

@Service
public class CouCountryEntityService extends GenGenericEntityService<CouCountry, CouCountryDao> {

    public CouCountryEntityService(CouCountryDao couCountryDao) {
        super(couCountryDao);
    }

    public CouCountry findByCountryCode(String code) {
        return getDao().findByCountryCode(code);
    }
}
