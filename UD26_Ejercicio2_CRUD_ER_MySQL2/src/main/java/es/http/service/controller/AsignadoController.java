package es.http.service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import es.http.service.dto.Asignado;
import es.http.service.service.AsignadoServiceImpl;

@RestController
@RequestMapping("/api")
public class AsignadoController {
	
	@Autowired
	AsignadoServiceImpl asignadoServiceImpl;
	
	@GetMapping("/asignados")
	public List<Asignado> listarAsignado(){
		return asignadoServiceImpl.listarAsignado();
	}
	
	
	@PostMapping("/asignados")
	public Asignado salvarAsignado(@RequestBody Asignado asignado) {
		
		return asignadoServiceImpl.guardarAsignado(asignado);
	}
	
	
	@GetMapping("/asignados/{id}")
	public Asignado AsignadoXID(@PathVariable(name="id") String id) {
		
		Asignado Asignado_xid= new Asignado();
		
		Asignado_xid=asignadoServiceImpl.asignadoXID(id);
		
		//System.out.println("Asignado XID: "+Asignado_xid);
		
		return Asignado_xid;
	}
	
	@PutMapping("/asignado/{id}")
	public Asignado actualizarAsignado(@PathVariable(name="id")String id,@RequestBody Asignado Asignado) {
		
		Asignado Asignado_seleccionado= new Asignado();
		Asignado Asignado_actualizado= new Asignado();
		
		Asignado_seleccionado= asignadoServiceImpl.asignadoXID(id);
		
		
		Asignado_seleccionado.setCientifico(Asignado.getCientifico());
		Asignado_seleccionado.setProyecto(Asignado.getProyecto());
		
		Asignado_actualizado = asignadoServiceImpl.actualizarAsignado(Asignado_seleccionado);
		
		System.out.println("El Asignado actualizado es: "+ Asignado_actualizado);
		
		return Asignado_actualizado;
	}
	
	@DeleteMapping("/asignado/{id}")
	public void eliminarAsignado(@PathVariable(name="id")String id) {
		asignadoServiceImpl.eliminarAsignado(id);
	}
	
	
}
