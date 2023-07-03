package Prueba;

import tarea5.Automovil;
import tarea5.Chasis;
import tarea5.Motor;

public class Prueba {

	public static void main(String[] args) {
		Motor m1 = new Motor("M_1234", 2500, "Electrico");
		Chasis c1 = new Chasis("C_1234", 2000);
		
		Automovil a1 = new Automovil("Volkswagen", 2023, m1, c1);
		
		a1.setPrecio(15000000);
		System.out.println(a1);
		double cilindrada = a1.getCilindrada();
		System.out.println(cilindrada);
			
	}

}