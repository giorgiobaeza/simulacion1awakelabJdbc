package cl.awakelab.simulacion.chequeotiempos;

public class AtencionRegular extends Atencion{
	
	private int idEspecialidad;

	public int getIdEspecialidad() {
		return idEspecialidad;
	}

	public void setIdEspecialidad(int idEspecialidad) {
		this.idEspecialidad = idEspecialidad;
	}

	@Override
	public String toString() {
		return "AtencionRegular [idEspecialidad=" + idEspecialidad + "]";
	}

	public AtencionRegular(int idEspecialidad, String paciente, String doctor, int duracion) {
		super();
	}

	public AtencionRegular(int idEspecialidad) {
		super();
		this.idEspecialidad = idEspecialidad;
	}

	@Override
	public int calcularTiempo() {
		
		
		return 0;
	}
	
	
	
}
