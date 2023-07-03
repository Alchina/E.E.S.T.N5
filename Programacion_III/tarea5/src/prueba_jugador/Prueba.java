package prueba_jugador;


import jugador_y_equipo.Equipo;
import jugador_y_equipo.jugador;

public class Prueba {

    public static void main(String[] args) {

        Equipo e1 = new Equipo("Porcinos FC", 1995);
        jugador jugador1 = new jugador("Matias", 17, "Defensor", 10);
        jugador jugador2 = new jugador("Ariel", 17, "Defensor", 1);
        jugador jugador3 = new jugador("Nacho", 17, "Defensor", 4);
        jugador jugador4 = new jugador("Luca", 17, "Defensor", 7);
        jugador jugador5 = new jugador("Alan", 17, "Defensor", 2);
        jugador jugador6 = new jugador("Tomas", 17, "Defensor", 5);
        
        e1.agregarjugador(jugador1);
        e1.agregarjugador(jugador2);
        e1.agregarjugador(jugador3);
        e1.agregarjugador(jugador4);
        e1.agregarjugador(jugador5);
        e1.agregarjugador(jugador6);

        System.out.println("Equipo antes de eliminar un jugador:");
        System.out.println(e1);
        System.out.println("Cantidad de jugadores: " + e1.getCantidadjugadores());
        
        System.out.println(e1.promedioEdad());
		System.out.println(e1.mayorEdad());
		System.out.println(e1.menorEdad());
		System.out.println(e1.efectividadTotal());


        e1.eliminarjugador(jugador3);
        System.out.println("Equipo después de eliminar un jugador:");
        System.out.println(e1);
        System.out.println("Cantidad de jugadores: " + e1.getCantidadjugadores());
        
        System.out.println(e1.promedioEdad());
		System.out.println(e1.mayorEdad());
		System.out.println(e1.menorEdad());
		System.out.println(e1.efectividadTotal());
    }
}