package co.prueba.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.prueba.Models.Resultado;


@Repository
public interface ResultadoRepository  extends JpaRepository<Resultado, Integer>{

}
