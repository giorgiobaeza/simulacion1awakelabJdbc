package cl.awakelab.simulacion.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import cl.awakelab.simulacion.dao.AgendasDao;
import cl.awakelab.simulacion.dao.EspecialidadesDao;
import cl.awakelab.simulacion.modelo.Agendas;
import cl.awakelab.simulacion.modelo.Especialidades;

@Controller
public class ConsultasControlador {
	
	@Autowired
	EspecialidadesDao ed;
	@Autowired
	AgendasDao ad;
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String obtenerReserva(Model model) {
		List<Especialidades> listaesp = ed.obtenerEspecialidades();
		model.addAttribute("lesp",listaesp);
		List<Agendas> lagenda = ad.obtenerAgendaInicio();
		model.addAttribute("lag",lagenda);
		return "inicio";
	}
	
	@RequestMapping(value="/Reservas", method=RequestMethod.POST)
	public String procesarReserva(Model model, @RequestParam int idEspecialidad) {
		List<Agendas> listaagendas = ad.obtenerAgendas(idEspecialidad);
		model.addAttribute("lag", listaagendas);
		List<Agendas> lagenda = ad.obtenerAgendaInicio();
		List<Especialidades> listaesp = ed.obtenerEspecialidades();
		if(idEspecialidad==0) {
			model.addAttribute("lag",lagenda);
		}
		model.addAttribute("lesp",listaesp);

		return "reservas";
		
	}
}
