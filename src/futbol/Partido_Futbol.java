package futbol;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Partido_Futbol {
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
	public static ArrayList <Partido_Futbol> crearLista(String nombreFichero){
		ArrayList <Partido_Futbol> Partidos = new ArrayList <Partido_Futbol>();
		File f = new File(nombreFichero);
		try {
			Scanner fich = new Scanner(f);
			while (fich.hasNextLine()) {
				String linea = fich.nextLine();
				String partes[] = linea.split(":");
				Partido_Futbol Partido = new Partido_Futbol();
				Partido.setLocal(partes[0]);
				Partido.setVisitante(partes[1]);
				Partido.setGolesLocal(Integer.parseInt(partes[2]));
				Partido.setGolesVisitante(Integer.parseInt(partes[3]));
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return Partidos;
	
	}
	
	//public void crearPartido(String local, String visitante, int golesLocal, int golesVisitante){
		//this.local = local;
		//this.visitante = visitante;
		//this.golesLocal = golesLocal;
		//this.golesVisitante = golesVisitante;
	}

