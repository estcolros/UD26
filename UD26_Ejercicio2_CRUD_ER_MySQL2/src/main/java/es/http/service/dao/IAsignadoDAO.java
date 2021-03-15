package es.http.service.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import es.http.service.dto.Asignado;

/**
 * @author Estefania 
 *
 */
public interface IAsignadoDAO extends JpaRepository<Asignado, String>{
	
}