package futbol;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class MainPartido {

	public static void main(String[] args) {
		ArrayList <Partido_Futbol> lista = new ArrayList <Partido_Futbol>();
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
				System.out.println("Introduce un equipo para eliminar el partido");
				String eliminarPartido = scan.nextLine();
				break;
				
			case SALIR:
					System.out.println("Saliendo...");
				break;
		}
			} while (opcion != SALIR);

	}
	public void guardarLista(){
	FileWriter fileWriter = null;

	try {
		fileWriter = new FileWriter(ArrayList<Partido_Futbol> Partidos, String nombreFichero);

		PrintWriter printWriter = new PrintWriter(fileWriter);

		Iterator<Partido_Futbol> it = Partidos.iterator();
		while (it.hasNext()) {
			Persona persona = it.next();
			printWriter.println(persona.getStringGuardado());

		}
		fileWriter.close();
	} catch (IOException e) {
		
		e.printStackTrace();
	}}
}
