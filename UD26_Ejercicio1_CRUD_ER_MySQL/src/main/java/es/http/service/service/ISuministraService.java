package es.http.service.service;

import java.util.List;

import es.http.service.dto.Suministra;

public interface ISuministraService {

	// Metodos del CRUD
	List<Suministra> listarSuministra();// Listar All

	Suministra guardarSuministra(Suministra suministra);// Guarda un Suministra CREATE

	Suministra SuministraXID(int id); // Leer datos de un Suministra READ

	Suministra actualizarSuministra(Suministra suministra); // Actualiza datos del Suministra UPDATE

	void eliminarSuministra(int id);// Elimina el Suministra DELETE

}
