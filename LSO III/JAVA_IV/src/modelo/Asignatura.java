package modelo;

public class Asignatura {
	
	 private int identificador;
	 private double calificacion;
	
	 
	 public Asignatura(int identificador, double calificacion) {
	    this.identificador = identificador;
	    this.calificacion = calificacion;
	 }
	 
	 public int getIdentificador() {
		return identificador;
	}
	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}
	
	public double getCalificacion() {
		return calificacion;
	}
	
	public void setCalificacion(double calificacion) {
		this.calificacion = calificacion;
	}
	    

}
