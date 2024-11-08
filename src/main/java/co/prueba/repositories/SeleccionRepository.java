package co.prueba.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.prueba.Models.Seleccion;

@Repository
public interface SeleccionRepository extends JpaRepository<Seleccion, Integer>{

}
