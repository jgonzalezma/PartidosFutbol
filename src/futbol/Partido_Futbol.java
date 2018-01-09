package futbol;

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
}
