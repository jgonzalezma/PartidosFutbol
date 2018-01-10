package futbol;

import java.util.ArrayList;
import java.util.Scanner;

public class MainPartido {

	public static void main(String[] args) {
		Partido_Futbol.crearLista("D:/Josu/Programación/partidosfutbol.txt");
		final int INSERTAR = 1;
		final int LISTAR = 2;
		final int ELIMINAR = 3;
		final int SALIR = 0;
		
		Scanner scan = new Scanner(System.in);
		int opcion;
		do {
			System.out.println("--Menu--");
			System.out.println(INSERTAR + " insertar partido");
			System.out.println(LISTAR + " listar partidos");
			System.out.println(ELIMINAR + " eliminar partidos");
			System.out.println(SALIR + " salir");

			opcion = Integer.parseInt(scan.nextLine());

			switch (opcion) {
			case INSERTAR:
				System.out.println("Introduce equipo local");
				String local = scan.nextLine();
				System.out.println("Introduce equipo visitante");
				String visitante = scan.nextLine();
				System.out.println("Introduce goles local");
				String golesLocal = scan.nextLine();
				System.out.println("Introduce goles visitante");
				String golesVisitante = scan.nextLine();
				
				break;
				
			case LISTAR:
				
				break;
				
			case ELIMINAR:
				
				break;
				
			case SALIR:
					System.out.println("Saliendo...");
				break;
		}
			} while (opcion != SALIR);

	}

}
