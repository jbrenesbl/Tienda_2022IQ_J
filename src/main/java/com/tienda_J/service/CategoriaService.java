
package com.tienda_J.service;

import com.tienda_J.domain.Categoria;
import java.util.List;


public interface CategoriaService {
    
    public List<Categoria> getCategorias(boolean activos);
    
    public void save(Categoria categoria);
    
    public void delete(Categoria categoria);
    
    public Categoria getCategoria(Categoria categoria);
    
}
