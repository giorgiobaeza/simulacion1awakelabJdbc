package cl.awakelab.simulacion.chequeotiempos;

public class AtencionRegular extends Atencion{
	
	private int idEspecialidad;

	
	public AtencionRegular() {
		super();
		// TODO Auto-generated constructor stub
	}


	public AtencionRegular(String paciente, String doctor, int duracion, int idEspecialidad) {
		super(paciente, doctor, duracion);
		this.idEspecialidad = idEspecialidad;
	}


	@Override
	public String toString() {
		return "AtencionRegular [idEspecialidad=" + idEspecialidad + "], datos padre:" + super.toString();
	}


	public int getIdEspecialidad() {
		return idEspecialidad;
	}


	public void setIdEspecialidad(int idEspecialidad) {
		this.idEspecialidad = idEspecialidad;
	}


	@Override
	public int calcularTiempo() {
		int duracion = this.getDuracion();
		if(this.idEspecialidad == 6 || this.idEspecialidad == 4) {
			duracion = 25;
		}else if(this.idEspecialidad == 5 || this.idEspecialidad == 2) {
			duracion = 20;
		} 
		return duracion;
	}
	
	
	
}
