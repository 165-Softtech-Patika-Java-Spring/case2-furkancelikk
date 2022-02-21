package com.furkancelik.Case2.add.service.entityservice;

import com.furkancelik.Case2.add.dao.AddAddressDao;
import com.furkancelik.Case2.add.entity.AddAddress;
import com.furkancelik.Case2.gen.service.GenGenericEntityService;
import org.springframework.stereotype.Service;

@Service
public class AddAddressEntityService extends GenGenericEntityService<AddAddress, AddAddressDao> {


    public AddAddressEntityService(AddAddressDao addAddressDao) {
        super(addAddressDao);
    }
}
