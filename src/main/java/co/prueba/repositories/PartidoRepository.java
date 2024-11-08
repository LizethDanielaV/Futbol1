package co.prueba.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.prueba.Models.Partido;

@Repository
public interface PartidoRepository  extends JpaRepository<Partido, Integer>{

}
