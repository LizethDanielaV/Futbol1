package co.prueba.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Resultado {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Integer goles;
	private Integer amarillas;
	private Integer rojas;
	
	@ManyToOne
	@JoinColumn(name="seleccion_id")
	private Seleccion seleccion;
	
	@ManyToOne
	@JoinColumn(name="partido_id")
	private Partido partido;
}
