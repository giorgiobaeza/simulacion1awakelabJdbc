package cl.awakelab.simulacion.chequeotiempos;

import java.util.ArrayList;
import java.util.List;

public class DemoConsola {

	public static void main(String[] args) {
		List<InterfaceAtencion> latenciones = new ArrayList<InterfaceAtencion>();
		AtencionRegular ar1 = new AtencionRegular("PA", "DA", 15, 1) ;
		AtencionRegular ar2 = new AtencionRegular("PB", "DB", 15, 2) ;
		AtencionRegular ar3 = new AtencionRegular("PC", "DC", 15, 4) ;
		AtencionRegular ar4 = new AtencionRegular("PD", "DD", 15, 4) ;
		AtencionRegular ar5 = new AtencionRegular("PE", "DE", 15, 5) ;
		latenciones.add(ar1);
		latenciones.add(ar2);
		latenciones.add(ar3);
		latenciones.add(ar4);
		latenciones.add(ar5);

		AtencionUrgencia au1 = new AtencionUrgencia("PA", "DA", 15, 10, 2) ;
		AtencionUrgencia au2 = new AtencionUrgencia("PB", "DB", 15, 10, 1) ;
		AtencionUrgencia au3 = new AtencionUrgencia("PC", "DC", 15, 15, 3) ;
		latenciones.add(au1);
		latenciones.add(au2);
		latenciones.add(au3);

		int contartiempo = 0;
		int count1 = 0;
		System.out.println("-------------------------------------");
		System.out.println("Demostraci�n algoritmo c�lculo tiempo");
		System.out.println("-------------------------------------");
		System.out.println();
		for(int i=0;i<latenciones.size();i++) {
			if(latenciones.get(i).getClass().getSimpleName().equals("AtencionRegular")) {
				contartiempo += latenciones.get(i).calcularTiempo();
				String especialidad = "";
				if(latenciones.get(i).toString().contains("idEspecialidad=1")) {
					especialidad = "Proctolog�a";
				}else if(latenciones.get(i).toString().contains("idEspecialidad=2")) {
					especialidad = "Gastroenterolog�a";
				}else if(latenciones.get(i).toString().contains("idEspecialidad=3")) {
					especialidad = "Ginecolog�a";
				}else if(latenciones.get(i).toString().contains("idEspecialidad=4")) {
					especialidad = "Neurolog�a";
				}else if(latenciones.get(i).toString().contains("idEspecialidad=5")) {
					especialidad = "Traumatolog�a";
				}else if(latenciones.get(i).toString().contains("idEspecialidad=6")) {
					especialidad = "Cardiolog�a";
				}else if(latenciones.get(i).toString().contains("idEspecialidad=7")) {
					especialidad = "Psiquiatr�a";
				}
				
				System.out.println("Atenci�n Regular " + (1+i) + ": " + especialidad + ", tiempo total " + latenciones.get(i).calcularTiempo() + " minutos");
				System.out.println();
			}
			else {
				count1 += 1;
				String severidad = "";
				contartiempo += latenciones.get(i).calcularTiempo();
				if(latenciones.get(i).toString().contains("severidad=1")) {
					severidad = "severidad tipo 1 (normal)";
				}else if(latenciones.get(i).toString().contains("severidad=2")) {
					severidad = "severidad tipo 2 (grave)";
				}else if(latenciones.get(i).toString().contains("severidad=3")) {
					severidad = "severidad tipo 3 (muy grave)";
				}
				String cadena = latenciones.get(i).toString();
				String[] partes = cadena.split("=");
				String[] te = partes[1].split(",");
				int tiempoespera = Integer.parseInt(te[0]);
				System.out.println("Atenci�n de Urgencia " + count1 + ": Espera de " + tiempoespera + " minutos, " + severidad + ", tiempo total "+ latenciones.get(i).calcularTiempo()  +" minutos");
				System.out.println();
			}
			
		}
		System.out.println("Tiempo total de atenci�n en el d�a: " + contartiempo + " minutos");
		System.out.println();
		if (contartiempo >= 300) {
			System.out.println("Las atenciones del d�a SI superan el umbral establecido por la cl�nica");
		} else {
			System.out.println("Las atenciones del d�a NO superan el umbral establecido por la cl�nica");
		}
		
	}
	
}
