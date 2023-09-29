package ej3;

public class CuentaAhorro extends CuentaCorriente {
    private double interes = 2.5;

    public CuentaAhorro(Persona titular, int nroCuenta, double saldoInicial, double interes) {
        super(titular, nroCuenta, saldoInicial);
        this.interes = interes;
    }

    public CuentaAhorro(Persona titular, int nroCuenta, double saldoInicial) {
        super(titular, nroCuenta, saldoInicial);
    }

    public CuentaAhorro(Persona titular, int nroCuenta) {
        super(titular, nroCuenta);
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public double calcularInteres() {
        return getSaldo() * (1 + interes / 100);
    }

    public double calcularInteres(double tasaDeInteres) {
        return getSaldo() * (1 + tasaDeInteres / 100);
    }

    public void imprimirDatos() {
        super.imprimirDatos();
        System.out.println("Interés: " + interes + "%");
    }
}
