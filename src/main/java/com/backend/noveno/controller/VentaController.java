package com.backend.noveno.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backend.noveno.entity.Producto;
import com.backend.noveno.service.VentaService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/venta")
@Api(tags="venta")
public class VentaController {

	@Autowired
	VentaService service;
	
	@GetMapping(value="/obtenerProductos")
	@ApiOperation(value="ontiene los productos mediante el nombre")
	public List<Producto> obtenerTodos() {
		return service.obtenerTodos();
	}
}
