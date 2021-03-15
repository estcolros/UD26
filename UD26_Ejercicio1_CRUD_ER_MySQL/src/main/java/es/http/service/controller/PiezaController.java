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

import es.http.service.dto.Pieza;
import es.http.service.service.PiezaServiceImpl;

@RestController
@RequestMapping("/api")
public class PiezaController {

	@Autowired
	PiezaServiceImpl piezaServiceImpl;

	@GetMapping("/piezas")
	public List<Pieza> listarPiezas() {
		return piezaServiceImpl.listarPieza();
	}

	@PostMapping("/piezas")
	public Pieza salvarPiezas(@RequestBody Pieza pieza) {

		return piezaServiceImpl.guardarPieza(pieza);
	}

	@GetMapping("/piezas/{id}")
	public Pieza PiezaXID(@PathVariable(name = "id") int id) {

		Pieza Pieza_xid = new Pieza();

		Pieza_xid = piezaServiceImpl.PiezaXID(id);

		// System.out.println("Pieza XID: "+Pieza_xid);

		return Pieza_xid;
	}

	@PutMapping("/pieza/{id}")
	public Pieza actualizarPieza(@PathVariable(name = "id") int id, @RequestBody Pieza pieza) {

		Pieza pieza_seleccionada = new Pieza();
		Pieza pieza_actualizada = new Pieza();

		pieza_seleccionada = piezaServiceImpl.PiezaXID(id);

		pieza_seleccionada.setNombre(pieza.getNombre());

		pieza_actualizada = piezaServiceImpl.actualizarPieza(pieza_seleccionada);

		// System.out.println("El Pieza actualizado es: "+ pieza_actualizada);

		return pieza_actualizada;
	}

	@DeleteMapping("/pieza/{id}")
	public void eliminarPieza(@PathVariable(name = "id") int id) {
		piezaServiceImpl.eliminarPieza(id);
	}

}
