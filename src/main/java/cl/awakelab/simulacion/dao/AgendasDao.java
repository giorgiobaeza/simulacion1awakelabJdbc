package cl.awakelab.simulacion.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import cl.awakelab.simulacion.modelo.Agendas;

public class AgendasDao implements IAgendasDao{

	JdbcTemplate template;
	
	public void setTemplate(JdbcTemplate template) {
	this.template = template;
	}
	
	@Override
	public List<Agendas> obtenerAgendaInicio() {
	String query = "SELECT p.nombre AS pacientenombre, d.nombre AS doctornombre, e.descripcion, a.fecha, a.horadesde\r\n"
			+ "FROM especialidades e\r\n"
			+ "LEFT JOIN doctores d ON e.idespecialidad = d.idespecialidad\r\n"
			+ "LEFT JOIN agendas a ON d.iddoctor = a.iddoctor\r\n"
			+ "LEFT JOIN pacientes p ON p.idpaciente = a.idpaciente\r\n"
			+ "ORDER BY pacientenombre, doctornombre";

		return template.query(query,new RowMapper<Agendas>(){
			public Agendas mapRow(ResultSet rs, int row) throws SQLException {
				Agendas dv=new Agendas();
				dv.setPacientenombre(rs.getString(1));
				dv.setDoctornombre(rs.getString(2));
				dv.setDescripcion(rs.getString(3));
				dv.setFecha(rs.getString(4));
				dv.setHoradesde(rs.getString(5));
				return dv;
			}
		});
	}
	
	@Override
	public List<Agendas> obtenerAgendas(int idespecialidad){
	String query = "SELECT p.nombre AS pacientenombre, d.nombre AS doctornombre, e.descripcion, a.fecha, a.horadesde\r\n"
			+ "FROM especialidades e\r\n"
			+ "LEFT JOIN doctores d ON e.idespecialidad = d.idespecialidad\r\n"
			+ "LEFT JOIN agendas a ON d.iddoctor = a.iddoctor\r\n"
			+ "LEFT JOIN pacientes p ON p.idpaciente = a.idpaciente\r\n"
			+ "where e.idespecialidad = " + idespecialidad
			+ "ORDER BY pacientenombre, doctornombre";
		return template.query(query,new RowMapper<Agendas>(){
			public Agendas mapRow(ResultSet rs, int row) throws SQLException {
				Agendas dv = new Agendas();
			dv.setPacientenombre(rs.getString(1));
			dv.setDoctornombre(rs.getString(2));
			dv.setDescripcion(rs.getString(3));
			dv.setFecha(rs.getString(4));
			dv.setHoradesde(rs.getString(5));
				return dv;
			}
		});
	}

}
