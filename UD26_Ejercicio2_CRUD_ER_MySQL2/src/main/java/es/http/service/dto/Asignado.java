package es.http.service.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "AsignadoA") // en caso que la tabala sea diferente
public class Asignado {

	// Atributos de entidad registro_curso
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // busca ultimo valor e incrementa desde id final de db
	private String id;
	@ManyToOne
	@JoinColumn(name = "cientifico")
	Cientifico cientifico;

	@ManyToOne
	@JoinColumn(name = "proyecto")
	Proyecto proyecto;

	// Constructores

	public Asignado() {

	}
	
	public Asignado(String id, Cientifico cientifico, Proyecto proyecto) {

		this.id = id;
		this.cientifico = cientifico;
		this.proyecto = proyecto;
	}

	// Getters y Setters

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}


	public Cientifico getCientifico() {
		return cientifico;
	}

	public void setCientifico(Cientifico cientifico) {
		this.cientifico = cientifico;
	}

	public Proyecto getProyecto() {
		return proyecto;
	}

	public void setProyecto(Proyecto proyecto) {
		this.proyecto = proyecto;
	}

	@Override
	public String toString() {
		return "Asignado [id=" + id + ", cientifico=" + cientifico + ", proyecto=" + proyecto + "]";
	}

}
