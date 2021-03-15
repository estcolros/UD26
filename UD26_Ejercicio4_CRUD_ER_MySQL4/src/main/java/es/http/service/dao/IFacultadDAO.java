package es.http.service.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import es.http.service.dto.Facultad;

/**
 * @author Estefania
 *
 */
public interface IFacultadDAO extends JpaRepository<Facultad, Integer>{
	
}