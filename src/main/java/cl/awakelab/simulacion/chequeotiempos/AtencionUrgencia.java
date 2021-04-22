package cl.awakelab.simulacion.chequeotiempos;

public class AtencionUrgencia extends Atencion{

	private int tiempoEspera;
	private int severidad;
	
	public AtencionUrgencia(int tiempoEspera, int severidad) {
		super();
		this.tiempoEspera = tiempoEspera;
		this.severidad = severidad;
	}

	public AtencionUrgencia(int tiempoEspera, int severidad, String paciente, String doctor, int duracion) {
		super();
	}

	@Override
	public String toString() {
		return "AtencionUrgencia [tiempoEspera=" + tiempoEspera + ", severidad=" + severidad + "]";
	}

	public int getTiempoEspera() {
		return tiempoEspera;
	}

	public void setTiempoEspera(int tiempoEspera) {
		this.tiempoEspera = tiempoEspera;
	}

	public int getSeveridad() {
		return severidad;
	}

	public void setSeveridad(int severidad) {
		this.severidad = severidad;
	}

	@Override
	public int calcularTiempo() {
		
		return 0;
	}
	
	
}
