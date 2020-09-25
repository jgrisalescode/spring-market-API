package com.pincelab.market.persistence;

import com.pincelab.market.persistence.crud.ProductoCrudRepository;
import com.pincelab.market.persistence.entity.Producto;

import java.util.List;

public class ProductoRepository {

    private ProductoCrudRepository productoCrudRepository;

    public List<Producto> getAll(){
        return (List<Producto>) productoCrudRepository.findAll();
    }
}
