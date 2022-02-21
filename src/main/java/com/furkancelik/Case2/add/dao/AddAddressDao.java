package com.furkancelik.Case2.add.dao;

import com.furkancelik.Case2.add.entity.AddAddress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddAddressDao extends JpaRepository<AddAddress, Long> {
}
