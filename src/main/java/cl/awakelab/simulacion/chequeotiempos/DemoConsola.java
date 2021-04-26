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
				System.out.println(((AtencionRegular) latenciones.get(i)).getIdEspecialidad());
				switch(((AtencionRegular) latenciones.get(i)).getIdEspecialidad()) {
					case 1: especialidad = "Proctolog�a";
					break;
					case 2: especialidad = "Gastroenterolog�a";
					break;
					case 3: especialidad = "Ginecolog�a";
					break;
					case 4: especialidad = "Neurolog�a";
					break;
					case 5: especialidad = "Traumatolog�a";
					break;
					case 6: especialidad = "Cardiolog�a";
					break;
					case 7: especialidad = "Psiquiatr�a";
				}
				
				System.out.println("Atenci�n Regular " + (1+i) + ": " + especialidad + ", tiempo total " + latenciones.get(i).calcularTiempo() + " minutos");
				System.out.println();
			}
			else {
				count1 += 1;
				String severidad = "";
				System.out.println(((AtencionUrgencia) latenciones.get(i)).getSeveridad());

				contartiempo += latenciones.get(i).calcularTiempo();
				switch(((AtencionUrgencia) latenciones.get(i)).getSeveridad()) {
				case 1: severidad = "severidad tipo 1 (normal)";
				break;
				case 2: severidad = "severidad tipo 2 (grave)";
				break;
				case 3: severidad = "severidad tipo 3 (muy grave)";
				}
				
				System.out.println("Atenci�n de Urgencia " + count1 + ": Espera de " + ((AtencionUrgencia) latenciones.get(i)).getTiempoEspera() + " minutos, " + severidad + ", tiempo total "+ latenciones.get(i).calcularTiempo()  +" minutos");
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
