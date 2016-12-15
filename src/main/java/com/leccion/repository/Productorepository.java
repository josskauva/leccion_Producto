/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leccion.repository;

import com.leccion.dominio.Producto;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author carot
 */
public interface Productorepository extends CrudRepository<Producto, Integer> {
    @Query(value = "select * from producto where cantidad >=?1", nativeQuery=true)
	public List<Producto> getproductobyProducto(int cantidad);
        
        
        
        
}
