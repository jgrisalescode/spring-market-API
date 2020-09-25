package com.pincelab.market.persistence.crud;

import com.pincelab.market.persistence.entity.Producto;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> {
    /*
        Using QueryMethods see all in:
        https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#jpa.query-methods
     */

    List<Producto> findByIdCategoriaOrderByNombreAsc(int idCategoria);
    Optional<List<Producto>> findByCantidadStockLessThanAndEstado(int cantidadStock, boolean estado);

}
