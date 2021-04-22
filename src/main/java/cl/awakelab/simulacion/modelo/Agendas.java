package cl.awakelab.simulacion.modelo;

public class Agendas {

	private String pacientenombre;
	private String doctornombre;
	private String descripcion;
	private String fecha;
	private String horadesde;
	
	public Agendas(String pacientenombre, String doctornombre, String descripcion, String fecha, String horadesde) {
		super();
		this.pacientenombre = pacientenombre;
		this.doctornombre = doctornombre;
		this.descripcion = descripcion;
		this.fecha = fecha;
		this.horadesde = horadesde;
	}
	public Agendas() {
		super();
	}
	@Override
	public String toString() {
		return "Agendas [pacientenombre=" + pacientenombre + ", doctornombre=" + doctornombre + ", descripcion="
				+ descripcion + ", fecha=" + fecha + ", horadesde=" + horadesde + "]";
	}
	public String getPacientenombre() {
		return pacientenombre;
	}
	public void setPacientenombre(String pacientenombre) {
		this.pacientenombre = pacientenombre;
	}
	public String getDoctornombre() {
		return doctornombre;
	}
	public void setDoctornombre(String doctornombre) {
		this.doctornombre = doctornombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getHoradesde() {
		return horadesde;
	}
	public void setHoradesde(String horadesde) {
		this.horadesde = horadesde;
	}
	
}
