package es.http.service.service;

import java.util.List;

import es.http.service.dto.Proveedor;

public interface IProveedorService {

	// Metodos del CRUD
	List<Proveedor> listarProveedores(); // Listar All

	Proveedor guardarProveedor(Proveedor proveedor); // Guarda un Proveedor CREATE

	Proveedor ProveedorXID(String id); // Leer datos de un Proveedor READ

	Proveedor actualizarProveedor(Proveedor proveedor);// Actualiza datos del proveedor UPDATE

	void eliminarProveedor(String id);// Elimina el proveedor DELETE
}
