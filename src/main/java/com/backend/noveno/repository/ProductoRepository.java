package com.backend.noveno.repository;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.backend.noveno.entity.Producto;

@Repository
public interface ProductoRepository extends CrudRepository<Producto, Long>{
	
	Producto findByNombreAndEstatusTrue(String nombre);
	
	List<Producto> findByEstatusTrue();

}
