
package com.tienda_J.dao;

import com.tienda_J.domain.Articulo;
import org.springframework.data.repository.CrudRepository;


public interface ArticuloDao extends CrudRepository<Articulo, Long> {
    
}
