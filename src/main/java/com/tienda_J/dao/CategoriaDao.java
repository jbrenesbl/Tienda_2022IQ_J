
package com.tienda_J.dao;

import com.tienda_J.domain.Categoria;
import org.springframework.data.repository.CrudRepository;


public interface CategoriaDao extends CrudRepository<Categoria, Long> {
    
}
