package modelo;

public class Profesor {	
    private String apellido = "";
    private String nombre = "";
    private String asignatura = "";
	
    
    public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getAsignatura() {
		return asignatura;
	}
	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}
    public void ponerNotas(Alumno a) {
        a.getM1().setCalificacion(Math.random() * 10); 
        a.getM2().setCalificacion(Math.random() * 10);
        a.getM3().setCalificacion(Math.random() * 10); 
    }

    public double calcularPromedio(Alumno a) {
        double promedio = (a.getM1().getCalificacion() + a.getM2().getCalificacion() + a.getM3().getCalificacion()) / 3;
        return promedio;
    }
}
