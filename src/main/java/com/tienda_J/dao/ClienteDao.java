
package com.tienda_J.dao;

import com.tienda_J.domain.Cliente;
import org.springframework.data.repository.CrudRepository;


public interface ClienteDao extends CrudRepository<Cliente, Long> {

}
