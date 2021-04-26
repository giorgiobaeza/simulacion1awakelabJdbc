package cl.awakelab.simulacion.chequeotiempos;

public class AtencionUrgencia extends Atencion{

	private int tiempoEspera;
	private int severidad;

	public AtencionUrgencia() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AtencionUrgencia(String paciente, String doctor, int duracion, int tiempoEspera, int severidad) {
		super(paciente, doctor, duracion);
		this.tiempoEspera = tiempoEspera;
		this.severidad = severidad;
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
	public String toString() {
		return "AtencionUrgencia [tiempoEspera=" + tiempoEspera + ", severidad=" + severidad + "], datos padre:" + super.toString();
	}

	
	@Override
	public int calcularTiempo() {
		int duracion = this.getDuracion();
		int tiempo = 0;
		if(this.severidad == 1) {
			tiempo = duracion + 5;
		}else if(this.severidad == 2) {
			tiempo = duracion + 10;
		}else if(this.severidad == 3) {
			tiempo = duracion + 15;
		}
		
		tiempo += this.tiempoEspera;
		
		return tiempo;
	}
	
}
