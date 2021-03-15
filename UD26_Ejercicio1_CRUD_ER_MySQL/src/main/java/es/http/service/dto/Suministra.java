package es.http.service.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Suministra") // en caso que la tabla sea diferente
public class Suministra {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // busca ultimo valor e incrementa desde id final de db
	private int id;

	@ManyToOne
	@JoinColumn(name = "proveedorid")
	Proveedor proveedor;

	@ManyToOne
	@JoinColumn(name = "codigopieza")
	Pieza pieza;

	@Column(name = "precio") // no hace falta si se llama igual
	private int precio;

	// Constructores
	/**
	 * 
	 */
	public Suministra() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param proveedor
	 * @param pieza
	 * @param registeredAt
	 * @param precio
	 */
	public Suministra(int id, Proveedor proveedor, Pieza pieza, int precio) {
		super();
		this.id = id;
		this.proveedor = proveedor;
		this.pieza = pieza;
		this.precio = precio;
	}

	// Getters y Setters
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the proveedor
	 */
	public Proveedor getProveedor() {
		return proveedor;
	}

	/**
	 * @param proveedor the proveedor to set
	 */
	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}

	/**
	 * @return the pieza
	 */
	public Pieza getPieza() {
		return pieza;
	}

	/**
	 * @param pieza the pieza to set
	 */
	public void setPieza(Pieza pieza) {
		this.pieza = pieza;
	}

	/**
	 * @return the precio
	 */
	public int getPrecio() {
		return precio;
	}

	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(int precio) {
		this.precio = precio;
	}

	// Método ToString
	@Override
	public String toString() {
		return "Suministra [id=" + id + ", proveedor=" + proveedor + ", pieza=" + pieza + " +  precio=" + precio + "]";
	}

}
