package cl.awakelab.simulacion.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import cl.awakelab.simulacion.modelo.Especialidades;

public class EspecialidadesDao implements IEspecialidadesDao{

	JdbcTemplate template;
	public void setTemplate(JdbcTemplate template) {
	this.template = template;
	}
	
	
	@Override
	public List<Especialidades> obtenerEspecialidades() {
		String sql = "SELECT idespecialidad, descripcion FROM especialidades ORDER BY descripcion";
		
		return template.query(sql,new RowMapper<Especialidades>(){
			public Especialidades mapRow(ResultSet rs, int row) throws SQLException {
			Especialidades p=new Especialidades();
				p.setIdespecialidad(rs.getInt(1));
				p.setDescripcion(rs.getString(2));
				return p;
			}
		});
	}
	
}
