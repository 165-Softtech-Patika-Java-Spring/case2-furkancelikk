package com.furkancelik.Case2.add.mapper;

import com.furkancelik.Case2.add.dto.AddAddressDTO;
import com.furkancelik.Case2.add.entity.AddAddress;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-02-21T18:07:09+0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.10 (Oracle Corporation)"
)
@Component
public class AddAddressMapperImpl implements AddAddressMapper {

    @Override
    public AddAddress toEntity(AddAddressDTO dto) {
        if ( dto == null ) {
            return null;
        }

        AddAddress addAddress = new AddAddress();

        addAddress.setId( dto.getId() );
        addAddress.setDescription( dto.getDescription() );
        addAddress.setCountryID( dto.getCountryID() );
        addAddress.setCityID( dto.getCityID() );
        addAddress.setDistrictID( dto.getDistrictID() );
        addAddress.setNeighborhoodID( dto.getNeighborhoodID() );
        addAddress.setStreetID( dto.getStreetID() );
        addAddress.setBuildingNumber( dto.getBuildingNumber() );
        addAddress.setDoorNumber( dto.getDoorNumber() );

        return addAddress;
    }

    @Override
    public AddAddressDTO toDto(AddAddress entity) {
        if ( entity == null ) {
            return null;
        }

        AddAddressDTO addAddressDTO = new AddAddressDTO();

        addAddressDTO.setId( entity.getId() );
        addAddressDTO.setDescription( entity.getDescription() );
        addAddressDTO.setCountryID( entity.getCountryID() );
        addAddressDTO.setCityID( entity.getCityID() );
        addAddressDTO.setDistrictID( entity.getDistrictID() );
        addAddressDTO.setNeighborhoodID( entity.getNeighborhoodID() );
        addAddressDTO.setStreetID( entity.getStreetID() );
        addAddressDTO.setBuildingNumber( entity.getBuildingNumber() );
        addAddressDTO.setDoorNumber( entity.getDoorNumber() );

        return addAddressDTO;
    }

    @Override
    public List<AddAddress> toEntity(List<AddAddressDTO> dto) {
        if ( dto == null ) {
            return null;
        }

        List<AddAddress> list = new ArrayList<AddAddress>( dto.size() );
        for ( AddAddressDTO addAddressDTO : dto ) {
            list.add( toEntity( addAddressDTO ) );
        }

        return list;
    }

    @Override
    public List<AddAddressDTO> toDto(List<AddAddress> entity) {
        if ( entity == null ) {
            return null;
        }

        List<AddAddressDTO> list = new ArrayList<AddAddressDTO>( entity.size() );
        for ( AddAddress addAddress : entity ) {
            list.add( toDto( addAddress ) );
        }

        return list;
    }
}
