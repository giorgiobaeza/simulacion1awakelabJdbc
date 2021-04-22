package cl.awakelab.simulacion.dao;

import java.util.List;

import cl.awakelab.simulacion.modelo.Agendas;

public interface IAgendasDao {


	List<Agendas> obtenerAgendas(int idespecialidad);

	List<Agendas> obtenerAgendaInicio();

	
}
