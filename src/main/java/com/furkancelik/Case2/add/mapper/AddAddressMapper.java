package com.furkancelik.Case2.add.mapper;

import com.furkancelik.Case2.add.dto.AddAddressDTO;
import com.furkancelik.Case2.add.entity.AddAddress;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface AddAddressMapper {
    AddAddress toEntity(AddAddressDTO dto);

    AddAddressDTO toDto(AddAddress entity);

    List<AddAddress> toEntity(List<AddAddressDTO> dto);

    List<AddAddressDTO> toDto(List<AddAddress> entity);
}
