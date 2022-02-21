package com.furkancelik.Case2.add.service;

import com.furkancelik.Case2.add.dto.AddAddressDTO;
import com.furkancelik.Case2.add.entity.AddAddress;
import com.furkancelik.Case2.add.mapper.AddAddressMapper;
import com.furkancelik.Case2.add.service.entityservice.AddAddressEntityService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AddAddressService {

    private final AddAddressEntityService addAddressEntityService;
    private final AddAddressMapper addAddressMapper;

    public AddAddress save(AddAddress addAddress){
        return addAddressEntityService.save(addAddress);
    }

    public void delete(AddAddressDTO addAddressDTO) {
        AddAddress addAddress = addAddressEntityService.getByIdWithControl(addAddressDTO.getId());
        addAddressEntityService.delete(addAddress);
    }

    public AddAddress findByID(Long addressID) {
        return addAddressEntityService.getByIdWithControl(addressID);
    }
}
