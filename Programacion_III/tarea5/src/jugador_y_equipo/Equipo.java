package jugador_y_equipo;

import java.util.ArrayList;

public class Equipo {
	private String nombre;	
	private int yearCreacion;
	private ArrayList<jugador> jugadores= new ArrayList<jugador>();
	
	
	public Equipo(String nombre, int yearCreacion) {
		super();
		this.nombre = nombre;
		this.yearCreacion = yearCreacion;
	}

	public void agregarjugador(jugador jugador) {
		this.jugadores.add(jugador);
	}
	
	public void eliminarjugador(jugador jugador) {
		this.jugadores.remove(jugador);
	}
	
	public int getCantidadjugadores() {
		return this.jugadores.size();
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public int getYearCreacion() {
		return yearCreacion;
	}
	
	public double promedioEdad() {
		double suma= 0;
		double resultado;
		
		for(jugador j : this.jugadores) {
			suma+=j.getEdad();
		}
		resultado = suma/this.jugadores.size();
		
		return resultado;
	}
	
	public double mayorEdad() {
		double cant=0;
		
		for (jugador j : this.jugadores) {
			if(j.getEdad()>=18) {
				cant++;
			}
		}
		return cant;
	}
	
	public double menorEdad() {
		double cant=0;
		for(jugador j : this.jugadores) {
			if(j.getEdad()<18) {
				cant++;
			}
		}
		return cant;
	}
	
	public int efectividadTotal() {
		int efectividad = 0;
		for(jugador j : this.jugadores) {
			efectividad+=j.getEfectividad();
		}
		return efectividad;
	}

	@Override
	public String toString() {
		return "Equipo [nombre=" + nombre + ", yearCreacion=" + yearCreacion + ", jugadores=" + jugadores + "]";
	}
	
}
 