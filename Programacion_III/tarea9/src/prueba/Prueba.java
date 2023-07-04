package prueba;
import modelo.Caja_de_Ahorro;
import modelo.Cuenta_Corriente;
import modelo.Cuenta_Universitaria;

public class Prueba{
    public static void main(String[] args) {
        Cuenta_Corriente cc = new Cuenta_Corriente("Juan", 2000);
        cc.depositar(5000);
        if (cc.extraer(7000)) {
            System.out.println("Extraccion exitosa. Saldo cuenta corriente: " + cc.getSaldo());
        }

        Caja_de_Ahorro ca = new Caja_de_Ahorro("María");
        ca.depositar(3000);
        if (ca.extraer(2000)) {
            System.out.println("Extraccion exitosa. Saldo caja de ahorro: " + ca.getSaldo());
        }
        if (ca.extraer(1000)) {
            System.out.println("Extraccion exitosa. Saldo caja de ahorro: " + ca.getSaldo());
        }
        if (ca.extraer(500)) {
            System.out.println("Extraccion exitosa. Saldo caja de ahorro: " + ca.getSaldo());
        }
        if (!ca.extraer(500)) {
            System.out.println("Extraccion no permitida. Saldo caja de ahorro: " + ca.getSaldo());
        }

        Cuenta_Universitaria cu = new Cuenta_Universitaria("Pedro");
        cu.depositar(5000);
        if (cu.extraer(800)) {
            System.out.println("Extraccion exitosa. Saldo cuenta universitaria: " + cu.getSaldo());
        }
        if (!cu.extraer(300)) {
            System.out.println("Extraccion no permitida. Saldo cuenta universitaria: " + cu.getSaldo());
        }
    }
}