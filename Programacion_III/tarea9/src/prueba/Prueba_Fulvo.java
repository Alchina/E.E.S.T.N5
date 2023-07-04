package prueba;
import java.util.Iterator;
import fulvo.Jugador;
import fulvo.Equipo;

public class Prueba_Fulvo{
    public static void main(String[] args) {
        Equipo equipo = new Equipo("Equipo A");

      
        System.out.println(equipo.agregaDelantero("Messi", 0.8, 0.9));
        System.out.println(equipo.agregaDefensor("Di_maria", 0.7, 0.8));
        System.out.println(equipo.agregaArquero("Dibu Martinez", 0.5, 0.8, 1));

     
        Iterator<Jugador> iterador = equipo.getJugadores();
        while (iterador.hasNext()) {
            Jugador jugador = iterador.next();
            System.out.println(jugador);
        }

     
        double indiceDefensa = equipo.indiceDefensa();
        double indiceAtaque = equipo.indiceAtaque();

        System.out.println("Indice de defensa del equipo: " + indiceDefensa);
        System.out.println("Indice de ataque del equipo: " + indiceAtaque);
    }
}
