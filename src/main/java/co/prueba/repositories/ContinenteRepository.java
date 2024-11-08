package co.prueba.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.prueba.Models.Continente;

@Repository
public interface ContinenteRepository extends JpaRepository<Continente, Integer> {

}
