package modelo;

public class Alumno {
    private Asignatura M1;
    private Asignatura M2;
    private Asignatura M3;
    private String nombre;
    private String apellido;
    
    public Alumno(Asignatura m1, Asignatura m2, Asignatura m3, String nombre, String apellido) {
        this.M1 = m1;
        this.M2 = m2;
        this.M3 = m3;
        this.nombre = nombre;
        this.apellido = apellido;
    }
	public Asignatura getM1() {
		return M1;
	}
	public void setM1(Asignatura m1) {
		M1 = m1;
	}
	public Asignatura getM2() {
		return M2;
	}
	public void setM2(Asignatura m2) {
		M2 = m2;
	}
	public Asignatura getM3() {
		return M3;
	}
	public void setM3(Asignatura m3) {
		M3 = m3;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
}
