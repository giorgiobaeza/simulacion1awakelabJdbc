package cl.awakelab.simulacion.chequeotiempos;

public class Atencion implements InterfaceAtencion{

	private String paciente;
	private String doctor;
	private int duracion;
	
	public String getPaciente() {
		return paciente;
	}


	public void setPaciente(String paciente) {
		this.paciente = paciente;
	}


	public String getDoctor() {
		return doctor;
	}


	public void setDoctor(String doctor) {
		this.doctor = doctor;
	}


	public int getDuracion() {
		return duracion;
	}


	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}


	@Override
	public String toString() {
		return "Atencion [paciente=" + paciente + ", doctor=" + doctor + ", duracion=" + duracion + "]";
	}


	public Atencion() {
		super();
	}


	public Atencion(String paciente, String doctor, int duracion) {
		super();
		this.paciente = paciente;
		this.doctor = doctor;
		this.duracion = duracion;
	}
	

	public int calcularTiempo() {
		// TODO Auto-generated method stub
		return 0;
	}


}
