package co.prueba.Models;

import java.time.LocalDate;
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
public class Partido {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private LocalDate fecha; 
	
	@JsonIgnore
	@OneToMany(mappedBy="partido", cascade=CascadeType.ALL)
	List<Resultado> resultados;
	
	@ManyToOne
	@JoinColumn(name="estadio_id")
	private Estadio estadio;
	
}
