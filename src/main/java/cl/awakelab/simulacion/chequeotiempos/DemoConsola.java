package cl.awakelab.simulacion.chequeotiempos;

public class DemoConsola {

	public static void main(String[] args) {
		Atencion at[] = new Atencion[10];
		at[0] = new AtencionRegular(1, "PP", "DD", 15) ;
		at[1] = new AtencionRegular(2) ;
		at[2] = new AtencionRegular(3) ;
		at[3] = new AtencionRegular(4) ;
		at[4] = new AtencionRegular(5) ;
		at[5] = new AtencionUrgencia(5, 3, "PP", "DD", 15) ;
		at[6] = new AtencionUrgencia(5, 1) ;
		at[7] = new AtencionUrgencia(5, 2) ;
		at[8] = new AtencionUrgencia(5, 2) ;
		at[9] = new AtencionUrgencia(5, 3) ;

		System.out.println();
	}

}
