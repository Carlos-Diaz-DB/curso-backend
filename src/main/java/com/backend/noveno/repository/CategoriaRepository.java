package com.backend.noveno.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.backend.noveno.entity.Categoria;

@Repository
public interface CategoriaRepository extends CrudRepository<Categoria, Long>{
	
	Categoria findByNombreAndEstatusTrue(String nombre);

}

