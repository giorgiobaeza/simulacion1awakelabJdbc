package cl.awakelab.simulacion.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import cl.awakelab.simulacion.dao.AgendasDao;
import cl.awakelab.simulacion.modelo.Agendas;


@RestController
public class RestControlador {
	
	@Autowired
	AgendasDao ad;
	
	@RequestMapping(value="/RestAgendas/{id}",method=RequestMethod.GET, headers = "Accept=application/json")
	public List<Agendas> obtenerRestAgendas(@PathVariable ("id") int idEspecialidad){
		List<Agendas> lagendas = ad.obtenerAgendas(idEspecialidad);
		
		return lagendas;
		
	}

}
