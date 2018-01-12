package futbol;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;

public class PartidoFutbol {
	private String local;
	private String visitante;
	private int golesLocal;
	private int golesVisitante;
	
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	public String getVisitante() {
		return visitante;
	}
	public void setVisitante(String visitante) {
		this.visitante = visitante;
	}
	public int getGolesLocal() {
		return golesLocal;
	}
	public void setGolesLocal(int golesLocal) {
		this.golesLocal = golesLocal;
	}
	public int getGolesVisitante() {
		return golesVisitante;
	}
	public void setGolesVisitante(int golesVisitante) {
		this.golesVisitante = golesVisitante;
	}
	public void mostrarInfo(){
		System.out.println("El equipo local es " + getLocal());
		System.out.println("El equipo local es " + getGolesLocal());
		System.out.println("El equipo local es " + getVisitante());
		System.out.println("El equipo local es " + getGolesVisitante());
	}
	public static ArrayList <PartidoFutbol> crearLista(String nombreFichero){
		ArrayList <PartidoFutbol> Partidos = new ArrayList <PartidoFutbol>();
		File f = new File(nombreFichero);
		try {
			Scanner fich = new Scanner(f);
			while (fich.hasNextLine()) {
				String linea = fich.nextLine();
				String partes[] = linea.split(":");
				PartidoFutbol partido = new PartidoFutbol();
				partido.setLocal(partes[0]);
				partido.setVisitante(partes[1]);
				partido.setGolesLocal(Integer.parseInt(partes[2]));
				partido.setGolesVisitante(Integer.parseInt(partes[3]));
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return Partidos;
	
	}
	public static void listarPartidos(String Partidos){
	if (Partidos.isEmpty()) {
		System.out.println("La lista está vacía");
	} else {
		Iterator<PartidoFutbol> i = partido.iterator();
		while (i.hasNext()) {
			PartidoFutbol p = i.next();
			
		}
		
	}

}
}