package es.http.service.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Ventas") // en caso que la tabla sea diferente
public class Venta {

	// Atributos de entidad venta
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // busca ultimo valor e incrementa desde id final de db
	private int id;
	@ManyToOne
	@JoinColumn(name = "cajero")
	Cajero cajero;

	@ManyToOne
	@JoinColumn(name = "maquina")
	Maquina maquina;

	@ManyToOne
	@JoinColumn(name = "producto")
	Producto producto;

	// Constructores

	public Venta() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Venta(int id, Cajero cajero, Maquina maquina, Producto producto) {
		this.id = id;
		this.cajero = cajero;
		this.maquina = maquina;
		this.producto = producto;
	}

	// Getters y Setters
	public Cajero getCajero() {
		return cajero;
	}

	public void setCajero(Cajero cajero) {
		this.cajero = cajero;
	}

	public Maquina getMaquina() {
		return maquina;
	}

	public void setMaquina(Maquina maquina) {
		this.maquina = maquina;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	// Método ToString
	@Override
	public String toString() {
		return "Venta [id=" + id + ", cajero=" + cajero + ", maquina=" + maquina + ", producto=" + producto + "]";
	}

}
