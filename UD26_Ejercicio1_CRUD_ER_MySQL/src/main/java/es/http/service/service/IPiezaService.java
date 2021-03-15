package es.http.service.service;

import java.util.List;

import es.http.service.dto.Pieza;

public interface IPiezaService {

	// Metodos del CRUD

	List<Pieza> listarPieza();// Listar All

	Pieza guardarPieza(Pieza pieza);// Guarda un pieza CREATE

	Pieza PiezaXID(int id); // Leer datos de un pieza READ

	Pieza actualizarPieza(Pieza pieza); // Actualiza datos del pieza UPDATE

	void eliminarPieza(int id);// Elimina el pieza DELETE

}
