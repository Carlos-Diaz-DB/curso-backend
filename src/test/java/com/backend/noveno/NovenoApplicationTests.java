package com.backend.noveno;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.backend.noveno.entity.Categoria;
import com.backend.noveno.entity.Producto;
import com.backend.noveno.repository.CategoriaRepository;
import com.backend.noveno.repository.ProductoRepository;

@SpringBootTest
class NovenoApplicationTests {

	@Autowired
	ProductoRepository repository;
	
	@Autowired
	CategoriaRepository categoriaRepository;
	
	@Test
	void crearProducto() {
		Producto p = new Producto();
		p.setDescripcion("Camiseta azul talla chica");
		p.setEstatus(true);
		p.setImagen("/home/productos/id-imagen-producto.png");
		p.setNombre("camiseta");
		repository.save(p);
	}
	
	@Test
	void crearCategoria() {
		Categoria cat = new Categoria();
		cat.setDescripcion("Ropa de invierno");
		cat.setEstatus(true);
		cat.setNombre("Invierno");
		categoriaRepository.save(cat);
	}

}
