package ej3;

public class TestBanco {
    public static void main(String[] args) {
        // Crear personas
        Persona persona1 = new Persona();
        persona1.setNombre("Juan");
        persona1.setApellido("Perez");
        persona1.setEdad(30);

        Persona persona2 = new Persona();
        persona2.setNombre("María");
        persona2.setApellido("Gomez");
        persona2.setEdad(25);

        // Crear cuentas corrientes
        CuentaCorriente cuentaCorriente1 = new CuentaCorriente(persona1, 101, 5000);
        CuentaCorriente cuentaCorriente2 = new CuentaCorriente(persona2, 102, 3000);

        // Crear cuentas de ahorro
        CuentaAhorro cuentaAhorro1 = new CuentaAhorro(persona1, 201, 10000, 2.0);
        CuentaAhorro cuentaAhorro2 = new CuentaAhorro(persona2, 202, 15000, 1.5);
        CuentaAhorro cuentaAhorro3 = new CuentaAhorro(persona2, 203, 20000);

        // Imprimir datos de todas las cuentas
        System.out.println("Datos de las cuentas:");
        cuentaCorriente1.imprimirDatos();
        cuentaCorriente2.imprimirDatos();
        cuentaAhorro1.imprimirDatos();
        cuentaAhorro2.imprimirDatos();
        cuentaAhorro3.imprimirDatos();

        // Comparar cuentas
        System.out.println("\nComparación de cuentas:");
        System.out.println("Cuenta Corriente 1 y Cuenta Corriente 2 son iguales: " + cuentaCorriente1.compararCuenta(cuentaCorriente2));
        System.out.println("Cuenta Ahorro 1 y Cuenta Ahorro 2 son iguales: " + cuentaAhorro1.compararCuenta(cuentaAhorro2));

        // Comparar cuentas con un nuevo objeto CuentaAhorro
        CuentaAhorro cuentaAhorroNuevo = new CuentaAhorro(persona1, 201, 10000, 2.0);
        System.out.println("Comparación con cuentaAhorroNuevo: " + cuentaAhorro1.compararCuenta(cuentaAhorroNuevo));

        // Comparar cuentas con un nuevo objeto CuentaCorriente
        CuentaCorriente cuentaCorrienteNuevo = new CuentaCorriente(persona2, 102, 3000);
        System.out.println("Comparación con cuentaCorrienteNuevo: " + cuentaCorriente2.compararCuenta(cuentaCorrienteNuevo));

        // Calcular nuevo saldo con interés
        double nuevoSaldo = cuentaAhorro1.calcularInteres() * 1.155;
        System.out.println("Nuevo saldo con interés aplicado: " + nuevoSaldo);
    }
}

