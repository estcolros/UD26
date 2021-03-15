package es.http.service.service;

import java.util.List;

import es.http.service.dto.Asignado;

public interface IAsignadoService {

	//Metodos del CRUD
		public List<Asignado> listarAsignado(); //Listar All 
		
		public Asignado guardarAsignado(Asignado asignado);	//Guarda un Asignado CREATE
		
		public Asignado asignadoXID(String id); //Leer datos de un Asignado READ
		
		public Asignado actualizarAsignado(Asignado asignado); //Actualiza datos del Asignado UPDATE
		
		public void eliminarAsignado(String id);// Elimina el Asignado DELETE
	
}

