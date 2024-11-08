package co.prueba.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.prueba.Models.Estadio;

@Repository
public interface EstadioRepository extends JpaRepository<Estadio, Integer> {

}
