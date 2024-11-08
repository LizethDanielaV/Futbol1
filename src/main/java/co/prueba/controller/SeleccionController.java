package co.prueba.controller;

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

import co.prueba.Models.Resultado;
import co.prueba.Models.Seleccion;
import co.prueba.services.SeleccionService;

@RestController
@RequestMapping("/seleccion")
public class SeleccionController {

	@Autowired
	public SeleccionService seleccionService;
	
	@GetMapping()
	public List<Seleccion> listar(){
		return seleccionService.listar();
	}
	
	@PostMapping()
	public Seleccion create(@RequestBody Seleccion sele) {
		
		Seleccion nuevaSele = seleccionService.create(sele);
		return nuevaSele;
	}
	
	@PutMapping("/{id}")
	public Seleccion update(@PathVariable Integer id, @RequestBody Seleccion seleccion) {
		return seleccionService.update(id, seleccion);
	}
	
	@GetMapping("/{id}")
	public Seleccion get(@PathVariable Integer id) {
		return seleccionService.get(id);
	}
	
	@DeleteMapping("/{id}")
	public Seleccion delete(@PathVariable Integer id) {
		return seleccionService.delete(id);
	}
	
	@GetMapping("/{id}/resultados")
	public List<Resultado> getResultados(@PathVariable Integer id) {
		return seleccionService.get(id).getResultados();
	}
	
	@GetMapping("/grupo/{grupo}")
	public List<Seleccion> getGrupos(@PathVariable String grupo) {
		return seleccionService.seleccionesPorGrupo(grupo);
	}
}
