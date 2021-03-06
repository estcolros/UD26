package es.http.service.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "Equipos") // en caso que la tabala sea diferente
public class Equipos {

	// Atributos de entidad equipos
	@Id
	@Column(name = "numserie") // no hace falta si se llama igual
	private String numserie;
	@Column(name = "nombre") // no hace falta si se llama igual
	private String nombre;

	@ManyToOne
	@JoinColumn(name = "facultad")
	Facultad facultad;

	@OneToMany
	@JoinColumn(name = "reserva")
	private List<Reserva> reserva;

	// Constructores

	public Equipos() {

	}

	/**
	 * @param numserie
	 * @param nombre
	 * @param facultad
	 * @param reserva
	 */

	public Equipos(String numserie, String nombre, Facultad facultad, List<Reserva> reserva) {
		this.numserie = numserie;
		this.nombre = nombre;
		this.facultad = facultad;
		this.reserva = reserva;
	}

	// Getters y Setters
	public String getNumserie() {
		return numserie;
	}

	public void setNumserie(String numserie) {
		this.numserie = numserie;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Facultad getFacultad() {
		return facultad;
	}

	public void setFacultad(Facultad facultad) {
		this.facultad = facultad;
	}

	public void setReserva(List<Reserva> reserva) {
		this.reserva = reserva;
	}

	/**
	 * @return the reserva
	 */
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Reserva")
	public List<Reserva> getReserva() {
		return reserva;
	}

	// Método ToString
	@Override
	public String toString() {
		return "Equipos [numserie=" + numserie + ", nombre=" + nombre + ", facultad=" + facultad + ", reserva="
				+ reserva + "]";
	}

}
