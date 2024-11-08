package co.prueba.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.prueba.Models.Seleccion;
import co.prueba.repositories.SeleccionRepository;

@Service
public class SeleccionService {

	@Autowired
	public SeleccionRepository seleccionRepository;
	
	public List<Seleccion> listar(){
		return seleccionRepository.findAll();
	}
	
	public Seleccion create(Seleccion sele) {
		return seleccionRepository.save(sele);
	}
	
	public Seleccion update(Integer id, Seleccion seleccion) {
			
			Optional<Seleccion> seleccionOpt =  seleccionRepository.findById(id);
			
			if (seleccionOpt.isPresent()) {
				
				Seleccion seleccionUpd = seleccionOpt.get();
				
				BeanUtils.copyProperties(seleccion, seleccionUpd);
				
				seleccionRepository.save(seleccionUpd);
				
				return seleccionUpd;
			}
			return null;
		}


	public Seleccion get(Integer id) {
		
		Optional<Seleccion> seleccionlOpt =  seleccionRepository.findById(id);
		
		if (seleccionlOpt.isPresent()) {
			return seleccionlOpt.get();
		}
		return null;
	}
	
	public Seleccion delete(Integer id) {
		Optional<Seleccion> seleccionlOpt =  seleccionRepository.findById(id);
		if (seleccionlOpt.isPresent()) {
			
			Seleccion seleccion = seleccionlOpt.get();
			seleccionRepository.delete(seleccion);
			return seleccion;
		}
		
		return null;
	}
	
	public List<Seleccion> seleccionesPorGrupo(String grupo){
		List<Seleccion> todas = seleccionRepository.findAll();
		List<Seleccion> actual = new ArrayList<Seleccion>();
		for (Seleccion sele : todas) {
            if(sele.getGrupo().equals(grupo)) {
            	actual.add(sele);
            }
        }
		return actual;
	}
	
}
