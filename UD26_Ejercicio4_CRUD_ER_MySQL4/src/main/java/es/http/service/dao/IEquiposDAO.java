package es.http.service.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import es.http.service.dto.Equipos;

/**
 * @author Estefania 
 *
 */
public interface IEquiposDAO extends JpaRepository<Equipos, String>{
	
}