package com.backend.noveno.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.backend.noveno.entity.Producto;

@FeignClient(value="feignDemo", url="localhost:8080/producto")
public interface VentaService {

	@GetMapping("todos")
	List<Producto> obtenerTodos();
}
