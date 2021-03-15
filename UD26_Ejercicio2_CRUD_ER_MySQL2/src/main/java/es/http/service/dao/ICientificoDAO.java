package es.http.service.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import es.http.service.dto.Cientifico;

/**
 * @author Estefania
 *
 */
public interface ICientificoDAO extends JpaRepository<Cientifico, String>{
	
}