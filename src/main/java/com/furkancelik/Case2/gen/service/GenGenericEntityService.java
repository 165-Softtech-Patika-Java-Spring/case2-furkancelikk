package com.furkancelik.Case2.gen.service;

import com.furkancelik.Case2.gen.enums.GenErrorMessage;
import com.furkancelik.Case2.gen.exeptions.ItemNotFoundException;
import com.furkancelik.Case2.nei.entity.NeiNeighborhood;
import com.furkancelik.Case2.str.entity.StrStreet;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public abstract class GenGenericEntityService<Entity, Dao extends JpaRepository<Entity, Long>>{

    private final Dao dao;

    public List<Entity> findAll(){
        return dao.findAll();
    }

    public Optional<Entity> findById(Long id){
        return dao.findById(id);
    }

    public Entity getByIdWithControl(Long id) {

        Optional<Entity> entityOptional = findById(id);

        Entity entity;
        if (entityOptional.isPresent()){
            entity = entityOptional.get();
        } else {
            throw new ItemNotFoundException(GenErrorMessage.ITEM_NOT_FOUND);
        }

        return entity;
    }

    public Entity save(Entity entity){
        return dao.save(entity);
    }

    public void delete(Entity entity){
        dao.delete(entity);
    }

    public boolean existById(Long id){
        return dao.existsById(id);
    }

    public Dao getDao(){
        return dao;
    }

}
