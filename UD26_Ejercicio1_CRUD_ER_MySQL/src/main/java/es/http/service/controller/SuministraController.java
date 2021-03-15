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

import es.http.service.dto.Suministra;
import es.http.service.service.SuministraServiceImpl;

@RestController
@RequestMapping("/api")
public class SuministraController {

	@Autowired
	SuministraServiceImpl suministraServiceImpl;

	@GetMapping("/suministros")
	public List<Suministra> listarSuministra() {
		return suministraServiceImpl.listarSuministra();
	}

	@PostMapping("/suministros")
	public Suministra salvarSuministra(@RequestBody Suministra suministra) {

		return suministraServiceImpl.guardarSuministra(suministra);
	}

	@GetMapping("/suministros/{id}")
	public Suministra SuministraXID(@PathVariable(name = "id") int id) {

		Suministra Suministra_xid = new Suministra();

		Suministra_xid = suministraServiceImpl.SuministraXID(id);

		// System.out.println("Suministra XID: "+Suministra_xid);

		return Suministra_xid;
	}

	@PutMapping("/suministro/{id}")
	public Suministra actualizarSuministra(@PathVariable(name = "id") int id, @RequestBody Suministra suministra) {

		Suministra Suministra_seleccionado = new Suministra();
		Suministra Suministra_actualizado = new Suministra();

		Suministra_seleccionado = suministraServiceImpl.SuministraXID(id);

		Suministra_seleccionado.setPieza(suministra.getPieza());
		Suministra_seleccionado.setProveedor(suministra.getProveedor());
		Suministra_seleccionado.setPrecio(suministra.getPrecio());

		Suministra_actualizado = suministraServiceImpl.actualizarSuministra(Suministra_seleccionado);

		// System.out.println("El Suministra actualizado es: "+ Suministra_actualizado);

		return Suministra_actualizado;
	}

	@DeleteMapping("/suministro/{id}")
	public void eliminarSuministra(@PathVariable(name = "id") int id) {
		suministraServiceImpl.eliminarSuministra(id);
	}

}
