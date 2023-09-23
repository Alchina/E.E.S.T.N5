package unidad1;

public class Prueba{
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("Alsina", "Tomas", 17, 47381298, "6_4ta", 2023);
        Estudiante estudiante2 = new Estudiante("Gonzales", "Pablo", 18, 46296846, "6_4ta", 2023);
        Estudiante estudiante3 = new Estudiante("Ayrton", "Stuffano", 18, 46978416, "6_4ta", 2023);

        Profesor profesor1 = new Profesor("Paola", "flament", 43, 34913725, 10, 15);
       

        System.out.println("Datos del estudiantes:");
        System.out.println(estudiante1.misDatos());
        System.out.println(estudiante2.misDatos());
        System.out.println(estudiante3.misDatos());


        System.out.println("Datos del Profesor 1:");
        System.out.println(profesor1.misDatos());
    }
}
