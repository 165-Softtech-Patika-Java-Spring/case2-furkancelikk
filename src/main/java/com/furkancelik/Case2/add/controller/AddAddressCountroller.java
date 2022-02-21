package com.furkancelik.Case2.add.controller;

import com.furkancelik.Case2.add.dto.AddAddressDTO;
import com.furkancelik.Case2.add.entity.AddAddress;
import com.furkancelik.Case2.add.service.AddAddressService;
import com.furkancelik.Case2.cit.entity.CitCity;
import com.furkancelik.Case2.cit.service.CitCityService;
import com.furkancelik.Case2.cou.entity.CouCountry;
import com.furkancelik.Case2.cou.service.CouCountryService;
import com.furkancelik.Case2.dis.entity.DisDistrict;
import com.furkancelik.Case2.dis.service.DisDistrictService;
import com.furkancelik.Case2.nei.entity.NeiNeighborhood;
import com.furkancelik.Case2.nei.service.NeiNeighborhoodService;
import com.furkancelik.Case2.str.entity.StrStreet;
import com.furkancelik.Case2.str.service.StrStreetService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/address")
@RequiredArgsConstructor
public class AddAddressCountroller {

    private final CouCountryService couCountryService;
    private final CitCityService citCityService;
    private final DisDistrictService disDistrictService;
    private final NeiNeighborhoodService neiNeighborhoodService;
    private final StrStreetService strStreetService;
    private final AddAddressService addAddressService;

    //   1.  ------------------------------------------------------

    @PostMapping("/saveCountry")
    public CouCountry saveCountry(@RequestBody CouCountry country){
        return couCountryService.save(country);
    }

    //   2.  ------------------------------------------------------

    @GetMapping("/getCountryByCode/{code}")
    public CouCountry getCountryById(@PathVariable String code){
        CouCountry couCountry = couCountryService.findByCode(code);
        return couCountry;
    }

    //   3.  ------------------------------------------------------

    @PostMapping("/saveCity")
    public CitCity saveCity(@RequestBody CitCity city){
        return citCityService.save(city);
    }

    //   4.  ------------------------------------------------------

    @GetMapping("/getCityByPlate/{plate}")
    public CitCity getCityByPlate(@PathVariable Integer plate){
        CitCity citCity = citCityService.findByPlate(plate);
        return citCity;
    }

    //   5.  ------------------------------------------------------

    @PostMapping("/saveDistrict")
    public DisDistrict saveDistrict(@RequestBody DisDistrict district){
        return disDistrictService.save(district);
    }

    //   6.  ------------------------------------------------------

    @GetMapping("/getDistrictsByCityId/{cityID}")
    public List<DisDistrict> getDistrictsByCityId(@PathVariable Long cityID){
        return disDistrictService.findAllByCityID(cityID);
    }

    //   7.  ------------------------------------------------------

    @PostMapping("/saveNeighborhood")
    public NeiNeighborhood saveNeighborhood(@RequestBody NeiNeighborhood neighborhood){
        return neiNeighborhoodService.save(neighborhood);
    }

    //   8.  ------------------------------------------------------

    @PutMapping("/updateNeighborhood")
    public NeiNeighborhood updateNeighborhood(@RequestBody NeiNeighborhood neighborhood){
        return neiNeighborhoodService.update(neighborhood);
    }

    //   9.  ------------------------------------------------------

    @GetMapping("/getNeighborhoodsByDistrictId/{districtID}")
    public List<NeiNeighborhood> getDistrictByCityId(@PathVariable Long districtID){
        return neiNeighborhoodService.findAllByDistrictID(districtID);
    }

    //   10.  ------------------------------------------------------

    @PostMapping("/saveStreet")
    public StrStreet saveStreet(@RequestBody StrStreet street){
        return strStreetService.save(street);
    }

    //   11.  ------------------------------------------------------

    @PutMapping("/updateStreet")
    public StrStreet updateStreet(@RequestBody StrStreet strStreet){
        return strStreetService.update(strStreet);
    }

    //   12.  ------------------------------------------------------

    @GetMapping("/getStreetsByNeighborhoodId/{neighborhoodId}")
    public List<StrStreet> getStreetsByNeighborhoodId(@PathVariable Long neighborhoodId){
        return strStreetService.findAllByNeighborhoodId(neighborhoodId);
    }

    //   13.  ------------------------------------------------------

    @PostMapping("/saveAddress")
    public AddAddress saveAddress(@RequestBody AddAddress addAddress){
        return addAddressService.save(addAddress);
    }

    //   14.  ------------------------------------------------------

    @DeleteMapping("/deleteAddress")
    public void deleteAddress(@RequestBody AddAddressDTO addAddressDTO){
        addAddressService.delete(addAddressDTO);
    }

    //   15.  ------------------------------------------------------

    @GetMapping("/getAddressById/{addressID}")
    public AddAddress getAddressById(@PathVariable Long addressID){
        return addAddressService.findByID(addressID);
    }


}
