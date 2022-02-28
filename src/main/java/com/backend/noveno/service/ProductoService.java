package com.backend.noveno.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.noveno.entity.Producto;
import com.backend.noveno.repository.ProductoRepository;

@Service
public class ProductoService {

	@Autowired
	ProductoRepository repository;
	
	public Producto obtenerProductoPorNombre(String nombre) {
		return repository.findByNombreAndEstatusTrue(nombre);
	}
	
	public List<Producto> obtenerTodos() {
		return repository.findByEstatusTrue();
	}
	
	public Boolean agregarProducto(Producto entity) {
		try {
			repository.save(entity);
			return true;
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public Boolean actualizarProducto(Producto entity) {
		try {
			repository.save(entity);
			return true;
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public Boolean eliminarProducto(Producto entity) {
		try {
			repository.delete(entity);
			return true;
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}
}
