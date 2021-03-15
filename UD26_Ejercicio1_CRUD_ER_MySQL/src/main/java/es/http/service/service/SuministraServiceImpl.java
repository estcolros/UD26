package es.http.service.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.http.service.dao.ISuministraDAO;
import es.http.service.dto.Suministra;

//Implementamos los métodos del service.
@Service
public class SuministraServiceImpl implements ISuministraService {

	@Autowired
	ISuministraDAO ISuministraDAO;

	@Override
	public List<Suministra> listarSuministra() {
		return ISuministraDAO.findAll();
	}

	@Override
	public Suministra guardarSuministra(Suministra suministra) {
		return ISuministraDAO.save(suministra);
	}

	@Override
	public Suministra SuministraXID(int id) {
		return ISuministraDAO.findById(id).get();
	}

	@Override
	public Suministra actualizarSuministra(Suministra suministra) {
		return ISuministraDAO.save(suministra);
	}

	@Override
	public void eliminarSuministra(int id) {
		ISuministraDAO.deleteById(id);
	}

}
