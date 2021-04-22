package cl.awakelab.simulacion.modelo;

public class Especialidades {
	
	private int idespecialidad;
	private String descripcion;
	
	public Especialidades() {
		super();
	}

	public Especialidades(int idespecialidad, String descripcion) {
		super();
		this.idespecialidad = idespecialidad;
		this.descripcion = descripcion;
	}

	public int getIdespecialidad() {
		return idespecialidad;
	}

	public void setIdespecialidad(int idespecialidad) {
		this.idespecialidad = idespecialidad;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "Especialidades [idespecialidad=" + idespecialidad + ", descripcion=" + descripcion + "]";
	}

}
