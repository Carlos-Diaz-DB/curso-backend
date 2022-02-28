package com.backend.noveno.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backend.noveno.entity.Categoria;
import com.backend.noveno.service.CategoriaService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {

	@Autowired
	CategoriaService service;
	
	@GetMapping(value="/nombre/{nombre}")
	@ApiOperation(value="obtener por nombre")
	public Categoria obtenerCategoriaPorNombre(
			@ApiParam(value = "objeto producto") 
			@PathVariable("nombre") String nombre) {
		return service.obtenerCategoriaPorNombre(nombre);
	}
	
	@PostMapping(consumes = {MediaType.APPLICATION_JSON_VALUE})
	@ApiOperation(value="agregar una categoria")
	public Boolean agregarCategoria(
			@ApiParam(value = "objeto categoria")
			@RequestBody Categoria entity) {
		return service.agregarCategoria(entity);
	}
	
	@PutMapping
	@ApiOperation(value="actualizar una categoria")
	public Boolean actualizarCategoria(
			@ApiParam(value = "objeto categoria")
			@RequestBody Categoria entity) {
		return service.actualizarCategoria(entity);
	}
	
	@DeleteMapping
	@ApiOperation(value="eliminar una categoria")
	public Boolean eliminarCategoria(
			@ApiParam(value = "objeto categoria")
			@RequestBody Categoria entity) {
		return service.eliminarCategoria(entity);
	}
}
