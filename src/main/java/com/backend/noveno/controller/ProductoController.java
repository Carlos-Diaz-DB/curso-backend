package com.backend.noveno.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backend.noveno.entity.Producto;
import com.backend.noveno.service.ProductoService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;

@RestController
@RequestMapping("/producto")
@Api(tags="producto")
public class ProductoController {

	@Autowired
	ProductoService service;
	
	@GetMapping(value="/nombre/{nombre}")
	@ApiOperation(value="ontiene los productos mediante el nombre")
	@ApiResponses(value= { @ApiResponse(code=200,message="Producto devuelto correctamente"),
			@ApiResponse(code=404, message="Producto no encontrado")})
	public Producto obtenerProductoPorNombre(
			@ApiParam(value = "nombre del producto") 
			@PathVariable("nombre") String nombre) {
		return service.obtenerProductoPorNombre(nombre);
	}
	
	@GetMapping(value="/todos")
	@ApiOperation(value="ontiene los productos mediante el nombre")
	public List<Producto> obtenerTodos() {
		return service.obtenerTodos();
	}
	
	@PostMapping
	@ApiOperation(value="agregar un producto")
	public Boolean agregarProducto(
			@ApiParam(value = "objeto producto") 
			@RequestBody Producto entity) {
		System.err.print(entity);
		try {
			return service.agregarProducto(entity);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	@PutMapping
	@ApiOperation(value="actualizar un producto")
	public Boolean actualizarProducto(
			@ApiParam(value = "objeto producto")
			@RequestBody Producto entity) {
		return service.actualizarProducto(entity);
	}
	
	@DeleteMapping
	@ApiOperation(value="eliminar un producto")
	public Boolean eliminarProducto(
			@ApiParam(value = "objeto producto")
			@RequestBody Producto entity) {
		return service.eliminarProducto(entity);
	}
}
