package co.prueba.Models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class Seleccion {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nombre;
	private String grupo;
	
	@ManyToOne
	@JoinColumn(name="continente_id")
	private Continente continente;
	
	@JsonIgnore
	@OneToMany(mappedBy="seleccion", cascade=CascadeType.ALL)
	List<Resultado> resultados;
}
