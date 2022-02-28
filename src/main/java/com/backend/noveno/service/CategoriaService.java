package com.backend.noveno.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.noveno.entity.Categoria;
import com.backend.noveno.repository.CategoriaRepository;

@Service
public class CategoriaService {

	@Autowired
	CategoriaRepository repository;
	
	public Categoria obtenerCategoriaPorNombre(String nombre) {
		return repository.findByNombreAndEstatusTrue(nombre);
	}
	
	public Boolean agregarCategoria(Categoria entity) {
		try {
			repository.save(entity);
			return true;
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public Boolean actualizarCategoria(Categoria entity) {
		try {
			repository.save(entity);
			return true;
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public Boolean eliminarCategoria(Categoria entity) {
		try {
			repository.delete(entity);
			return true;
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
}
